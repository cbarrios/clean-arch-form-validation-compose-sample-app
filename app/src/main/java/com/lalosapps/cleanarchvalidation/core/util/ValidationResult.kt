package com.lalosapps.cleanarchvalidation.core.util

data class ValidationResult(
    val successful: Boolean,
    val errorMessage: String? = null
)