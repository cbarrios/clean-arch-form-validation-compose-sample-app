package com.lalosapps.cleanarchvalidation.domain.usecases

import android.util.Patterns
import com.lalosapps.cleanarchvalidation.core.util.ValidationResult

class ValidateEmail {

    operator fun invoke(email: String): ValidationResult {
        if (email.isBlank()) {
            return ValidationResult(
                successful = false,
                errorMessage = "The email can't be blank"
            )
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            return ValidationResult(
                successful = false,
                errorMessage = "That's not a valid email"
            )
        }
        return ValidationResult(successful = true)
    }
}