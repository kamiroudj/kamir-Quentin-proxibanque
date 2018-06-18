package fr.gtm.proxibanqueV2.service;

import java.util.List;

import fr.gtm.proxibanqueV2.domaine.Client;
import fr.gtm.proxibanqueV2.domaine.Conseiller;

public interface IConseillerService {
	
	public List<Client> findClients(int idConseiller);
	
	public Client findClientById(int id);

	public void updateClient(Client client);
	
	
	//crud
	
	//create compte
	//find by numero
	//find liste comptes
	//update compte
	//delete compte
	
	
	//virements compte a compte

}
