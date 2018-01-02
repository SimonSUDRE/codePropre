package ex3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Simon SUDRE
 * class zoo application
 */
public class ZooApplication {

	/** CONSOLE : Logger */
	public static final Logger CONSOLE = LoggerFactory.getLogger(ZooApplication.class);
	
	/**
	 *  point d'entréer
	 * @param args non utiliser
	 */
	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal(new Mamifere("Gazelle", "HERBIVORE"));
		zoo.addAnimal(new Mamifere("Zebre", "HERBIVORE"));
		zoo.addAnimal(new Mamifere("Lion", "CARNIVORE"));
		zoo.addAnimal(new Mamifere("Panthere", "CARNIVORE"));
		zoo.addAnimal(new Poisson("Requin blanc", "HERBIVORE"));
		zoo.addAnimal(new Poisson("Truite doree", "HERBIVORE"));
		zoo.addAnimal(new Reptile("Boa constrictor", "CARNIVORE"));
		zoo.addAnimal(new Reptile("Python", "CARNIVORE"));
		
		zoo.afficherListeAnimaux();

	}

}
