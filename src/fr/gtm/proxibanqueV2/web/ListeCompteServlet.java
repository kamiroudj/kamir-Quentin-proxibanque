package fr.gtm.proxibanqueV2.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.gtm.proxibanqueV2.domaine.Client;

/**
 * Servlet implementation class ListeCompteServlet
 */
@WebServlet("/ListeCompteServlet")
public class ListeCompteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListeCompteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int idClient = Integer.parseInt(request.getParameter("idClient"));
		
		//List<Compte> comptes = service.findComptesClient(idClient);
		
		//req.setAttribute("comptes", comptes);
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/listeComptes.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
