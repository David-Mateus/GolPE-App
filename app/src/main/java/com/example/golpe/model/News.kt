package com.example.golpe.model

import androidx.annotation.DrawableRes

data class News(
    @DrawableRes
    val imageResourceId: Int,
    val title: String,
    val date: String,
    val text: String
)