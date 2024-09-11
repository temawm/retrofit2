package com.example.retrofit_app.retrofit

import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

fun dummyJSON() {
    val retrofit = Retrofit.Builder()
        .baseUrl("https://dummyjson.com")
        .addConverterFactory(GsonConverterFactory.create()).build()
    val productApi = retrofit.create(ProductAPI::class.java)
    CoroutineScope(Dispatchers.IO).launch {
        val product = productApi.getProductById()
        Log.d("Product", product.toString())
    }
}