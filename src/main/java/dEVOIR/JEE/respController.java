package dEVOIR.JEE;

import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/resp")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class respController {
	AdminService a = new AdminService();
	
	@PUT
	 
	@Path("/compte") 
		 public String addCompte( @QueryParam("nomservice") String nomservice ,
				 @QueryParam("NCompte") String NCompte,@QueryParam("montant") double montant
				 ,@QueryParam("id") String idClient ) {
		    
			  return a.addCompte(nomservice, NCompte,montant,idClient);
	     
		}
	
	
	  @GET
		@Path("all/comptes")
		public List<Compte> allComptes() {
			return a.allComptes();
		}

		@GET
		@Path("/compte")
		public Compte getCompt(@QueryParam("id") String NCompt) {
			return a.getCompte(NCompt);
		}
		
		 @GET
		  
		  @Path("/credite") public String credit(@QueryParam("NCompte") String NCompte
				  , @QueryParam("montant") double montant){
			  return a.crediter(NCompte, montant); 
			  }
		 
		 
		 @GET 
			@Path("/annule") 
			 public String annuleTransfer(@QueryParam("id_c") String id_crediteur,
					 @QueryParam("id_d") String id_debiteur, @QueryParam("montant") double montant){
				 return a.annule(id_debiteur, id_crediteur, montant); 
				 } 
	
	
		 @PUT
			@Consumes("Application/Json")
			@Path("ajouterclient")
			public String addClient(Client c) {
				
					return a.addClient(c);
		      

			
			}

			
			@GET
			@Path("all/client")
			public List<Client> allClients() {
				
					return a.allClients();
		        
				
			}

			@GET
			@Path("/client")
			public Client getClient(@QueryParam("id") String id) {
				return a.getClient(id);
			}
	

}
