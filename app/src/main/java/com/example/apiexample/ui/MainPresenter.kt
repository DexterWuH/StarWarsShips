package com.example.apiexample.ui

import com.example.apiexample.data.Starship
import com.example.apiexample.repositories.StarshipRepo
import com.example.apiexample.repositories.StarshipsRepositoryContract
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainPresenter(
    private val listener: AvailableStarshipsListener,
    private val repo: StarshipsRepositoryContract = StarshipRepo()
) {
    fun getMoreStarships() {
        CoroutineScope(Dispatchers.IO).launch {
            val ships = repo.getAllStarships()
            CoroutineScope(Dispatchers.Main).launch {
                listener.onStarshipsAvailable(ships)
            }
        }
    }
}

interface AvailableStarshipsListener {
    fun onStarshipsAvailable(ships: List<Starship>)
    fun onNoStarshipsAvailable()
}