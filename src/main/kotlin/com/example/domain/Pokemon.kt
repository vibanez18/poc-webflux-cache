package com.example.domain

data class Pokemon(
    val id: Int,
    val name: String,
    val height: Int,
    val abilities: List<PokemonAbilities>
)

data class PokemonAbilities(
    val is_hidden: Boolean,
    val slot: Int,
    val ability: Ability
)

data class Ability(val name: String)