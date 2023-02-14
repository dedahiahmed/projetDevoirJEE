package dEVOIR.JEE;



import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/client")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ClientController {
	ClientService c = new ClientService();
	
	 @GET
	 @Path("/versement") 
		 public String versement(@QueryParam("id") String id, @QueryParam("montant") double montant){ 
			 return c.versement(id, montant);  
			 }

	 
	 @GET
	 @Path("retrait") 
	 public String retrait(@QueryParam("id") String id, @QueryParam("montant") double montant){ 
		 return c.retrait(id, montant);  
		 } 
	 
	 @GET 
		@Path("/transfer") 
		 public String transfertArgent(@QueryParam("id_c") String id_crediteur,
				 @QueryParam("id_d") String id_debiteur, @QueryParam("montant") double montant){
			 return c.transfert(id_debiteur, id_crediteur, montant); 
			 }  
	 

}
