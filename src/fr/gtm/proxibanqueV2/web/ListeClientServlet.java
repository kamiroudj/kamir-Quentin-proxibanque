package fr.gtm.proxibanqueV2.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListeClientServlet
 */
@WebServlet("/ListeClientServlet")
public class ListeClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ListeClientServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/listeClients.jsp").forward(request, response);
	}



}
