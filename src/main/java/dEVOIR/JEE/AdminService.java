package dEVOIR.JEE;

import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import jakarta.websocket.server.PathParam;
@Path("/admin")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AdminService {
	
	@GET
    @Path("/rec")
    public  Map<String, Admin> getValue() {
		 return Database.admins ;}
	
	 public static String changePassword(String login,String password ,String newPassword) {
	        Admin admin = Database.admins.get(login);
	        if (admin == null) {
	        	return "Cette utilisateur n'existe pas !!";
	        	} else if (!password.equals(admin.getPassword())) {
	        	return "Mot de passe incorrecte !!";
	        	} else {
	        	admin.setPassword(newPassword);
	        	Database.admins.put(admin.getLogin(), admin);
	        	return "Mot de passe est modifié avec succès";
	        	}
	    }
	
	
	@PUT
	@Path("/ChangePassword/{login}/{Password}/{NewPassword}")
	public String ChangePassword(@PathParam("login") String login,
	@PathParam("password") String password,
	@PathParam("newpassword") String newpassword) {
	return changePassword(login, password, newpassword);
	}
	
}
