package mumtaz.binar.challangechaptertiga

import java.io.Serializable

data class Serial(
    val name : String,
    val umur: Int,
    val keterangan: String,
    val alamat: String,
    val pekerjaan: String) : Serializable
