
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import eu.ensup.messagerie.mamessageriedomaine.User;
import eu.ensup.messagerie.mamessageriedao.UserDao;

/**
 * Servlet implementation class MaServlet
 */
@WebServlet("/MaServlet")
public class MaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		traitement(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		traitement(request, response);
	}
	
	protected void traitement(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		RequestDispatcher dispatcher;
		UserDao ud = new UserDao();
		User u = ud.readUserbyId(1);
		
				String name = request.getParameter("user_name");
				String mail = request.getParameter("user_mail");
				String msg = request.getParameter("user_mail");
								
				User user = new User(name,mail,msg);
				HttpSession maSession = request.getSession();
				maSession.setAttribute("utilisateur", u);
				
				if((u.getName()).equalsIgnoreCase(name) && ((u.getMail()).equalsIgnoreCase(mail))){
					
					dispatcher = request.getRequestDispatcher("resultatEnvoi.jsp");
					dispatcher.forward(request, response);
					
				} else {
					dispatcher = request.getRequestDispatcher("messagerie.html");
					dispatcher.forward(request, response);
				}
				
				
				
				
				
	}
	
	// Continuez ici : http://objis.com/tutoriel-jee-gestion-dune-session/

}
