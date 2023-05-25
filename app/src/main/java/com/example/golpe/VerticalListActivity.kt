package com.example.golpe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.golpe.adapter.TimesAdapter
import com.example.golpe.const.Layout
import com.example.golpe.databinding.ActivityVerticalListBinding

class VerticalListActivity : AppCompatActivity() {
    private lateinit var binding : ActivityVerticalListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerticalListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.verticalRecyclerView.adapter = TimesAdapter(
            applicationContext,
            Layout.VERTICAL
        )
        // Specify fixed size to improve performance
        binding.verticalRecyclerView.setHasFixedSize(true)

        // Enable up button for backward navigation
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}