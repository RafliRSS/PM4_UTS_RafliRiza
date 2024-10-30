package com.example.pokemon.data

import java.io.Serializable

data class PokemonModel (
    val name: String,
    val image: Int
) : Serializable