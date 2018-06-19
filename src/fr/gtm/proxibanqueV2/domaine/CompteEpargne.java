package fr.gtm.proxibanqueV2.domaine;
/**
 * 
 * @author Adminl
 *CompteCourant est une classe héritée de Compte elle a pour attribut supplémentaire un taux d'intérêts
 */
public class CompteEpargne extends Compte{
	
	private double taux;

	public CompteEpargne() {
		super();
	}
/**
 * 
 * @param solde contenu du compte, paramètre utilisé lors des opérations type virement.
 * @param numeroCompte identifiant unique permettant l'indexation du compte sans erreur.
 */
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
