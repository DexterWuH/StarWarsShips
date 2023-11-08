package com.example.apiexample.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.apiexample.data.Starship
import com.example.apiexample.databinding.FragmentMainBinding
import com.example.apiexample.ui.recyclerView.StarshipsAdapter

class MainFragment : Fragment(), AvailableStarshipsListener {

    private var _binding: FragmentMainBinding? = null
    private val binding: FragmentMainBinding by lazy { _binding!! }
    private val adapter = StarshipsAdapter()
    private val presenter = MainPresenter(this)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
        presenter.getMoreStarships()
    }

    private fun setupRecyclerView() {
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
    }

    override fun onStarshipsAvailable(ships: List<Starship>) {
        adapter.addStarships(ships)
    }

    override fun onNoStarshipsAvailable() {
        adapter.addStarships(listOf())
    }
}

