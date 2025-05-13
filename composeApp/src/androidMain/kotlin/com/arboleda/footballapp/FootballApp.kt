package com.arboleda.footballapp

import android.app.Application
import com.arboleda.footballapp.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

class FootballApp : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidLogger()
            androidContext(this@FootballApp)
        }
    }
}
