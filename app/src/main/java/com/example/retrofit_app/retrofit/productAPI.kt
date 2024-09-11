package com.example.retrofit_app.retrofit

import retrofit2.http.GET

interface ProductAPI {
    @GET("products/1")
    fun getProductById(): Product
}