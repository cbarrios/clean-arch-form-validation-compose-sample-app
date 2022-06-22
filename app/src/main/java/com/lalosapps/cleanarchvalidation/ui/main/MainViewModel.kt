package com.lalosapps.cleanarchvalidation.ui.main

import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var state by mutableStateOf(RegistrationFormState())
        private set

}