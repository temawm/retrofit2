package com.example.retrofit_app.retrofit

data class Product(
    val id: Int,
    val title: String,
    val description: String,
    val price: Float,
    val discount: Float,
    val rating: Float,
    val stock: Float,
    val brand: String,
    val category: String,
    val thumbnail: String,
    val images: List<String>
)
