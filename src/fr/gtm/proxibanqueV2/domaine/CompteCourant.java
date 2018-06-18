package fr.gtm.proxibanqueV2.domaine;

public class CompteCourant extends Compte{
	
	private double decouvert;

	public CompteCourant() {
		super();
	}

	public CompteCourant(double solde, long numeroCompte) {
		super(solde, numeroCompte);
	}

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	
	
	
	
	


}
