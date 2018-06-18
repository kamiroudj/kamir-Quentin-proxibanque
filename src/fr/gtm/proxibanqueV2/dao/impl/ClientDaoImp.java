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
	public List<Client> findClients(int idConseiller) {
		
		Connection cn; PreparedStatement pst=null; ResultSet rs = null;		
		cn = JdbcUtil.seConnecter();
		Client client = null;
		List<Client> clients = new ArrayList();

		try {
			String sql = "SELECT * FROM `conseiller_clients` cc , personne p WHERE cc.idClient = p.id and cc.idConseiller = ?";
			pst = cn.prepareStatement(sql);
			
			pst.setInt(1, idConseiller);
			rs = pst.executeQuery();
			
			while (rs.next()) {
				client = new Client();
				client.setId(rs.getInt("id"));
				client.setNom(rs.getString("nom"));
				client.setPrenom(rs.getString("prenom"));
				client.setAdresse(rs.getString("adresse"));
				client.setTelephone(rs.getInt("telephone"));
				clients.add(client);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		JdbcUtil.seDeconnecter(cn, pst, null);
		
		
		return clients;
	}

	@Override
	public Client findClientById(int id) {
		
		Connection cn; PreparedStatement pst=null; ResultSet rs = null;		
		cn = JdbcUtil.seConnecter();
		Client client = null;

		try {
			String sql = "SELECT * FROM personne p WHERE p.id = ?";
			pst = cn.prepareStatement(sql);
			
			pst.setInt(1, id);
			rs = pst.executeQuery();
			
			if (rs.next()) {
				client = new Client();
				client.setId(rs.getInt("id"));
				client.setNom(rs.getString("nom"));
				client.setPrenom(rs.getString("prenom"));
				client.setAdresse(rs.getString("adresse"));
				client.setTelephone(rs.getInt("telephone"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		JdbcUtil.seDeconnecter(cn, pst, null);
		
		
		return client;

	}

	@Override
	public void updateClient(Client client) {
		
		Connection cn; PreparedStatement pst=null; ResultSet rs = null;		
		cn = JdbcUtil.seConnecter();
		Client cl = null;

		try {
			String sql = "UPDATE `personne` SET `nom`=?,`prenom`=?,`adresse`=?,`telephone`=? WHERE id = ?";
			pst = cn.prepareStatement(sql);
			
			pst.setString(1, client.getNom());
			pst.setString(2, client.getPrenom());
			pst.setString(3, client.getAdresse());
			pst.setInt(4, client.getTelephone());
			pst.setInt(5, client.getId());
			pst.executeUpdate();
						
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		JdbcUtil.seDeconnecter(cn, pst, null);
		
		
	}

}
