package com.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@SpringBootApplication
@EnableCaching
class PocWebfluxCacheApplication

fun main(args: Array<String>) {
	runApplication<PocWebfluxCacheApplication>(*args)
}