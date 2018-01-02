package ex3;

import static ex3.TypeAnimal.MAMMIFERE;

/**
 * @author Simon SUDRE
 * class Mammifere
 *
 */
public class Mamifere extends Animal {

	/**
	 * Constructeur
	 * @param nom son nom 
	 * @param comportement son comportement
	 */
	public Mamifere(String nom, String comportement) {
		super(nom, MAMMIFERE.name(), comportement);
	}
}