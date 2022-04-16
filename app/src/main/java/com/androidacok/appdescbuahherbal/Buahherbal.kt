package com.androidacok.appdescbuahherbal

import android.os.Parcelable
import android.view.View
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Buahherbal(
    val imgBuahherbal: Int,
    val nameBuahherbal: String,
    val descBuahherbal: String
): Parcelable