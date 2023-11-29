package com.holy.codes

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val textFieldState  = MutableLiveData("")
    val userList = MutableLiveData<List<String>>()
    fun onTextChange (newText : String){
        textFieldState.value = newText
    }
}