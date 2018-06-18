package fr.gtm.proxibanqueV2.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import fr.gtm.proxibanqueV2.dao.IConseillerDao;
import fr.gtm.proxibanqueV2.domaine.Conseiller;
import fr.gtm.proxibanqueV2.domaine.Personne;
import fr.gtm.proxibanqueV2.tools.JdbcUtil;

public class ConseillerDaoImp implements IConseillerDao {

	@Override
	public Conseiller findByLogin(String login) {
		
		Connection cn; PreparedStatement pst=null; ResultSet rs = null;
		Conseiller conseiller = null;
		
		cn = JdbcUtil.seConnecter();
		
		try {
			String sql = "SELECT * FROM `conseiller` c , `personne` p WHERE c.id = p.id and login = ?";
			pst = cn.prepareStatement(sql);
			pst.setString(1, login);
			rs = pst.executeQuery();
			
			if (rs.next()) {
				conseiller = new Conseiller();
				conseiller.setId(rs.getInt("id"));
				conseiller.setLogin(rs.getString("login"));
				conseiller.setPassword(rs.getString("password"));
				conseiller.setNom(rs.getString("nom"));
				conseiller.setPrenom(rs.getString("prenom"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		JdbcUtil.seDeconnecter(cn, pst, null);	
			
		return conseiller;
	}

}