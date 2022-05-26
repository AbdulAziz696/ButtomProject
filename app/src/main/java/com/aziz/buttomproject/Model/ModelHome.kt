package com.aziz.buttomproject.Model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ModelHome(

    var namaHome: String? = "",
    var deskHome: String? = "",
    var gmbrHome: Int = 0
) : Parcelable {
}
