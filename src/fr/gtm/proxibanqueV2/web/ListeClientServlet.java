package fr.gtm.proxibanqueV2.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.gtm.proxibanqueV2.domaine.Client;
import fr.gtm.proxibanqueV2.domaine.Conseiller;
import fr.gtm.proxibanqueV2.service.IConseillerService;
import fr.gtm.proxibanqueV2.service.impl.ConseillerServiceImpl;


/**
 * Servlet implementation class ListeClientServlet
 * Affiche la vue 'listeClients' 
 */
public class ListeClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IConseillerService service;
       

	@Override
	public void init() throws ServletException {
		service= new ConseillerServiceImpl();		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/listeClients.jsp").forward(request, response);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Client> clients = new ArrayList<Client>();
		Conseiller conseiller= (Conseiller)(req.getSession().getAttribute("conseiller"));
		int idConseiller = conseiller.getId();
		
		clients = service.findClients(idConseiller);
		req.getSession().setAttribute("clients", clients);
		doGet(req, resp);
	}



}
