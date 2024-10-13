package br.com.coins.models;

public abstract class Coins {
	protected final String name;
	
	Coins(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
