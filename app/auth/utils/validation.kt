package com.example.depi_onl_compose.auth.utils

import android.util.Patterns
import java.util.regex.Pattern

fun validateEmail(email : String) : String?{
    return when{
        email.isBlank() -> "Email is required"
        !Patterns.EMAIL_ADDRESS.matcher(email).matches() -> "Invalid email"
        else -> null
    }
}
fun validatePassword(password:  String ) : String?{
    return when {
        password.isBlank() -> "Password is required"
        password.length < 6 -> "Password must be at least 6 characters"
        else -> null
    }
}
