package com.example.myproject1

import android.app.Application
import com.example.myproject1.data.network.networkModule
import com.example.myproject1.di.repoModule
import com.example.myproject1.di.viewModelModule
import org.koin.core.context.startKoin

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(listOf(networkModule, repoModule, viewModelModule))
        }
    }
}