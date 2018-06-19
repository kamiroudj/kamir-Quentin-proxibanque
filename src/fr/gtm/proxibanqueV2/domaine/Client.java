package fr.gtm.proxibanqueV2.domaine;

import java.util.ArrayList;
import java.util.List;

public class Client extends Personne {
	
	List<Compte> comptes = new ArrayList<Compte>();
	
	
	/***************** constructeur *******************************************/
	
	public Client() {
		super();
	}

	
	/*********************** getters et setters *******************************/
	
	public Client(String nom, String prenom, String adresse, int telephone) {
		super(nom, prenom, adresse, telephone);
	}


	public List<Compte> getComptes() {
		return comptes;
	}


	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}

	
	

	
	
	
	
	
}
