package com.example.apiexample.network

import com.example.apiexample.data.Starship
import com.example.apiexample.data.StarshipsResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface StarWarsApi {

    @GET("starships")
    suspend fun getAllStarships(): StarshipsResponse

    @GET("starships/{id}")
    suspend fun getStarshipById(@Path("id") id: Int): Starship

}