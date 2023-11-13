package com.example.jwtdemo.utils

data class AuthenticationResponse(
    val accessToken: String,
    val refreshToken: String,
)