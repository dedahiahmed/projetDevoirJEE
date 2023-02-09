package dEVOIR.JEE;



import dEVOIR.JEE.AdminService;

import java.util.List;
import java.util.Map;

import jakarta.websocket.server.PathParam;
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
	

	
	
	
	
		
	





//public static String crediter(int nCompte, double montant){
//compte c = comptes.get(nCompte);
//	c.setMontant(c.getMontant()+montant);
//return c.getNCompte()+ " a ete crédite d'un montant de "
//+ montant;
//}
	@PUT
	@Path("upd")
	public String update(@QueryParam("password") String password  ) {
		a.UpdatePass(password);
		return "password change it";
		
	}
	
	
	@POST
	@Path("add/service")
	public String addservice(Service s){
	return a.AddService(s);
	}

	
	
	
	
		
	@POST
	@Path("/compte")
	public String addCompte(@QueryParam("nomService") String nomService, @QueryParam("nCompte") int nCompte, @QueryParam("montant") double montant) {
		return a.addCompte(nomService, nCompte, montant);
		
	}


	
	@GET
	@Path("all/service")
	public Map<String,Service>AllServices(){
	return Database.getServices();
	}

	@GET
	@Path("all/comptes")
	public Map<Integer, compte> allComptes(){
	return Database.getComptes();
	}
	
//	@GET
//	@Path("compte/{NCompte}/credité/{montant}")
//	public String versement(@PathParam("NCompte") int NCompte,
//	@PathParam("montant") double crediter){
//	return AdminService.crediter(NCompte,crediter);
//	}
	@POST
	@Path("/find")
	
	public  Service find(@QueryParam("nomService") String nomService) {
		
		return a.findService(nomService);
	}
	
}
