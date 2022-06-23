package com.lalosapps.cleanarchvalidation.domain.usecases

import android.util.Patterns
import com.lalosapps.cleanarchvalidation.R
import com.lalosapps.cleanarchvalidation.core.util.UiText
import com.lalosapps.cleanarchvalidation.core.util.ValidationResult

class ValidateEmail {

    operator fun invoke(email: String): ValidationResult {
        if (email.isBlank()) {
            return ValidationResult(
                successful = false,
                errorMessage = UiText.StringResource(R.string.blank_email_error)
            )
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            return ValidationResult(
                successful = false,
                errorMessage = UiText.StringResource(R.string.invalid_email_error)
            )
        }
        return ValidationResult(successful = true)
    }
}