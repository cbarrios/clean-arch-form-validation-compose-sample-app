package com.lalosapps.cleanarchvalidation.domain.usecases

import com.lalosapps.cleanarchvalidation.R
import com.lalosapps.cleanarchvalidation.core.util.UiText
import com.lalosapps.cleanarchvalidation.core.util.ValidationResult

class ValidateTerms {

    operator fun invoke(acceptedTerms: Boolean): ValidationResult {
        if (!acceptedTerms) {
            return ValidationResult(
                successful = false,
                errorMessage = UiText.StringResource(R.string.accept_terms_error)
            )
        }
        return ValidationResult(successful = true)
    }
}