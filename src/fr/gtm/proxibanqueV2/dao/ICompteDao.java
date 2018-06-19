package fr.gtm.proxibanqueV2.dao;

import java.util.List;

import fr.gtm.proxibanqueV2.domaine.Compte;

public interface ICompteDao {

	public Compte findCompteById(int compDeb);

	public List<Compte> findComptes(int idClient);

	public List<Compte> findComptes();

	public void updateCompte(Compte compteDebit);

}
