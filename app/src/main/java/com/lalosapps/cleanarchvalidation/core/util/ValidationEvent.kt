package com.lalosapps.cleanarchvalidation.core.util

sealed class ValidationEvent {
    object Success : ValidationEvent()
}
