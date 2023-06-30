package com.vaibhavmojidra.androidkotlindemo2twowaydatabinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel:ViewModel() {
    val checkValue=MutableLiveData<Boolean>()
    init {
        checkValue.value=true
    }
}