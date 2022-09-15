package com.example.infraestructure.webclient

import com.example.domain.Pokemon
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.Mono

@Service
class PokemonWebService(private val pokemonWebClient: WebClient) {

    fun getPokemonByName(name: String): Mono<Pokemon> =
        pokemonWebClient.get()
            .uri("pokemon/$name")
            .retrieve()
            .bodyToMono(Pokemon::class.java)
}