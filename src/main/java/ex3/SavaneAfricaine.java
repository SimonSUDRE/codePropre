package ex3;

import static ex3.Comportement.HERBIVORE;
import static ex3.TypeAnimal.MAMMIFERE;

/**
 * @author Simon SUDRE
 * class Savane africaine
 *
 */
public class SavaneAfricaine extends Zone {
	
	/**
	 * Constructeur
	 * @param multiplicateurNouriture pour calcul de quantité nouriture
	 */
	public SavaneAfricaine(double multiplicateurNouriture) {
		super(TypeZone.SAVANE_AFRICAINE, multiplicateurNouriture);
	}

	/* (non-Javadoc)
	 * @see ex3.Zone#acceptAnimal(ex3.Animal)
	 */
	@Override
	public boolean acceptAnimal(Animal animal) {
		if(animal.getType().equals(MAMMIFERE) && animal.getComportement().equals(HERBIVORE)) {
			this.addAnimal(animal);
			return true;
		}
		return false;
	}
}