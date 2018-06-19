package fr.gtm.proxibanqueV2.service.impl;

import java.util.List;

import fr.gtm.proxibanqueV2.dao.IClientDao;
import fr.gtm.proxibanqueV2.dao.ICompteDao;
import fr.gtm.proxibanqueV2.dao.impl.ClientDaoImp;
import fr.gtm.proxibanqueV2.dao.impl.CompteDaoImp;
import fr.gtm.proxibanqueV2.domaine.Client;
import fr.gtm.proxibanqueV2.domaine.Compte;
import fr.gtm.proxibanqueV2.domaine.CompteCourant;
import fr.gtm.proxibanqueV2.service.IConseillerService;
import fr.gtm.proxibanqueV2.service.SoldeException;


public class ConseillerServiceImpl implements IConseillerService {
	
	private IClientDao dao= new ClientDaoImp();
	private ICompteDao daocp = new CompteDaoImp();

	@Override
	public List<Client> findClients(int idConseiller) {
				
		return dao.findClients(idConseiller);
				
	}

	@Override
	public Client findClientById(int id) {
		
		return dao.findClientById(id);
	}

	@Override
	public void updateClient(Client client) {
	
		dao.updateClient(client);
	}

	@Override
	public List<Compte> findComptesClient(int idClient) {
		
		return daocp.findComptes(idClient);
	}

	@Override
	public List<Compte> findComptes() {
		
		return daocp.findComptes();
	}
	

	@Override
	public void effectuerVirement(int compDeb, int compCre, double montant) throws SoldeException {
		
		Compte compteDebit = daocp.findCompteById(compDeb);
		
		System.out.println("compteDebit " + compteDebit);
		System.out.println("compteDebit " + compDeb);
		
		Compte compteCredit = daocp.findCompteById(compCre);
		
		if (compteDebit instanceof CompteCourant) {
			if (montant > (compteDebit.getSolde() + ((CompteCourant)compteDebit).getDecouvert())) throw new SoldeException("Solde insuffisant");
			compteDebit.setSolde(compteDebit.getSolde() -  montant);
			compteCredit.setSolde(compteCredit.getSolde() + montant);
			daocp.updateCompte(compteDebit);
			daocp.updateCompte(compteCredit);
		}else {			
			if (montant > compteDebit.getSolde()) throw new SoldeException("Solde insuffisant");
			compteDebit.setSolde(compteDebit.getSolde() -  montant);
			compteCredit.setSolde(compteCredit.getSolde() + montant);
			daocp.updateCompte(compteDebit);
			daocp.updateCompte(compteCredit);		
	}
	
	
	}	
	

}
