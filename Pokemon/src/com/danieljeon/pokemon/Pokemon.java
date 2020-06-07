package com.danieljeon.pokemon;

public class Pokemon {
	
	// member variables
	private String name;
	private int health;
	private String type;
	
	// static variable
	public static int count = 0;
	
	// constructor
	public Pokemon(String name, int health, String type) {
		this.setName(name);
		this.setHealth(health);
		this.setType(type);
		count++;
	}
	
	// member methods
	public void attackPokemon(Pokemon pokemon) {
		pokemon.setHealth(pokemon.getHealth() - 10);
	}
	
	// getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
