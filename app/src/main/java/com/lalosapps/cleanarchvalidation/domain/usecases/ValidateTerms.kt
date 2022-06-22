package com.lalosapps.cleanarchvalidation.domain.usecases

import com.lalosapps.cleanarchvalidation.core.util.ValidationResult

class ValidateTerms {

    operator fun invoke(acceptedTerms: Boolean): ValidationResult {
        if (!acceptedTerms) {
            return ValidationResult(
                successful = false,
                errorMessage = "Please accept the terms"
            )
        }
        return ValidationResult(successful = true)
    }
}