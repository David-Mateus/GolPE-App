package com.example.golpe.model

import androidx.annotation.DrawableRes

data class Estadio (
    @DrawableRes
    val imageResourceId: Int,
    val name: String,
    val age: String,
    val capacity: String
)