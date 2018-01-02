package ex3;

import static ex3.TypeAnimal.POISSON;

/**
 * @author Simon SUDRE
 * class Poisson
 *
 */
public class Poisson extends Animal {

	/**
	 * Constructeur
	 * @param nom son nom 
	 * @param comportement son comportement
	 */
	public Poisson(String nom, String comportement) {
		super(nom, POISSON.name(), comportement);
	}
}