package mumtaz.binar.challangechaptertiga

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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val datauser = arguments?.getString("NAMA")
        tv_user.text = datauser


        keempat.setOnClickListener {
            val datanama = bundleOf("NAMADUA" to datauser)
            Navigation.findNavController(view).navigate(R.id.action_tigaFragment_to_empatFragment2, datanama)


        }

        val datanamadua = arguments?.getString("NAMATIGA")
        tv_userr.text = datanamadua
        val dataumur = arguments?.getString("UMUR")
        tv_usiaa.text = dataumur

        val keterangan = arguments?.getString("KETERANGAN")
        tv_ket.text = keterangan

        val datalamat = arguments?.getString("ALAMAT")
        tv_alamatt.text = datalamat

        val datakerja = arguments?.getString("PEKERJAAN")
        tv_pekerjaann.text = datakerja


    }


}