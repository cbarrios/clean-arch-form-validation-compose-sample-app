package com.lalosapps.cleanarchvalidation.domain.usecases

import org.junit.Assert.*

import org.junit.Before
import org.junit.Test

class ValidatePasswordTest {

    private lateinit var validatePassword: ValidatePassword

    @Before
    fun setUp() {
        validatePassword = ValidatePassword()
    }

    @Test
    fun `GIVEN that the password contains only letters, WHEN the user tries to validate it, THEN the validation result must be unsuccessful`() {
        // GIVEN
        val password = "abcdefgh"

        // WHEN
        val result = validatePassword(password)

        // THEN
        assertEquals(result.successful, false)
    }
}