package fr.gtm.proxibanqueV2.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.gtm.proxibanqueV2.service.IConseillerService;
import fr.gtm.proxibanqueV2.service.impl.ConseillerService;
import fr.gtm.proxibanqueV2.service.impl.LoginException;

/**
 * Servlet implementation class ConseillerServlet
 */

public class ConseillerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IConseillerService service;

	@Override
	public void init() throws ServletException {
		service= new ConseillerService();
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/auth.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		System.out.println("login =" + login);
		System.out.println("password =" + password);
		
		String erreur = "";
		
		try {
			service.verifierLoginPassword(login, password);
		} catch (LoginException e) {
			erreur = e.getMessage();
		}
		
		System.out.println("erreur =" + erreur);
		
		if (!erreur.equals("")) {
			request.setAttribute("erreur", erreur);
			doGet(request, response);
		}else {
			this.getServletContext().getRequestDispatcher("/WEB-INF/views/listeClients.jsp").forward(request, response);
		}

	}

}
