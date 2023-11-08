package com.example.apiexample.ui.recyclerView

import androidx.recyclerview.widget.RecyclerView
import com.example.apiexample.data.Starship
import com.example.apiexample.databinding.StarshipViewholderBinding

class StarshipViewHolder(
    private val binding: StarshipViewholderBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun onBindViewHolder(data: Starship) {
        binding.shipName.text = data.name
        binding.shipCapacity.text = data.passengerCapacity
        binding.shipManufacturer.text = data.manufacturer
    }
}