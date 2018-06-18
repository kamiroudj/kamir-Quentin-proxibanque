package fr.gtm.proxibanqueV2.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.gtm.proxibanqueV2.dao.IClientDao;
import fr.gtm.proxibanqueV2.domaine.Client;
import fr.gtm.proxibanqueV2.domaine.Conseiller;
import fr.gtm.proxibanqueV2.tools.JdbcUtil;

public class ClientDaoImp implements IClientDao {
	
	

	@Override
	public List<Client> findClients(Conseiller conseiller) {
		
		Connection cn; PreparedStatement pst=null; ResultSet rs = null;		
		cn = JdbcUtil.seConnecter();
		Client client = null;
		List<Client> clients = new ArrayList();
		
		System.out.println(" conseiller dao "+conseiller);

		try {
			String sql = "SELECT * FROM `client` c, conseiller_clients cc WHERE cc.idClients = c.id and idConseiller=?";
			pst = cn.prepareStatement(sql);
			
			System.out.println(" pst "+pst);
			pst.setInt(1, conseiller.getId());
			rs = pst.executeQuery();
			
			while (rs.next()) {
				client = new Client();
				client.setId(rs.getInt("id"));
				client.setNom(rs.getString("nom"));
				client.setPrenom(rs.getString("prenom"));
				client.setAdresse(rs.getString("adresse"));
				clients.add(client);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		JdbcUtil.seDeconnecter(cn, pst, null);
		
		
		return clients;
	}

}
