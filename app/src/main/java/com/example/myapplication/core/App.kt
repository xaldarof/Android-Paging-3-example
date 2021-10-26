package com.example.myapplication.core

import android.app.Application
import com.example.myapplication.di.cacheModule
import com.example.myapplication.di.cloudModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(cloudModule, cacheModule)
        }
    }
}