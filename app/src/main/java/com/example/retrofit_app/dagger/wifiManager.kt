package com.example.retrofit_app.dagger

import android.util.Log
import javax.inject.Inject

class AppWifiManager @Inject constructor(private val settings: AppWifiSettings) {
    fun startConnection() {
        settings.openConnection()
        Log.d("WifiManager", "Started Wi-Fi connection")
    }
    fun stopConnection() {
        Log.d("WifiManager", "Stopped Wi-Fi connection")
        settings.closeConnection()
    }
}