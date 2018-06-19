package fr.gtm.proxibanqueV2.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.gtm.proxibanqueV2.dao.ICompteDao;
import fr.gtm.proxibanqueV2.domaine.Client;
import fr.gtm.proxibanqueV2.domaine.Compte;
import fr.gtm.proxibanqueV2.domaine.CompteCourant;
import fr.gtm.proxibanqueV2.domaine.CompteEpargne;
import fr.gtm.proxibanqueV2.tools.JdbcUtil;

public class CompteDaoImp implements ICompteDao {
	
	
	
	@Override
	public List<Compte> findComptes(int idClient) {
		
		Connection cn; PreparedStatement pst=null; ResultSet rs = null;		
		cn = JdbcUtil.seConnecter();
		Compte compte = null;
		List<Compte> comptes = new ArrayList();

		try {
			String sql = "SELECT * FROM `client_compte` cc, comptes c WHERE cc.idcompte = c.id and cc.idClient= ?";
			pst = cn.prepareStatement(sql);
			
			pst.setInt(1, idClient);
			rs = pst.executeQuery();
			String typeCompte;
			
			while (rs.next()) {
				typeCompte = rs.getString("typeCompte");
				if (typeCompte.equals("courant")) {
					compte = new CompteCourant();
					compte.setNumeroCompte(rs.getInt("id"));
					compte.setSolde(rs.getDouble("solde"));
					((CompteCourant)compte).setDecouvert(rs.getDouble("decouvert"));
				}else {
					compte = new CompteEpargne();					
					compte.setNumeroCompte(rs.getInt("id"));
					compte.setSolde(rs.getDouble("solde"));
					((CompteEpargne)compte).setTaux(rs.getDouble("taux"));
				}


				comptes.add(compte);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		JdbcUtil.seDeconnecter(cn, pst, null);
		
		
		return comptes;
	}
	
	
	@Override
	public List<Compte> findComptes() {
		Connection cn; PreparedStatement pst=null; ResultSet rs = null;		
		cn = JdbcUtil.seConnecter();
		Compte compte = null;
		List<Compte> comptes = new ArrayList();

		try {
			String sql = "SELECT * FROM  comptes";
			pst = cn.prepareStatement(sql);			
			rs = pst.executeQuery();
			String typeCompte;
			
			while (rs.next()) {
				typeCompte = rs.getString("typeCompte");
				if (typeCompte.equals("courant")) {
					compte = new CompteCourant();
					compte.setNumeroCompte(rs.getInt("id"));
					compte.setSolde(rs.getDouble("solde"));
					((CompteCourant)compte).setDecouvert(rs.getDouble("decouvert"));
				}else {
					compte = new CompteEpargne();					
					compte.setNumeroCompte(rs.getInt("id"));
					compte.setSolde(rs.getDouble("solde"));
					((CompteEpargne)compte).setTaux(rs.getDouble("taux"));
				}
				comptes.add(compte);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		JdbcUtil.seDeconnecter(cn, pst, null);
		
		
		return comptes;
	}

	@Override
	public Compte findCompteById(int id) {
		
		Connection cn; PreparedStatement pst=null; ResultSet rs = null;		
		cn = JdbcUtil.seConnecter();
		Compte compte = null;
		String typeCompte;

		try {
			String sql = "SELECT * FROM compte c WHERE c.id = ?";
			pst = cn.prepareStatement(sql);
			
			pst.setLong(1, id);
			rs = pst.executeQuery();
			
			if (rs.next()) {
				typeCompte = rs.getString("typeCompte");
				if (typeCompte.equals("courant")) {
					compte = new CompteCourant();
					compte.setNumeroCompte(rs.getInt("id"));
					compte.setSolde(rs.getDouble("solde"));
					((CompteCourant)compte).setDecouvert(rs.getDouble("decouvert"));
				}else {
					compte = new CompteEpargne();					
					compte.setNumeroCompte(rs.getInt("id"));
					compte.setSolde(rs.getDouble("solde"));
					((CompteEpargne)compte).setTaux(rs.getDouble("taux"));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		JdbcUtil.seDeconnecter(cn, pst, null);	
		return compte;
	}


	@Override
	public void updateCompte(Compte compte) {
		Connection cn; PreparedStatement pst=null; ResultSet rs = null;		
		cn = JdbcUtil.seConnecter();
		Client cl = null;

		try {
			String sql = "UPDATE `compte` SET `solde`=? WHERE id = ?";
			pst = cn.prepareStatement(sql);
			
			pst.setDouble(1, compte.getSolde());
			pst.setLong(2, compte.getNumeroCompte());
			pst.executeUpdate();
						
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		JdbcUtil.seDeconnecter(cn, pst, null);
		
	}

}
