package fr.gtm.proxibanqueV2.domaine;

public class Client {
	
	private Integer id;
	private String nom;
	private String prenom;
	private String adresse;
	
	/***************** constructeur *******************************************/
	
	public Client() {
		
	}
	
	
	
	
	public Client(String nom, String prenom, String adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	
	
	/*********************** getters et setters *******************************/
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
