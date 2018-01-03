package ex3;

import static ex3.TypeAnimal.REPTILE;

/**
 * @author Simon SUDRE
 * class Ferme reptile
 *
 */
public class FermeReptile extends Zone {

	/**
	 * Constructeur
	 * @param multiplicateurNouriture pour calcul de quantité nouriture
	 */
	public FermeReptile(double multiplicateurNouriture) {
		super(TypeZone.FERME_REPTILE, multiplicateurNouriture);
	}

	/* (non-Javadoc)
	 * @see ex3.Zone#acceptAnimal(ex3.Animal)
	 */
	@Override
	public boolean acceptAnimal(Animal animal) {
		if(animal.getType().equals(REPTILE)) {
			this.addAnimal(animal);
			return true;
		}
		return false;
	}
}
