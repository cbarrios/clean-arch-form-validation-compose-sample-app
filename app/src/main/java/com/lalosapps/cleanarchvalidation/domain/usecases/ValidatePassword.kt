package com.lalosapps.cleanarchvalidation.domain.usecases

import com.lalosapps.cleanarchvalidation.core.util.Constants.MIN_PASSWORD_LENGTH
import com.lalosapps.cleanarchvalidation.core.util.ValidationResult

class ValidatePassword {

    operator fun invoke(password: String): ValidationResult {
        if (password.length < MIN_PASSWORD_LENGTH) {
            return ValidationResult(
                successful = false,
                errorMessage = "The password must be at least $MIN_PASSWORD_LENGTH long"
            )
        }
        val containsLettersAndDigits =
            password.any { it.isLetter() } && password.any { it.isDigit() }
        if (!containsLettersAndDigits) {
            return ValidationResult(
                successful = false,
                errorMessage = "The password must contain both letters and digits"
            )
        }
        return ValidationResult(successful = true)
    }
}