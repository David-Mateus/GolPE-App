package com.example.golpe.model

import androidx.annotation.DrawableRes

data class Times (
    @DrawableRes
    val imageResourceId: Int,
    val name: String,
    val age: String,
    val estadio: String

)