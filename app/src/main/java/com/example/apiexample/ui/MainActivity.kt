package com.example.apiexample.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apiexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding: ActivityMainBinding by lazy { _binding!!}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setInitialFragment()
    }

    private fun setInitialFragment() {
        val fragment = MainFragment()
        supportFragmentManager
            .beginTransaction()
            .add(binding.fragmentContainer.id, fragment)
            .commit()
    }
}