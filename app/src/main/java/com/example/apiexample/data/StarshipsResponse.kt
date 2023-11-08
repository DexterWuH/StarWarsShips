package com.example.apiexample.data

data class StarshipsResponse(
    val count: Int,
    val next: String,
    val previous: String?,
    val results: List<Starship>
)