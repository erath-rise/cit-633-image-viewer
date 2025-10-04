package com.example.imageviewer.model

data class ImageItem(
    val id: Int,
    val title: String,
    val description: String,
    val imageResId: Int,
    val category: String,
    val director: String = "Unknown"
)