package fr.gtm.proxibanqueV2.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.gtm.proxibanqueV2.domaine.Client;
import fr.gtm.proxibanqueV2.domaine.Conseiller;
import fr.gtm.proxibanqueV2.service.IConseillerService;
import fr.gtm.proxibanqueV2.service.ILoginService;
import fr.gtm.proxibanqueV2.service.impl.ConseillerServiceImpl;


@WebServlet("/ModifierClientServlet")
public class ModifierClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IConseillerService service;
	
	
	@Override
	public void init() throws ServletException {
		service = new ConseillerServiceImpl();
	}
	
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int idClient = Integer.parseInt(req.getParameter("idClient"));
		
		Client client = service.findClientById(idClient);
		
		req.setAttribute("client", client);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/update.jsp").forward(req, resp);
	}
	
	
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	Client client = new Client();
	int id = Integer.parseInt(req.getParameter("id"));
	client.setId(id);
	String nom = req.getParameter("nom");
	client.setNom(nom);
	String prenom = req.getParameter("prenom");
	client.setPrenom(prenom);
	String adresse = req.getParameter("adresse");
	client.setAdresse(adresse);
	int telephone = Integer.parseInt(req.getParameter("telephone"));
	client.setTelephone(telephone);
	
	service.updateClient(client);

	
	this.getServletContext().getRequestDispatcher("/listClient").forward(req,resp);
}




}
