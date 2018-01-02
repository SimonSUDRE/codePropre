package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Simon SUDRE
 * class Zoo
 *
 */
public class Zoo {

	/** String : nom */
	private String nom;
	
	/** List<Zone> : zones */
	private List<Zone> zones;
	
	/**
	 * Constructeur
	 * @param nom le nom du zoo
	 */
	public Zoo(String nom){
		this.nom = nom;
		this.zones = new ArrayList<Zone>();
		this.zones.add(new Aquarium(0.2));
		this.zones.add(new ZoneCarnivore(10));
		this.zones.add(new SavaneAfricaine(10));
		this.zones.add(new FermeReptile(0.1));
	}
	
	/**
	 * ajouter animal 
	 * @param animal un animal
	 */
	public void addAnimal(Animal animal){
		for(Zone zone : this.getZones()) {
			zone.acceptAnimal(animal);
		}
	}
	
	/**
	 * liste des animaux zoo
	 */
	public void afficherListeAnimaux(){
		for(Zone zone : this.getZones()) {
			zone.afficherListeAnimaux();
		}
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return this.nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * GET liste de zone
	 * @return la liste
	 */
	public List<Zone> getZones() {
		return this.zones;
	}

	/**
	 * SET liste de zone
	 * @param zones la liste
	 */
	public void setZones(List<Zone> zones) {
		this.zones = zones;
	}
}