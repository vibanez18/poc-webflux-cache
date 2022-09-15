package com.example.infraestructure.webclient

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.client.WebClient

@Configuration
class PokemonWebClientConfiguration {

    companion object {
        const val URL = "https://pokeapi.co/api/v2/"
    }

    @Bean("pokemonWebClient")
    fun pokemonWebClient(): WebClient = WebClient.builder()
        .baseUrl(URL)
        .build()
}