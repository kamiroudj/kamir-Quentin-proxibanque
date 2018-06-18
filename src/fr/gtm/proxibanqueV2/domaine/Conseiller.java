package fr.gtm.proxibanqueV2.domaine;

import java.util.ArrayList;
import java.util.List;

public class Conseiller {
	
	private Integer id;
	private String nom;
	private String prenom;
	private String login;
	private String password;
	private List<Client> clients = new ArrayList<Client>();
	
	/***************** Constructeur ********************************************/
	
	public Conseiller() {

	}
	
	public Conseiller(String nom, String prenom, String login, String password) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
	}
	
	/************************Getters et Setters********************************/
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
		

}
