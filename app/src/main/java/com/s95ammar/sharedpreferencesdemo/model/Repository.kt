package com.s95ammar.sharedpreferencesdemo.model

import android.content.Context
import com.s95ammar.sharedpreferencesdemo.SharedPreferencesDemoApplication

object Repository {

    private val mySharedPreferences = SharedPreferencesDemoApplication.instance
        .getSharedPreferences(
            "${SharedPreferencesDemoApplication.instance.packageName}.MY_FILE",
            Context.MODE_PRIVATE
        )

    fun addString(key: String, value: String) {
        mySharedPreferences.edit().putString(key, value).apply()
    }

    fun getString(key: String, defValue: String): String? {
        return mySharedPreferences.getString(key, defValue)
    }
}