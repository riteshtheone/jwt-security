package com.example.jwtdemo.utils

import java.util.*

data class ArticleResponse(
    val id: UUID,
    val title: String,
    val content: String,
)