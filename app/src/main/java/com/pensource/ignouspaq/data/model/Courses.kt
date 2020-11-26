package com.pensource.ignouspaq.data.model

import com.google.gson.annotations.SerializedName


data class Courses(
    @SerializedName("majorDimension")
    val majorDimension: String,
    @SerializedName("range")
    val range: String,
    @SerializedName("values")
    val values: List<List<String>>
)