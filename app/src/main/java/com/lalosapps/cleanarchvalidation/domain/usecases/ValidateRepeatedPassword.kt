package com.lalosapps.cleanarchvalidation.domain.usecases

import com.lalosapps.cleanarchvalidation.R
import com.lalosapps.cleanarchvalidation.core.util.UiText
import com.lalosapps.cleanarchvalidation.core.util.ValidationResult

class ValidateRepeatedPassword {

    operator fun invoke(password: String, repeatedPassword: String): ValidationResult {
        if (password != repeatedPassword) {
            return ValidationResult(
                successful = false,
                errorMessage = UiText.StringResource(R.string.repeated_password_error)
            )
        }
        return ValidationResult(successful = true)
    }
}