package fr.gtm.proxibanqueV2.service;

import fr.gtm.proxibanqueV2.domaine.Conseiller;
import fr.gtm.proxibanqueV2.service.impl.LoginException;

public interface ILoginService {
	
	
	
	//crud
	
	//verifier login et mot de passe
	
	
	public Conseiller verifierLoginPassword(String login, String password) throws LoginException;

}
