package fr.gtm.proxibanqueV2.dao;

import java.util.List;

import fr.gtm.proxibanqueV2.domaine.Client;
import fr.gtm.proxibanqueV2.domaine.Conseiller;

public interface IClientDao {

	
	
	public List<Client> findClients(Conseiller conseiller);
	
}
