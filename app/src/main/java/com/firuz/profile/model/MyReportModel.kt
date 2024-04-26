package com.firuz.profile.model

import android.graphics.Color


data class MyReportModel(
    val image: Int,
    val icon: Int,
    val title: String,
    val subtitle: String,
    val isFavorite: Boolean = false,
)
