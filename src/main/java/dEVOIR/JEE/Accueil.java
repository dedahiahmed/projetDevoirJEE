package dEVOIR.JEE;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



public class Accueil extends HttpServlet {

private static final long serialVersionUID = 1L;
	
	public static HashMap<String,String> mapUsers = new  HashMap <String,String> (); 
	
public void service(HttpServletRequest req,HttpServletResponse response) throws ServletException, IOException{
		
		response.setContentType("text/html");
	
		 PrintWriter out1 = response.getWriter ();  
		  String login = req.getParameter("login");
		 	mapUsers.put(login,login);
		 	
		 
		  
	      out1.print ( "<br> bienvenue <br>"+login );
	      out1.close();
	
}
}
