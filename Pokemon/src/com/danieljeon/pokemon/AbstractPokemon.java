package com.danieljeon.pokemon;

public abstract class AbstractPokemon implements PokemonInterface {

	public Pokemon createPokemon(String name, int health, String type) {
		return new Pokemon(name, health, type);
	}

	public String pokemonInfo(Pokemon pokemon) {
		return "Name: ".concat(pokemon.getName()).concat("; Health: ").concat("" + pokemon.getHealth()).concat("; Type: ").concat(pokemon.getType());
	}

}
