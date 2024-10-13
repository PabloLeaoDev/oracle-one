package br.com.coins.models;

public abstract class Coins {
	protected final String baseCode;
	
	Coins(String baseCode) {
		this.baseCode = baseCode;
	}

	public String getBaseCode() {
		return baseCode;
	}
	
}
