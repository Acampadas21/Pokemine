package net.acampadas21.pokemine;

import net.acampadas21.pokemine.types.TypeMultiplier;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(args.length < 2) {
			return;
		}
		if (args.length > 2) {
			System.out.println("Multiplier is: x"+net.acampadas21.pokemine.types.TypeMultiplier.getMultiplier(args[0], args[1], args[2]));
		} else {
			System.out.println("Multiplier is: x"+net.acampadas21.pokemine.types.TypeMultiplier.getMultiplier(args[0], args[1], null));
		}

	}

}
