package net.acampadas21.pokemine.types;

public class TypeMultiplier {

	public static double getMultiplier(String source, String target1, String target2) {
		if (target2 != null) {
		return getMultiplier(PokeType.valueOf(source.toUpperCase()), PokeType.valueOf(target1.toUpperCase()), PokeType.valueOf(target2.toUpperCase()));
		} else {
		return getMultiplier(PokeType.valueOf(source.toUpperCase()), PokeType.valueOf(target1.toUpperCase()));
		}
	
	public static double getMultiplier(PokeType source, PokeType target1, PokeType target2) {
		double multiplier = 1;
		multiplier = multiplier * getMultiplier(source, target1);
		if (target2 != null) {
			multiplier = multiplier * getMultiplier(source, target2);
		}
		return multiplier;
	}
	public static double getMultiplier(PokeType source, PokeType target) {
		switch (source) {
		case NORMAL:
			if (target == PokeType.GHOST) {
				return 0;
			} else if (target == PokeType.ROCK || target == PokeType.STEEL) {
				return 0.5;
			}
		case FIGHTING:
			if (target == PokeType.NORMAL || target == PokeType.ROCK || target == PokeType.STEEL || target == PokeType.ICE || target == PokeType.DARK) {
				return 2;
			} else if (target == PokeType.POISON || target == PokeType.FLYING || target == PokeType.BUG || target == PokeType.PSYCHIC) {
				return 0.5;
			} else if (target == PokeType.GHOST) {
				return 0;
			}
		case FLYING:
			if (target == PokeType.BUG || target == PokeType.FIGHTING || target == PokeType.GRASS) {
				return 2;
			} else if (target == PokeType.ELECTRIC || target == PokeType.ROCK || target == PokeType.STEEL) {
				return 0.5;
			}
		case POISON:
			if (target == PokeType.BUG || target == PokeType.GRASS) {
				return 2;
			} else if (target == PokeType.GHOST || target == PokeType.GROUND || target == PokeType.POISON || target == PokeType.ROCK) {
				return 0.5;
			}
		case GROUND:
			if (target == PokeType.ELECTRIC || target == PokeType.FIRE || target == PokeType.POISON || target == PokeType.ROCK || target == PokeType.STEEL) {
				return 2;
			} else if (target == PokeType.BUG || target == PokeType.GRASS) {
				return 0.5;
			} else if (target == PokeType.FLYING) {
				return 0;
			}
		case ROCK:
			if (target == PokeType.BUG || target == PokeType.FIRE || target == PokeType.FLYING || target == PokeType.ICE) {
				return 2;
			} else if (target == PokeType.FIGHTING || target == PokeType.GROUND || target == PokeType.STEEL) {
				return 0.5;
			}
		case BUG:
			if (target == PokeType.DARK || target == PokeType.GRASS || target == PokeType.PSYCHIC) {
				return 2;
			} else if (target == PokeType.FIGHTING || target == PokeType.FIRE || target == PokeType.FLYING || target == PokeType.GHOST || target == PokeType.POISON || target == PokeType.STEEL) {
				return 0.5;
			}
		case GHOST:
			if (target == PokeType.GHOST || target == PokeType.PSYCHIC) {
				return 2;
			} else if (target == PokeType.DARK || target == PokeType.STEEL) {
				return 0.5;
			} else if (target == PokeType.NORMAL) {
				return 0;
			}
		case STEEL:
			if (target == PokeType.ICE || target == PokeType.ROCK) {
				return 2;
			} else if (target == PokeType.ELECTRIC || target == PokeType.FIRE || target == PokeType.STEEL || target == PokeType.WATER) {
				return 0.5;
			}
		case FIRE:
			if (target == PokeType.BUG || target == PokeType.GRASS || target == PokeType.ICE) {
				return 2;
			} else if (target == PokeType.DRAGON || target == PokeType.FIRE || target == PokeType.ROCK || target == PokeType.WATER) {
				return 0.5;
			}
		case WATER:
			if (target == PokeType.FIRE || target == PokeType.GROUND || target == PokeType.ROCK) {
				return 2;
			} else if (target == PokeType.DRAGON || target == PokeType.GRASS || target == PokeType.WATER) {
				return 0.5;
			}
		case GRASS:
			if (target == PokeType.GROUND || target == PokeType.ROCK || target == PokeType.WATER) {
				return 2;
			} else if (target == PokeType.BUG || target == PokeType.DRAGON || target == PokeType.FIRE || target == PokeType.FLYING || target == PokeType.GRASS || target == PokeType.POISON || target == PokeType.STEEL) {
				return 0.5;
			}
		case ELECTRIC:
			if (target == PokeType.FLYING || target == PokeType.WATER) {
				return 2;
			} else if (target == PokeType.DRAGON || target == PokeType.ELECTRIC || target == PokeType.GRASS) {
				return 0.5;
			} else if (target == PokeType.GROUND) {
				return 0;
			}
		case PSYCHIC:
			if (target == PokeType.FIGHTING || target == PokeType.POISON) {
				return 2;
			} else if (target == PokeType.PSYCHIC || target == PokeType.STEEL) {
				return 0.5;
			} else if (target == PokeType.DARK) {
				return 0;
			}
		case ICE:
			if (target == PokeType.DRAGON || target == PokeType.FLYING || target == PokeType.GRASS || target == PokeType.GROUND) {
				return 2;
			} else if (target == PokeType.FIRE || target == PokeType.ICE || target == PokeType.STEEL || target == PokeType.WATER) {
				return 0.5;
			}
		case DRAGON:
			if (target == PokeType.DRAGON) {
				return 2;
			} else if (target == PokeType.STEEL) {
				return 0.5;
			}
		}
		return 1;
	}
	
}
