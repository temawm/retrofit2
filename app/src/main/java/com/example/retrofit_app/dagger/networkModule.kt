package com.example.retrofit_app.dagger

import android.content.Context
import android.net.wifi.WifiManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    fun provideWifiManager(settings: AppWifiSettings): AppWifiManager {
        return AppWifiManager(settings)
    }

    @Provides
    fun provideWifiSettings(): AppWifiSettings {
        return AppWifiSettings()
    }
}
