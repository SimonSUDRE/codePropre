package ex2;

public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de r√©mun√©ration */
	private double tauxRemuneration;
	
	/**
 	 * constructeur
	 * @param solde repr√©sente le solde du compte
	 * @param tauxRemuneration  taux de rÈmunÈration annuel
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super(solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}
	
	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
	
	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
	
	/**
	 * actualisation du solde avec la remuneration annuelle
	 */
	public void appliquerRemuAnnuelle(){
		this.setSolde(this.getSolde() + (this.getSolde() * tauxRemuneration/100));
	}
}