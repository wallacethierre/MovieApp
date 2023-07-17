package com.djaca.android.moviesapp.data.api.dto

import com.google.gson.annotations.SerializedName;
data class MovieResponse(
    val id: String,
    val title: String,
    val description: String,
    @SerializedName("image") val imageURL: String,
    val category: String
)
