package com.lalosapps.cleanarchvalidation.ui.main

import com.lalosapps.cleanarchvalidation.core.util.UiText

data class RegistrationFormState(
    val email: String = "",
    val emailError: UiText? = null,
    val password: String = "",
    val passwordError: UiText? = null,
    val repeatedPassword: String = "",
    val repeatedPasswordError: UiText? = null,
    val acceptedTerms: Boolean = false,
    val termsError: UiText? = null
)
