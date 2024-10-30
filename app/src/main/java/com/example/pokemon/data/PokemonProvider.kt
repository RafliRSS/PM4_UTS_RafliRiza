package com.example.pokemon.data

import com.example.pokemon.R
fun getPokemons(): ArrayList<PokemonModel>{
    return arrayListOf<PokemonModel>(
        PokemonModel( "bulbasaur", R.drawable.bullbasaur),
        PokemonModel( "charmander", R.drawable.bullbasaur),
    )

}