package dEVOIR.JEE;
import java.util.Map;



public class ClientService {
	
	private  Map<Integer , Client> Clients = Database.getClients();

	public Map<Integer , Client> getClients() {
		return Clients;
	}

}
