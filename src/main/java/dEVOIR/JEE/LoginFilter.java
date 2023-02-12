package dEVOIR.JEE;



import jakarta.servlet.Filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpFilter;

import java.io.IOException;
import java.io.PrintWriter;


public class LoginFilter extends HttpFilter implements Filter {
       
	 private boolean verify=false;
   
	
	

	private static final long serialVersionUID = 1L;
	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

	       
	        response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String login=request.getParameter("login");
			String password=request.getParameter("password");
			
			verify=Admin.checkLogin(login, password);
			if(verify==false) {
				
				out.println("<HTML>");
				out.println("<HEAD><TITLE>Ereur</TITLE></HEAD>");
				out.println("<BODY>");
				out.println("<H1>Login ou Mot de passe invalide!!!</H1>");
				out.println("</BODY></HTML>");
				out.close();
				
				
				
			}
			else {
				new Accueil();
				if(Database.Clients.containsKey(login)==true) {
				if(Database.Clients.get(login).getPassword().equals(password)) {
					if(Database.responsables.containsKey(login)==true && Database.responsables.get(login).getPassword().equals(password)) {
						
					
					new Accueil();
					Accueil.mapUsers.clear();
					
				}	
				
				}
				
			}
			}
			 

		
			chain.doFilter(request, response);
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}
	public void destroy() {
		// TODO Auto-generated method stub
	}
}
