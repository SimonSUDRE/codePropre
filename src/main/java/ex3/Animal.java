package ex3;

/**
 * @author Simon SUDRE
 * class animal
 *
 */
public class Animal {

	/** String : nom */
	private String nom;
	
	/** Comportement : comportement  */
	private Comportement comportement;
	
	/** TypeAnimal : type */
	private TypeAnimal type;

	/**
	 * constructeur
	 * @param nom son nom
	 * @param type son type
	 * @param comportement son comportement
	 */
	public Animal(String nom, String type, String comportement) {
		this.nom = nom;
		this.type = TypeAnimal.valueOf(type);
		this.comportement = Comportement.valueOf(comportement);
	}

	/**
	 * GET NOM
	 * @return son nom 
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * SET nom
	 * @param nom un nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * GET comportement
	 * @return son comportement
	 */
	public Comportement getComportement() {
		return comportement;
	}

	/**
	 * SET comportement
	 * @param comportement un comportement
	 */
	public final void setComportement(String comportement) {
		this.comportement = Comportement.valueOf(comportement);
	}

	/**
	 * GET type
	 * @return son type
	 */
	public TypeAnimal getType() {
		return type;
	}

	/**
	 * SET type
	 * @param type un type
	 */
	public void setType(String type) {
		this.type = TypeAnimal.valueOf(type);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Animal : " + nom + ", " + type.name() + ", " + comportement.name();
	}
}