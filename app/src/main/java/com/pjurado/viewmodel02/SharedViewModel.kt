package com.pjurado.viewmodel02

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel: ViewModel() {
    val nombre = MutableLiveData<String>()



}