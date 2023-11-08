package com.example.apiexample.repositories

import com.example.apiexample.data.Starship
import com.example.apiexample.network.RetrofitModule.api

class StarshipRepo: StarshipsRepositoryContract {

    override suspend fun getAllStarships(): List<Starship> {
        return api.getAllStarships().results
    }
}