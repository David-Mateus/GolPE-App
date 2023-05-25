package com.example.golpe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.golpe.adapter.EstadioAdapter

import com.example.golpe.const.Layout
import com.example.golpe.databinding.ActivitStadioGridBinding

class EstadioActivity : AppCompatActivity() {

    private lateinit var binding: ActivitStadioGridBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitStadioGridBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.gridRecyclerView.adapter = EstadioAdapter(
            applicationContext,
            Layout.GRID
        )

        // Specify fixed size to improve performance
        binding.gridRecyclerView.setHasFixedSize(true)

        // Enable up button for backward navigation
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}