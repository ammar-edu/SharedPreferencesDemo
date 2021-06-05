package com.s95ammar.sharedpreferencesdemo.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.s95ammar.sharedpreferencesdemo.model.Repository

class MainViewModel : ViewModel() {

    private val _string = MutableLiveData<String>()

    val string: LiveData<String> = _string

    fun addString(key: String, value: String) {
        Repository.addString(key, value)
    }

    fun loadString(key: String, defValue: String) {
        _string.value = Repository.getString(key, defValue)
    }

}