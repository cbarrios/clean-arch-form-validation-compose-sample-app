package com.lalosapps.cleanarchvalidation.domain.usecases

import com.lalosapps.cleanarchvalidation.core.util.ValidationResult

class ValidateRepeatedPassword {

    operator fun invoke(password: String, repeatedPassword: String): ValidationResult {
        if (password != repeatedPassword) {
            return ValidationResult(
                successful = false,
                errorMessage = "The passwords don't match"
            )
        }
        return ValidationResult(successful = true)
    }
}