package fr.gtm.proxibanqueV2.domaine;

import java.util.ArrayList;
import java.util.List;

public class Conseiller extends Personne {
	
	private String login;
	private String password;
	private List<Client> clients = new ArrayList<Client>();
	
	/***************** Constructeur ********************************************/
	
	public Conseiller() {
		super();

	}
	
	public Conseiller(String nom, String prenom, String adresse, int telephone, String login, String password) {
		super(nom, prenom, adresse, telephone);
		this.login = login;
		this.password = password;
	}
	
	/************************Getters et Setters********************************/
	
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

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
			

}
