package ex3;

import static ex3.TypeAnimal.REPTILE;

/**
 * @author Simon SUDRE
 * class Reptile
 *
 */
public class Reptile extends Animal {

	/**
	 * Constructeur
	 * @param nom son nom 
	 * @param comportement son comportement
	 */
	public Reptile(String nom, String comportement) {
		super(nom, REPTILE.name(), comportement);
	}
}