package com.example.jwtdemo.utils

data class AuthenticationRequest(
    val email: String,
    val password: String,
)