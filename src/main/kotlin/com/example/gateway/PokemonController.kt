package com.example.gateway

import com.example.domain.Pokemon
import com.example.infraestructure.webclient.PokemonWebService
import org.apache.logging.log4j.kotlin.Logging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class PokemonController(val pokemonWebService: PokemonWebService): Logging {

    @GetMapping("/pokemon/{name}")
    fun getPokemonByName(@PathVariable name: String): Mono<Pokemon> = pokemonWebService.getPokemonByName(name)

}