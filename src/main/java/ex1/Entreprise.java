package ex1;

import java.util.Date;

/**
 * @author Simon SUDRE
 * class Entreprise
 */
public class Entreprise {

	/** siret = int  */
	public int siret;
	
	/** nom : String  */
	public String nom;
	
	/** adresse : String  */
	public String adresse;
	
	/** dateCreation : Date  */
	public Date dateCreation;
	
	/** capitalMax : int */
	public static final int capitalMax = 3000000;
	
	/**	statut : Statut */
	public Statut statut = new Statut();
	
	/**
	 * affiche en console le statut de l'entreprise
	 */
	public void afficherStatut(){
		
	}
}