package org.example;

public class PokemonFactory {

    public Pokemon makePokemon(String pokemonChoice){

        if (pokemonChoice.equalsIgnoreCase("P")){
            return new Pikachu();
        } else if (pokemonChoice.equalsIgnoreCase("R")) {
            return new Raichu();
        } else if (pokemonChoice.equalsIgnoreCase("C")) {
            return new Charmander();
        }else {
            return null;
        }
    }
}
