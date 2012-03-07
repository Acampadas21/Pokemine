package net.acampadas21.pokemine.move;

import net.acampadas21.pokemine.types.PokeType;

public interface Move {
	
	abstract int getBasePower();
	abstract int getPrecision();
	abstract PokeType getType();
	
}
