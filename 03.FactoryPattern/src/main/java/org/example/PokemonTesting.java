package org.example;

import java.util.Scanner;

public class PokemonTesting {

    public static void main(String[] args) {

//        System.out.println("Hello world!");

        PokemonFactory pokemonFactory = new PokemonFactory();
        Pokemon myPokemon = null;

        System.out.println("Welcome to the Pokemon Battle Arena!");
        System.out.println("A new challenger stands in front of you");
        System.out.println("So whom will YOU choose? (P/ R/ C)");

        Scanner userInput = new Scanner(System.in);
        myPokemon = pokemonFactory.makePokemon(userInput.nextLine());

        if (myPokemon != null){
            startPokemonMatch(myPokemon);
        }else{
            System.out.println("You lose... Please choose a valid pokemon (P/ R/ C) next time.");
        }
    }

    public static void startPokemonMatch(Pokemon myPokemon){

        myPokemon.exitPokeball();
        myPokemon.pokemonSaysHello();
        myPokemon.doPokemonDamage();

    }
}