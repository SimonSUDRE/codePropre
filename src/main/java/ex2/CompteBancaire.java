package ex2;

/** Représente un compte bancaire de type compte courante
 * @author DIGINAMIC
 */
public class CompteBancaire {

	/** solde : solde du compte */
	private double solde;
	
	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	private double decouvert;
	
	/**
	 * constructeur
	 * @param solde représente le solde du compte
	 * @param decouvert  représente le découvert autorisé
	 */
	public CompteBancaire(double solde, double decouvert) {
		this.solde = solde;
		this.decouvert = decouvert;
	}
	
	/** Getter for solde
	 * @return the solde
	 */
	public double getSolde() {
		return this.solde;
	}
	
	/** Setter
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	/** Getter for decouvert
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return this.decouvert;
	}
	
	/** Setter
	 * @param decouvert the decouvert to set
	 */
	public final void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	
	/** Ajoute un montant au solde
	 * @param montant le montant � ajouter
	 */
	public void ajouterMontant(double montant){
		this.solde += montant;
	}
	
	/** Ajoute un montant au solde
	 * @param montant le montant a d�biter
	 */
	public void debiterMontant(double montant){
		double nouveauSolde = this.getSolde() - montant;
		if (nouveauSolde >= decouvert){
			this.setSolde(nouveauSolde);
		}
	}
}
