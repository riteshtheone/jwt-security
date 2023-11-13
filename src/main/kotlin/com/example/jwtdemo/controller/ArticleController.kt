package com.example.jwtdemo.controller

import com.example.jwtdemo.model.Article
import com.example.jwtdemo.service.ArticleService
import com.example.jwtdemo.utils.ArticleResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/article")
class ArticleController(
    @Autowired private val articleService: ArticleService
) {

    @GetMapping
    fun listAll(): List<ArticleResponse> =
        articleService.findAll()
            .map { it.toResponse() }

    private fun Article.toResponse(): ArticleResponse =
        ArticleResponse(
            id = this.id,
            title = this.title,
            content = this.content,
        )
}