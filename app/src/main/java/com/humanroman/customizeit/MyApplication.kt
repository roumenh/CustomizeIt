package com.humanroman.customizeit

import android.app.Application
import com.humanroman.customizeit.di.appModule
import com.humanroman.customizeit.di.networkModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApplication)
            androidLogger()
            modules(appModule, networkModule)
        }
    }

}