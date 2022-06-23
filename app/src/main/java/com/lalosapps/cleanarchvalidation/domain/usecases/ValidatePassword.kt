package com.lalosapps.cleanarchvalidation.domain.usecases

import com.lalosapps.cleanarchvalidation.R
import com.lalosapps.cleanarchvalidation.core.util.Constants.MIN_PASSWORD_LENGTH
import com.lalosapps.cleanarchvalidation.core.util.UiText
import com.lalosapps.cleanarchvalidation.core.util.ValidationResult

class ValidatePassword {

    operator fun invoke(password: String): ValidationResult {
        if (password.length < MIN_PASSWORD_LENGTH) {
            return ValidationResult(
                successful = false,
                errorMessage = UiText.StringResource(
                    R.string.min_password_error,
                    arrayOf(MIN_PASSWORD_LENGTH)
                )
            )
        }
        val containsLettersAndDigits =
            password.any { it.isLetter() } && password.any { it.isDigit() }
        if (!containsLettersAndDigits) {
            return ValidationResult(
                successful = false,
                errorMessage = UiText.StringResource(R.string.letters_and_digits_password_error)
            )
        }
        return ValidationResult(successful = true)
    }
}