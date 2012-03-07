package net.acampadas21.pokemine.move;

import net.acampadas21.pokemine.pokemons.PokeStatus;
import net.acampadas21.pokemine.types.PokeType;

public class PhysicalMove implements Move {
	private int basepower;
	private int precision;
	private PokeType type;
	private PokeStatus status;
	private int statusChance;
	
	public PhysicalMove(int basepower, int precision, PokeType type, PokeStatus status, int statusChance) {
		this.basepower = basepower;
		this.precision = precision;
		this.type = type;
		this.status = status;
		this.statusChance = statusChance;
	}

	public int getBasePower() {
		return basepower;
	}

	public int getPrecision() {
		return precision;
	}

	public PokeType getType() {
		return type;
	}

	public PokeStatus getStatus() {
		return status;
	}

	public int getStatusChance() {
		// TODO Auto-generated method stub
		return statusChance;
	}

}
