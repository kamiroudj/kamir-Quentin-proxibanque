package fr.gtm.proxibanqueV2.service.impl;

import java.util.List;

import fr.gtm.proxibanqueV2.dao.IClientDao;
import fr.gtm.proxibanqueV2.dao.impl.ClientDaoImp;
import fr.gtm.proxibanqueV2.domaine.Client;
import fr.gtm.proxibanqueV2.domaine.Conseiller;
import fr.gtm.proxibanqueV2.service.IConseillerService;


public class ConseillerServiceImpl implements IConseillerService {
	
	private IClientDao dao= new ClientDaoImp();

	@Override
	public List<Client> findClients(Conseiller conseiller) {
				
		return dao.findClients(conseiller);
				
	}

}
