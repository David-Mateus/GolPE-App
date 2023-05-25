package com.example.golpe


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.golpe.databinding.ActivitySecondBinding


class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    private lateinit var listIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Setup view binding
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Launch the VerticalListActivity on verticalBtn click
        binding.btnTime.setOnClickListener { launchVertical() }

        // Launch the HorizontalListActivity on horizontalBtn click
        binding.btnNoticias.setOnClickListener { launchHorizontal() }
//
        // Launch the GridListActivity on gridBtn click
        binding.button3.setOnClickListener { launchGrid() }
    }

    private fun launchVertical() {
        listIntent = Intent(this, VerticalListActivity::class.java)
        startActivity(listIntent)
    }

    private fun launchHorizontal() {
        listIntent = Intent(this, NewsActivityList::class.java)
        startActivity(listIntent)
    }
//
    private fun launchGrid() {
        listIntent = Intent(this, EstadioActivity::class.java)
        startActivity(listIntent)
    }
}