package net.acampadas21.pokemine.types;

public class TypeMultiplier {

	public static double getMultiplier(String source, String target1, String target2) {
		if (target2 != null && target2 != "") {
			return getMultiplier(PokeType.valueOf(source.toUpperCase()), PokeType.valueOf(target1.toUpperCase()), PokeType.valueOf(target2.toUpperCase()));
		} else {
			return getMultiplier(PokeType.valueOf(source.toUpperCase()), PokeType.valueOf(target1.toUpperCase()));
		}
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
		double multiplier = 1;
		switch (source) {
		case NORMAL:
			if (target == PokeType.GHOST) {
				multiplier = 0;
			} else if (target == PokeType.ROCK || target == PokeType.STEEL) {
				multiplier = 0.5;
			}
			break;
		case FIGHTING:
			if (target == PokeType.NORMAL || target == PokeType.ROCK || target == PokeType.STEEL || target == PokeType.ICE || target == PokeType.DARK) {
				multiplier = 2;
			} else if (target == PokeType.POISON || target == PokeType.FLYING || target == PokeType.BUG || target == PokeType.PSYCHIC) {
				multiplier = 0.5;
			} else if (target == PokeType.GHOST) {
				multiplier = 0;
			}
			break;
		case FLYING:
			if (target == PokeType.BUG || target == PokeType.FIGHTING || target == PokeType.GRASS) {
				multiplier = 2;
			} else if (target == PokeType.ELECTRIC || target == PokeType.ROCK || target == PokeType.STEEL) {
				multiplier = 0.5;
			}
			break;
		case POISON:
			if (target == PokeType.BUG || target == PokeType.GRASS) {
				multiplier = 2;
			} else if (target == PokeType.GHOST || target == PokeType.GROUND || target == PokeType.POISON || target == PokeType.ROCK) {
				multiplier = 0.5;
			}
			break;
		case GROUND:
			if (target == PokeType.ELECTRIC || target == PokeType.FIRE || target == PokeType.POISON || target == PokeType.ROCK || target == PokeType.STEEL) {
				multiplier = 2;
			} else if (target == PokeType.BUG || target == PokeType.GRASS) {
				multiplier = 0.5;
			} else if (target == PokeType.FLYING) {
				multiplier = 0;
			}
			break;
		case ROCK:
			if (target == PokeType.BUG || target == PokeType.FIRE || target == PokeType.FLYING || target == PokeType.ICE) {
				multiplier = 2;
			} else if (target == PokeType.FIGHTING || target == PokeType.GROUND || target == PokeType.STEEL) {
				multiplier = 0.5;
			}
			break;
		case BUG:
			if (target == PokeType.DARK || target == PokeType.GRASS || target == PokeType.PSYCHIC) {
				multiplier = 2;
			} else if (target == PokeType.FIGHTING || target == PokeType.FIRE || target == PokeType.FLYING || target == PokeType.GHOST || target == PokeType.POISON || target == PokeType.STEEL) {
				multiplier = 0.5;
			}
			break;
		case GHOST:
			if (target == PokeType.GHOST || target == PokeType.PSYCHIC) {
				multiplier = 2;
			} else if (target == PokeType.DARK || target == PokeType.STEEL) {
				multiplier = 0.5;
			} else if (target == PokeType.NORMAL) {
				multiplier = 0;
			}
			break;
		case STEEL:
			if (target == PokeType.ICE || target == PokeType.ROCK) {
				multiplier = 2;
			} else if (target == PokeType.ELECTRIC || target == PokeType.FIRE || target == PokeType.STEEL || target == PokeType.WATER) {
				multiplier = 0.5;
			}
			break;
		case FIRE:
			if (target == PokeType.STEEL || target == PokeType.BUG || target == PokeType.GRASS || target == PokeType.ICE) {
				multiplier = 2;
			} else if (target == PokeType.DRAGON || target == PokeType.FIRE || target == PokeType.ROCK || target == PokeType.WATER) {
				multiplier = 0.5;
			}
			break;
		case WATER:
			if (target == PokeType.FIRE || target == PokeType.GROUND || target == PokeType.ROCK) {
				multiplier = 2;
			} else if (target == PokeType.DRAGON || target == PokeType.GRASS || target == PokeType.WATER) {
				multiplier = 0.5;
			}
			break;
		case GRASS:
			if (target == PokeType.GROUND || target == PokeType.ROCK || target == PokeType.WATER) {
				multiplier = 2;
			} else if (target == PokeType.BUG || target == PokeType.DRAGON || target == PokeType.FIRE || target == PokeType.FLYING || target == PokeType.GRASS || target == PokeType.POISON || target == PokeType.STEEL) {
				multiplier = 0.5;
			}
			break;
		case ELECTRIC:
			if (target == PokeType.FLYING || target == PokeType.WATER) {
				multiplier = 2;
			} else if (target == PokeType.DRAGON || target == PokeType.ELECTRIC || target == PokeType.GRASS) {
				multiplier = 0.5;
			} else if (target == PokeType.GROUND) {
				multiplier = 0;
			}
			break;
		case PSYCHIC:
			if (target == PokeType.FIGHTING || target == PokeType.POISON) {
				multiplier = 2;
			} else if (target == PokeType.PSYCHIC || target == PokeType.STEEL) {
				multiplier = 0.5;
			} else if (target == PokeType.DARK) {
				multiplier = 0;
			}
			break;
		case ICE:
			if (target == PokeType.DRAGON || target == PokeType.FLYING || target == PokeType.GRASS || target == PokeType.GROUND) {
				multiplier = 2;
			} else if (target == PokeType.FIRE || target == PokeType.ICE || target == PokeType.STEEL || target == PokeType.WATER) {
				multiplier = 0.5;
			}
			break;
		case DRAGON:
			if (target == PokeType.DRAGON) {
				multiplier = 2;
			} else if (target == PokeType.STEEL) {
				multiplier = 0.5;
			}
			break;
		}
		return multiplier;
	}
	
}
