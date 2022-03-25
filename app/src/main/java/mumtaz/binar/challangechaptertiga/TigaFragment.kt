package mumtaz.binar.challangechaptertiga

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_tiga.*


class TigaFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tiga, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (arguments?.containsKey("USERDATA") == true){
            val datauser = arguments?.getParcelable<DataUser>("USERDATA")
            val nama = datauser?.nama
            val usia = datauser?.usia
            val alamat = datauser?.alamat
            val pekerjaan = datauser?.pekerjaan
            val ket = if (usia?.rem(2) == 0){
                "Genap"
            }else{
                "Ganjil"
            }
            tv_user.text = "Nama Saya : $nama\n" +
                    "Usia : $usia, $ket\n" +
                    "Alamat : $alamat\n" +
                    "Pekerjaan : $pekerjaan"
        }else{
            val nama = arguments?.getString("NAMA")
            tv_user.setText("Nama saya : $nama")
        }


        keempat.setOnClickListener {
            val nama = if (arguments?.containsKey("USERDATA") == true){
                arguments?.getParcelable<DataUser>("NAMA")
            }else{
                arguments?.getString("NAMA")
            }
            val kirimnama = bundleOf("NAMA" to nama)
            Navigation.findNavController(view).navigate(R.id.action_tigaFragment_to_empatFragment2, kirimnama)

        }



    }


}