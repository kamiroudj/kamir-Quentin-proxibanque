package fr.gtm.proxibanqueV2.dao;

import java.sql.SQLException;

import fr.gtm.proxibanqueV2.domaine.Conseiller;

public interface IConseillerDao {
	
	//crud
	
	public Conseiller findByLogin(String login);
	
	
	
}	