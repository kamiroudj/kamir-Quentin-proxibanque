package fr.gtm.proxibanqueV2.domaine;

public class Compte {
	
	private double solde;
	private long numeroCompte;
	
	
	public Compte() {
		
	}


	public Compte(double solde, long numeroCompte) {
		
		this.solde = solde;
		this.numeroCompte = numeroCompte;
	}


	public double getSolde() {
		return solde;
	}


	public void setSolde(double solde) {
		this.solde = solde;
	}


	public long getNumeroCompte() {
		return numeroCompte;
	}


	public void setNumeroCompte(long numeroCompte) {
		this.numeroCompte = numeroCompte;
	}
	
		
	

}
