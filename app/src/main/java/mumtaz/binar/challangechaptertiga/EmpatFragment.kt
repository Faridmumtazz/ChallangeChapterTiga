package mumtaz.binar.challangechaptertiga

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_empat.*
import kotlinx.android.synthetic.main.fragment_tiga.*


class EmpatFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_empat, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        goback.setOnClickListener {
            if (et_usia.text.isNotEmpty() && et_alamat.text.isNotEmpty() && et_pekerjaan.text.isNotEmpty()){
                if (et_usia.text.toString().all { Character.isDigit(it) }){
                    val nama = arguments?.getString("NAMA")
                    val usia = et_usia.text.toString().toInt()
                    val alamat = et_alamat.text.toString()
                    val pekerjaan = et_pekerjaan.text.toString()
                    val getData = DataUser(nama, usia, alamat, pekerjaan)
                    val sendData = bundleOf("USERDATA" to getData)
                    Navigation.findNavController(view).navigate(R.id.action_empatFragment2_to_tigaFragment, sendData)
                }else{
                    " Gagal "
                }

            }else{
                " Gagal "
            }

        }
    }


}