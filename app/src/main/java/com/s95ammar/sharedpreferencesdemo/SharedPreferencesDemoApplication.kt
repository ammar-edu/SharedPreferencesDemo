package com.s95ammar.sharedpreferencesdemo

import android.app.Application

class SharedPreferencesDemoApplication : Application() {

    companion object {
        private var _instance: SharedPreferencesDemoApplication? = null
        val instance
            get() = _instance!!
    }

    override fun onCreate() {
        super.onCreate()
        _instance = this
    }
}