package fr.gtm.proxibanqueV2.dao;

import java.util.List;

import fr.gtm.proxibanqueV2.domaine.Client;
import fr.gtm.proxibanqueV2.domaine.Compte;

public interface IClientDao {

	
	
	public List<Client> findClients(int idConseiller);

	public Client findClientById(int id);

	public void updateClient(Client client);

	public List<Compte> findComptes(int idClient);
	
}
