package net.acampadas21.pokemine.battle;

import java.util.Random;

import net.acampadas21.pokemine.move.Move;
import net.acampadas21.pokemine.pokemons.Pokemon;

public class Hit {
	Pokemon target;
	Pokemon source;
	public Hit(Pokemon source, Pokemon target, Move move) {
		int damage = 0;
		int sourcelevel = 0;
		int sourceattack = 0;
		int targetdefense = 0;
		int movebase = 0;
		int modifier = 0;
		modifier = (int) (Math.random()*15)+85;
	}
}
