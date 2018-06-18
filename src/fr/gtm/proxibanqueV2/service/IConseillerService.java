package fr.gtm.proxibanqueV2.service;

import fr.gtm.proxibanqueV2.service.impl.LoginException;

public interface IConseillerService {
	
	
	
	//crud
	
	//verifier login et mot de passe
	
	
	public void verifierLoginPassword(String login, String password) throws LoginException;

}
