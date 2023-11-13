package com.example.jwtdemo.service

import com.example.jwtdemo.model.Article
import com.example.jwtdemo.repository.ArticleRepository
import org.springframework.stereotype.Service

@Service
class ArticleService(
    private val articleRepository: ArticleRepository
) {

    fun findAll(): List<Article> = articleRepository.findAll()
}