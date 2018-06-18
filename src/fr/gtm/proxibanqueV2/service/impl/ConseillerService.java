package fr.gtm.proxibanqueV2.service.impl;

import java.sql.SQLException;

import fr.gtm.proxibanqueV2.dao.IConseillerDao;
import fr.gtm.proxibanqueV2.dao.impl.ConseillerDaoImp;
import fr.gtm.proxibanqueV2.domaine.Conseiller;
import fr.gtm.proxibanqueV2.service.IConseillerService;

public class ConseillerService implements IConseillerService{
	
	
	private IConseillerDao dao= new ConseillerDaoImp();

	@Override
	public void verifierLoginPassword(String login, String password) throws LoginException {

		Conseiller conseiller = null;
		if (login != null && password != null) {
			conseiller = dao.findByLogin(login);
		}
		
		System.out.println("conseiller :"+conseiller);
		
		
		if ((conseiller == null) || !conseiller.getPassword().equals(password)) throw new LoginException("Echec authentification Conseiller. Essayer à nouveau");
	}
	
	

}
