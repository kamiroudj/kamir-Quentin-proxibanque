package fr.gtm.proxibanqueV2.domaine;
/**
 * 
 * @author Adminl
 *CompteCourant est une classe héritée de Compte elle a pour attribut supplémentaire un plafond d'autorisation de découvert
 */
public class CompteCourant extends Compte{
	
	private double decouvert;

	public CompteCourant() {
		super();
	}
/**
 * 
 * @param solde contenu du compte, paramètre utilisé lors des opérations type virement.
 * @param numeroCompte identifiant unique permettant l'indexation du compte sans erreur.
 */
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
