package ex3;

import java.util.ArrayList;
import java.util.List;
import static ex3.ZooApplication.CONSOLE;

/**
 * @author Simon SUDRE
 * class zone
 */
public abstract class Zone {
	
	/** List<Animal> : animaux */
	private List<Animal> animaux;
	
	/** double : multiplicateurNouriture */
	private double multiplicateurNouriture;

	/**
	 * Constructeur
	 * @param multiplicateurNouriture pour calcul de quantité nouriture
	 */
	public Zone(double multiplicateurNouriture) {
		this.multiplicateurNouriture = multiplicateurNouriture;
		this.animaux = new ArrayList<Animal>();
	}
	
	/**
	 * GET multiplicateurNouriture
	 * @return le multiplicateur de Nouriture
	 */
	public double getMultiplicateurNouriture() {
		return multiplicateurNouriture;
	}
	
	/**
	 * SET multiplicateurNouriture
	 * @param multiplicateurNouriture le multiplicateur de Nouriture
	 */
	public void setMultiplicateurNouriture(double multiplicateurNouriture) {
		this.multiplicateurNouriture = multiplicateurNouriture;
	}

	/**
	 * GET animaux
	 * @return la liste des animaux
	 */
	public List<Animal> getAnimaux() {
		return animaux;
	}

	/**
	 * SET animaux
	 * @param animaux une liste d'animaux
	 */
	public void setAnimaux(List<Animal> animaux) {
		this.animaux = animaux;
	}
	
	/**
	 * ajout d'un animal
	 * @param animal un animal
	 */
	protected void addAnimal(Animal animal) {
		this.getAnimaux().add(animal);
	}
	
	/**
	 * affiche la liste des animaux
	 */
	public void afficherListeAnimaux(){
		for (Animal animal : this.getAnimaux()){
			CONSOLE.info(animal.toString());
		}
	}
	
	/**
	 * compte les animaux dans la zone
	 * @return nb animaux dans la zone
	 */
	public int compterAnimaux() {
		return this.getAnimaux().size();
	}
	
	/**
	 * calcul kgs Nourriture Par Jour
	 * @return doouble calcul kgs Nourriture Par Jour
	 */
	public double calculerKgsNourritureParJour(){
		return this.compterAnimaux() * this.getMultiplicateurNouriture();
	}
	
	/**
	 * verifie si l'animal peut etre inserer dans la zone
	 * @param animal un animal
	 * @return true if ok sinon false
	 */
	public abstract boolean acceptAnimal(Animal animal);	
}