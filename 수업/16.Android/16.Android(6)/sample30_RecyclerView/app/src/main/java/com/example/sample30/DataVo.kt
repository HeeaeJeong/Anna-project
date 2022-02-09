package com.example.sample30

import android.os.Parcel
import android.os.Parcelable

class DataVo(val name:String?, val id:String?, val address:String?, val pay:Int, val photo:String?) : Parcelable {
    constructor(parcel:Parcel) :this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readString()
    ){}

    override fun writeToParcel(parcel: Parcel, p1: Int) {
        parcel.writeString(name)
        parcel.writeString(id)
        parcel.writeString(address)
        parcel.writeInt(pay)
        parcel.writeString(photo)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<DataVo>{
        override fun createFromParcel(parcel: Parcel): DataVo {
            return DataVo(parcel)
        }

        override fun newArray(size: Int): Array<DataVo?> {
            return  arrayOfNulls(size)
        }
    }
}








