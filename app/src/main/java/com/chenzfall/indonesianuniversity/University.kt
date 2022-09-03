package com.chenzfall.indonesianuniversity

import android.os.Parcel
import android.os.Parcelable

data class University(
    var name: String? = "",
    var preview: String? ="",
    var logo: Int = 0,
    var alamat: String? = "",
    var tipe: String? = "",
    var status: String? = "",
    var profil: String? = "",
    var sejarah: String? = "",
    var picture: Int = 0
) :Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readInt()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(preview)
        parcel.writeInt(logo)
        parcel.writeString(alamat)
        parcel.writeString(tipe)
        parcel.writeString(status)
        parcel.writeString(profil)
        parcel.writeString(sejarah)
        parcel.writeInt(picture)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<University> {
        override fun createFromParcel(parcel: Parcel): University {
            return University(parcel)
        }

        override fun newArray(size: Int): Array<University?> {
            return arrayOfNulls(size)
        }
    }
}
