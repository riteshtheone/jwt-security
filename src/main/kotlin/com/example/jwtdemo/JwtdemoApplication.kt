package com.example.jwtdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
class JwtdemoApplication

fun main(args: Array<String>) {
    runApplication<JwtdemoApplication>(*args)
}
