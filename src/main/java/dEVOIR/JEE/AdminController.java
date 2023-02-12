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
	
	AdminService a = new AdminService();
	
	@POST
	@Path("/login")
	public static String Login(@QueryParam("login") String login , @QueryParam("password") String password ) {
		return Admin.CheckLogin(login,password);
		
	}
	


	@PUT
	@Path("upd")
	public String update(@QueryParam("password") String password  ) {
		a.UpdatePass(password);
		return "password change it";
		
	}
	
	
	@PUT
	@Path("add/service")
	public String addservice(Service s){
	return a.AddService(s);
	}
	@PUT
	@Path("add/client")
	public String addClient(@QueryParam("nom") String nom,@QueryParam("tel") int telephone
			,@QueryParam("pass") String pass , @QueryParam("login") String login) {
		return a.addClient(nom, telephone, pass,login);
	}
		
	@PUT
	@Path("/compte")
	public String addCompte(@QueryParam("nomService") String nomService, 
			@QueryParam("Ncompte") int Ncompte, @QueryParam("tel") int tel,@QueryParam("montant") double montant) {
		return a.addCompte(nomService, Ncompte, montant , tel);
		
	}


	
	@GET
	@Path("all/service")
	public List<Service>AllServices(){
	return a.allServices();
	}

	@GET
	@Path("all/comptes")
	public Map<Integer, compte> allComptes(){
	return Database.getComptes();
	}
	

	@POST
	@Path("/findS")
	
	public  Service findservice(@QueryParam("nomService") String nomService) {
		
		return a.findService(nomService);
	}
	
	@POST
	@Path("/findC")
	
	public  compte findcompte(@QueryParam("Ncompte") int Ncompte) {
		
		return a.findCompte(Ncompte);
	}
	
	@PUT
	@Path("/credité")
	public String versement(@QueryParam("NCompte") int NCompte,
			@QueryParam("montant") double crediter){
	return a.crediter(NCompte,crediter);
	}
	
	@PUT
	@Path("/resp")
	public String AddRes( Responsable r) {
		return a.AddResp(r);
	}
	
	
}
