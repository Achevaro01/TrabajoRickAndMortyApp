package com.alvaroherrera.trabajorickandmortyapp.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Data(
    val name: String,
    val url: String
) : Parcelable