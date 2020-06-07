package com.danieljeon.pokemon;

public class PokemonTest {

	public static void main(String[] args) {
		
		Pokemon bulbasaur = new Pokemon("Bulbasaur", 120, "grass/poison");
		Pokemon ivysaur = new Pokemon("Ivysaur", 240, "grass/poison");
		Pokemon venasaur = new Pokemon("Venasaur", 360, "grass/poison");
		
		Pokemon charmander = new Pokemon("Charmander", 100, "fire");
		Pokemon charmeleon = new Pokemon("Charmeleon", 200, "fire");
		Pokemon charizard = new Pokemon("Charizard", 300, "fire/flying");
		
		System.out.println(bulbasaur.count);
		charmander.attackPokemon(bulbasaur);
		System.out.println(bulbasaur.getHealth());
		
		Pokedex myPokedex = new Pokedex();
		Pokemon squirtle = myPokedex.createPokemon("Squirtle", 110, "water");
		Pokemon wartortle = myPokedex.createPokemon("Wartortle", 220, "water");
		Pokemon blastoise = myPokedex.createPokemon("Blastoise", 330, "water");
		
		myPokedex.myPokemons.add(charmander);
		myPokedex.myPokemons.add(squirtle);
		myPokedex.listPokemon();
		
	}

}
