package com.example.golpe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.golpe.adapter.NewsAdapter
import com.example.golpe.const.Layout
import com.example.golpe.databinding.ActivityVerticalNewsBinding

class NewsActivityList : AppCompatActivity() {
    private lateinit var binding : ActivityVerticalNewsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerticalNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.verticalRecyclerViewNews.adapter = NewsAdapter(
            applicationContext,
            Layout.VERTICAL
        )
        // Specify fixed size to improve performance
        binding.verticalRecyclerViewNews.setHasFixedSize(true)

        // Enable up button for backward navigation
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}