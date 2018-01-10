package monotache.noncorrige;

public class AppFacturation {

	public static void main(String[] args) {
		Facturation facturation = new Facturation();
		Facture facture = facturation.creerFacture(18.5, "18/11/2017");
		facture.getDateFacture();
	}

}
