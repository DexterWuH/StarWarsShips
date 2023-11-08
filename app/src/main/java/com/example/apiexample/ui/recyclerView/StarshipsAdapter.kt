package com.example.apiexample.ui.recyclerView

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.apiexample.data.Starship
import com.example.apiexample.databinding.StarshipViewholderBinding

class StarshipsAdapter: RecyclerView.Adapter<StarshipViewHolder>() {

    private val ships: MutableList<Starship> = mutableListOf()

    @SuppressLint("NotifyDataSetChanged")
    fun addStarships(newShips: List<Starship>) {
        ships.clear()
        ships.addAll(newShips)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StarshipViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = StarshipViewholderBinding.inflate(inflater, parent, false)
        return StarshipViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return ships.size
    }

    override fun onBindViewHolder(holder: StarshipViewHolder, position: Int) {
        val ship = ships[position]
        holder.onBindViewHolder(ship)
    }
}