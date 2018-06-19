package fr.gtm.proxibanqueV2.tools;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
	
	private static final String url = "jdbc:mysql://localhost/proxibanquev2";
	private static final String login = "root";
	private static final String passwd = "";
	
	private JdbcUtil() {}

	
	public static Connection seConnecter() {
		Connection cnx = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			cnx = DriverManager.getConnection(url, login, passwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnx;
	}
	
	public static void seDeconnecter(Connection cnx, PreparedStatement pstmt, ResultSet rs) {
		try {
			if (cnx != null)
				cnx.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (pstmt != null)
				pstmt.close();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

	}
	
	public static void seDeconnecter(Connection cnx, Statement pstmt, ResultSet rs) {
		try {
			if (cnx != null)
				cnx.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (pstmt != null)
				pstmt.close();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

	}

}
