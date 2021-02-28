package com.example.androiddevchallenge.utils

import androidx.annotation.DrawableRes

data class Puppy(
    val name: String,
    val age: String,
    val breed: String,
    @DrawableRes val dogImage: Int,
)