package dEVOIR.JEE;





import java.util.List;
import java.util.Map;


import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;     
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/admin")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AdminController {
	
	public boolean isAdmin() {
		 new Accueil();
		if (Accueil.mapUsers.containsKey("admin") == true) {
			return true;
		}
		return false;
	}
	
	AdminService a = new AdminService();
	
	@POST
	@Path("/login")
	public static String Login(@QueryParam("login") String login , @QueryParam("password") String password ) {
		return Admin.CheckLogin(login,password);
		
	}
	


	@PUT
	@Path("/upd")
	public String update(@QueryParam("password") String password  ) {
		if(isAdmin()==true) {
		a.UpdatePass(password);
		return "password change it";}
		else
			return "error user not found";
		
	}
		
	
	@PUT
	@Path("add/service")
	public String addservice(Service s){
		if(isAdmin()==true) 
	return a.AddService(s);
		else
			return "error user not found";
	}
	@PUT
	@Path("add/client")
	public String addClient(@QueryParam("nom") String nom,@QueryParam("tel") int telephone
			,@QueryParam("password") String pass , @QueryParam("login") String login) {
		if(isAdmin()==true) 
		return a.addClient(nom, telephone, pass,login);
		else
		return "error user not found";
	}
		
	@PUT
	@Path("/compte")
	public String addCompte(@QueryParam("nomService") String nomService, 
			@QueryParam("Ncompte") int Ncompte, @QueryParam("tel") int tel,@QueryParam("montant") double montant) {
		if(isAdmin()==true)
		return a.addCompte(nomService, Ncompte, montant , tel);
		else
			return "error user not found";
	}


	
	@GET
	@Path("all/service")
	public List<Service>AllServices(){
		if(isAdmin()==true)
	return a.allServices();
		else
			return null;
	}

	@GET
	@Path("all/comptes")
	public Map<Integer, compte> allComptes(){
		if(isAdmin()==true)
	return Database.getComptes();
		else
			return null;
	}
	
	@GET
	@Path("all/clients")
	public Map<Integer, Client> allclient(){
		if(isAdmin()==true)
	return Database.getClients();
		else
			return null;
	}

	@POST
	@Path("/findS")
	
	public  Service findservice(@QueryParam("nomService") String nomService) {
		if(isAdmin()==true)
		
		return a.findService(nomService);
		else
			return null;
	}
	
	@POST
	@Path("/findC")
	
	public  compte findcompte(@QueryParam("Ncompte") int Ncompte) {
		if(isAdmin()==true)
		return a.findCompte(Ncompte);
		else
			return null;
	}
	
	@PUT
	@Path("/credité")
	public String versement(@QueryParam("NCompte") int NCompte,
			@QueryParam("montant") double crediter){
		if(isAdmin()==true)
	return a.crediter(NCompte,crediter);
		else 
			return "error user not found";
	}
	
	@PUT
	@Path("/resp")
	public String AddRes( Responsable r) {
		if(isAdmin()==true)
		return a.AddResp(r);
		else 
			return "error user not found";
	}
	
	
}
