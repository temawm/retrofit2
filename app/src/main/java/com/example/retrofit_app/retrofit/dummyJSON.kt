package com.example.retrofit_app.retrofit
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

suspend fun getProductById(id: Int): Product {
    val retrofit = Retrofit.Builder()
        .baseUrl("https://dummyjson.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val productApi = retrofit.create(ProductAPI::class.java)

    return productApi.getProductById(id)
}

fun dummyJSON() {
    CoroutineScope(Dispatchers.Main).launch {
        try {
            val product = withContext(Dispatchers.IO) {
                getProductById(1)
            }
            Log.d("Product", product.description)
        } catch (e: Exception) {
            Log.d("Exception", e.toString())
        }
    }
}
