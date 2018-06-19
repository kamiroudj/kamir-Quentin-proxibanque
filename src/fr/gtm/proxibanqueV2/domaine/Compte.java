package fr.gtm.proxibanqueV2.domaine;
/**
 * 
 * @author Adminl
 * classe Compte possède un solde ainsi qu'un identifiant unique "numeroCompte" un compte est associé à un client
 *
 */
public class Compte {
	
	private double solde;
	private long numeroCompte;
	

	public Compte() {
		
	}

/**
 * 
 * @param solde contenu du compte, paramètre utilisé lors des opérations type virement.
 * @param numeroCompte identifiant unique permettant l'indexation du compte sans erreur.
 */
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
