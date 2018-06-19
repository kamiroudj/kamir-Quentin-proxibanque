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
import fr.gtm.proxibanqueV2.service.SoldeException;
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
		
		List<Compte> comptes2 = service.findComptes();
		
		request.setAttribute("comptes2", comptes2);
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/virements.jsp?idClient=" + idClient).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int compDeb = Integer.parseInt(request.getParameter("select1"));
		int compCre = Integer.parseInt(request.getParameter("select2"));
		String montantSaisi = request.getParameter("montant");
		String erreur;
		if (montantSaisi.isEmpty()) {
			erreur =" Veuillez saisir un montant";
			request.setAttribute("erreur", erreur);
			doGet(request,response);
		}
		double montant = Double.parseDouble(request.getParameter("montant"));


		
		if (compDeb == compCre) {
			erreur =" Veuillez saisir deux comptes différents";
			request.setAttribute("erreur", erreur);
			doGet(request,response);
		}
		
		int idClient = Integer.parseInt(request.getParameter("idClient"));
		
		try {
			service.effectuerVirement(compDeb, compCre, montant);
			erreur="Le virement est bien efffectué";
		} catch (SoldeException e) {
			erreur = e.getMessage();
		}
		
		request.setAttribute("erreur", erreur);
		doGet(request, response);
		
	}

}
