package fr.gtm.proxibanqueV2.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.gtm.proxibanqueV2.domaine.Conseiller;
import fr.gtm.proxibanqueV2.service.ILoginService;
import fr.gtm.proxibanqueV2.service.impl.LoginServiceImpl;
import fr.gtm.proxibanqueV2.service.impl.LoginException;

/**
 * Servlet implementation class ConseillerServlet
 */

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ILoginService service;

	@Override
	public void init() throws ServletException {
		service= new LoginServiceImpl();
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		Conseiller conseiller = null;
		
		String erreur = "";
		
		try {
			conseiller = service.verifierLoginPassword(login, password);
		} catch (LoginException e) {
			erreur = e.getMessage();
		}
		
		//request.getSession().setAttribute("conseiller",  conseiller.getNom());
		
		if (!erreur.equals("")) {
			request.setAttribute("erreur", erreur);
			doGet(request, response);
		}else {
			
			request.setAttribute("conseiller", conseiller);
			this.getServletContext().getRequestDispatcher("/listClient").forward(request,response);
			//this.getServletContext().getRequestDispatcher("/WEB-INF/views/listeClients.jsp").forward(request, response);
		}

	}

}
