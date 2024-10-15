package com.example.retrofit_app.dagger

import android.util.Log
import javax.inject.Inject

class AppWifiSettings @Inject constructor(){
    fun openConnection() {
        // Open Wi-Fi connection
        Log.d("WifiSettings", "Opening Wi-Fi connection")
    }
    fun closeConnection() {
        // Close Wi-Fi connection
        Log.d("WifiSettings", "Closing Wi-Fi connection")
    }
}
