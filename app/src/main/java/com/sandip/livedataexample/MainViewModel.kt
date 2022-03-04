package com.sandip.livedataexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {

    private var mutableLiveDataObject = MutableLiveData<String>("Cristiano Ronaldo")

    val mutableLiveData: LiveData<String> get() = mutableLiveDataObject

    fun UpdateData() {
        mutableLiveDataObject.value = "Great Football Player"
    }

}