package com.example.apiexample.repositories

import com.example.apiexample.data.Starship

interface StarshipsRepositoryContract {
    suspend fun getAllStarships(): List<Starship>
}