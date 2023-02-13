package dEVOIR.JEE;




import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@Path("/ClientController")
public class ClientController {
	ClientService c = new ClientService();
	
	@PUT
	@Path("client/transfer")
	public String transfertArgent(@QueryParam("Tel_crediteur") int
			Tel_crediteur, @QueryParam("Tel_debiteur") int
	Tel_debiteur, @QueryParam("montant") double montant){
	return ClientService.transfert(Tel_debiteur,Tel_crediteur, montant);
	}
	
	
	

}
