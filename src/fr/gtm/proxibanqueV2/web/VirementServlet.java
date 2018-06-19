package fr.gtm.proxibanqueV2.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.gtm.proxibanqueV2.domaine.Compte;
import fr.gtm.proxibanqueV2.service.IConseillerService;
import fr.gtm.proxibanqueV2.service.impl.ConseillerServiceImpl;

/**
 * Servlet implementation class VirementServlet
 */

public class VirementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IConseillerService service;
       

@Override
public void init() throws ServletException {
	service = new ConseillerServiceImpl();
}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int idClient = Integer.parseInt(request.getParameter("idClient"));
		
		List<Compte> comptes = service.findComptesClient(idClient);
		
		request.setAttribute("comptes", comptes);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/virements.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String valeur = request.getParameter("select1");
		
		System.out.println(valeur);
		doGet(request, response);
	}

}
