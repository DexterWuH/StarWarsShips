package com.example.apiexample.data

import com.google.gson.annotations.SerializedName

data class Starship(
    val name: String,
    @SerializedName("passengers")
    val passengerCapacity: String,
    val manufacturer: String
)