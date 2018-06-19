package fr.gtm.proxibanqueV2.domaine;

public class CompteEpargne extends Compte{
	
	private double taux;

	public CompteEpargne() {
		super();
	}

	public CompteEpargne(double solde, long numeroCompte) {
		super(solde, numeroCompte);
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}
	

}
