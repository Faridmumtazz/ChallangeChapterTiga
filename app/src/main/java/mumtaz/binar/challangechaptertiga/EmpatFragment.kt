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
            val username = arguments?.getString("NAMADUA")
            val umur = et_usia.text.toString().toInt()
            val alamat = et_alamat.text.toString()
            val pekerjaan = et_pekerjaan.text.toString()
            val keterangan = if (umur!!.toInt() % 2 == 0){
                "Genap"
            }else {
                 "Ganjil"
            }

            val data = bundleOf("UMUR" to umur.toString(), "NAMATIGA" to username, "ALAMAT" to alamat, "PEKERJAAN" to pekerjaan, "KETERANGAN" to keterangan)


            Navigation.findNavController(view).navigate(R.id.action_empatFragment2_to_tigaFragment, data)
        }
    }


}