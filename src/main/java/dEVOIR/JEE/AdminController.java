package dEVOIR.JEE;

import java.util.List;





import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;

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
	public boolean isAdmin() {
		
		if (Accueil.mapUsers.containsKey("admin")==true) {
			return true;
		}
		return false;
	}
	//update password 
	@PUT
	@Path("/upd")
	public String update(@QueryParam("password") String password  ) {
		if(isAdmin()==true) {
		a.UpdatePass(password);
		return "password change it";}
		else
			return "error user not found";
		
	}
	
	
	//client services
	
	@PUT
	@Consumes("Application/Json")
	@Path("ajouterclient")
	public String addClient(Client c) {
		if( isAdmin()==true) {
			return a.addClient(c);
        }else
        {
        	return "error user not found";
        }

	
	}

	
	@GET
	@Path("all/client")
	public List<Client> allClients() {
		if( isAdmin()==true) 
			return a.allClients();
		else
			return null ;
		
	}

	@GET
	@Path("/client")
	public Client getClient(@QueryParam("id") String id) {
		if( isAdmin()==true) 
		return a.getClient(id);
		else
			return null;
	}

	
	@DELETE
	@Path("/delete")
	public String deleteClient(@QueryParam("id") String id) {
		if( isAdmin()==true) {
			return a.deleteClient(id);
        }else
        {
        	return "error user not found";
        }
		
	}
	
	
	//Service Services
	
	@PUT
	@Path("add/service")
	public String addservice(Service s) {
        if( isAdmin()==true) {
		return a.Addservice(s);
        }else
        {
        	return "error user not found";
        }
	}
	// compte Services
	
	@PUT
	 
	@Path("/compte") 
		 public String addCompte( @QueryParam("nomservice") String nomservice ,
				 @QueryParam("NCompte") String NCompte,@QueryParam("montant") double montant
				 ,@QueryParam("id") String idClient ) {
		    if( isAdmin()==true) {
			  return a.addCompte(nomservice, NCompte,montant,idClient);
	      }else
	      {
	      	return "error user not found";
	      }
		}
	
	
	  @GET
		@Path("all/comptes")
		public List<Compte> allComptes() {
		  if( isAdmin()==true)
			return a.allComptes();
		  else return null;
		}

		@GET
		@Path("/compte")
		public Compte getCompt(@QueryParam("id") String NCompt) {
			if( isAdmin()==true)
			return a.getCompte(NCompt);
			else return null;
		}
		
		 @GET
		  
		  @Path("/credite") public String credit(@QueryParam("NCompte") String NCompte
				  , @QueryParam("montant") double montant){
			 if( isAdmin()==true)
			  return a.crediter(NCompte, montant); 
			 else 
				 return null;
			  }
		 
		 
		 
		 @GET 
			@Path("/annule") 
			 public String annuleTransfer(@QueryParam("id_c") String id_crediteur,
					 @QueryParam("id_d") String id_debiteur, @QueryParam("montant") double montant){
			 if( isAdmin()==true)
				 return a.annule(id_debiteur, id_crediteur, montant); 
			 else
				 return "user not found";
				 }  
		 
		 //Responsable Services 
		 
		 	@PUT
			@Path("/responsable")
			public String addResponsable(@QueryParam("id") String id, @QueryParam("nom") String nom, 
					 @QueryParam("nomService") String nomService) {
				if( isAdmin()==true) {
					return a.addResponsable(id,nom,nomService);
		        }else
		        {
		        	return "error user not found";
		        }

			
			}
		 	
		 	@GET
			@Path("all/resp")
			public List<Responsable> allResponsables() {
		 		if( isAdmin()==true) 
					return a.allResponsable();
					else
			        
			        	return null;
			        

				
			}

			@GET
			@Path("/resp")
			public Client getresp(@QueryParam("id") String login) {
				if( isAdmin()==true)
				return a.getClient(login);
				else
			        
		        	return null;
			}

			
			@DELETE
			@Path("/deleteresp")
			public String delResp(@QueryParam("id") String id) {
				if( isAdmin()==true) 
					return a.deleteResponsable(id) ;
		        
		        
		        	return "error user not found";
		        
		 	

			}

	
}
