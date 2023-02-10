package com.example.flixsterplus

import com.google.gson.annotations.SerializedName

class Movie {
    @JvmField
    @SerializedName("title")
    var title: String? = null

    @JvmField
    @SerializedName("backdrop_path")
    var imageBackdropPath: String? = null

    @JvmField
    @SerializedName("poster_path")
    var imagePosterPath: String? = null

    @JvmField
    @SerializedName("overview")
    var description: String? = null
}