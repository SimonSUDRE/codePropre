package ex3;

import static ex3.TypeAnimal.POISSON;

/**
 * @author Simon SUDRE
 * class Aquarium
 *
 */
public class Aquarium extends Zone {

	/**
	 * Constructeur
	 * @param multiplicateurNouriture pour calcul de quantité nouriture
	 */
	public Aquarium(double multiplicateurNouriture) {
		super(multiplicateurNouriture);
	}

	/* (non-Javadoc)
	 * @see ex3.Zone#acceptAnimal(ex3.Animal)
	 */
	@Override
	public boolean acceptAnimal(Animal animal) {
		if(animal.getType().equals(POISSON)) {
			this.addAnimal(animal);
			return true;
		}
		return false;
	}
}