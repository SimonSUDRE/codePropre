package ex3;

import static ex3.TypeAnimal.MAMMIFERE;
import static ex3.Comportement.CARNIVORE;

/**
 * @author Simon SUDRE
 * class Zone carnivore
 *
 */
public class ZoneCarnivore extends Zone {

	/**
	 * Constructeur
	 * @param multiplicateurNouriture pour calcul de quantité nouriture
	 */
	public ZoneCarnivore(double multiplicateurNouriture) {
		super(multiplicateurNouriture);
	}

	/* (non-Javadoc)
	 * @see ex3.Zone#acceptAnimal(ex3.Animal)
	 */
	@Override
	public boolean acceptAnimal(Animal animal) {
		if(animal.getType().equals(MAMMIFERE) && animal.getComportement().equals(CARNIVORE)) {
			this.addAnimal(animal);
			return true;
		}
		return false;
	}
}