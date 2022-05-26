package com.aziz.buttomproject.Model

import android.os.Parcel
import android.os.Parcelable

data class ModelPrestasi(
    var namaPrestasi: String? = "",
    var deskPrestasi: String? = "",
    var gmbrPrestasi: Int = 0

) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readInt()

    )


    override fun describeContents(): Int {
        return 0
    }


    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(namaPrestasi)
        parcel.writeString(deskPrestasi)
        parcel.writeInt(gmbrPrestasi)

    }

    companion object CREATOR : Parcelable.Creator<ModelGallery> {
        override fun createFromParcel(parcel: Parcel): ModelGallery {
            return ModelGallery(parcel)
        }

        override fun newArray(size: Int): Array<ModelGallery?> {
            return arrayOfNulls(size)

        }

    }
}


