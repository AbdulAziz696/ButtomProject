package com.aziz.buttomproject.Model

import android.os.Parcel
import android.os.Parcelable

data class ModelGallery(

    var namaGallery: String? = "",
    var deskGallery: String? = "",
    var gmbrGallery: Int = 0
) : Parcelable {

    constructor(parcel: Parcel) : this(

        parcel.readString(),
        parcel.readString(),
        parcel.readInt()

    ) {
    }

    override fun describeContents(): Int {

        return 0
    }


    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(namaGallery)
        parcel.writeString(deskGallery)
        parcel.writeInt(gmbrGallery)

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



