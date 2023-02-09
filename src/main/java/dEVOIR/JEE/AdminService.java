package dEVOIR.JEE;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AdminService {
	public  Map<String,Service> services = Database.getServices();
	
	public  Map<Integer,compte> comptes = Database.getComptes();
	
	
	
public  String UpdatePass(String password) {
		
		Admin.setPassword(password);
		return "password change it";
	
	
}



public  String AddService(Service s ) {
	
	services.put(s.getNomService(), s);
	return s.getIdService() +" was add succefuly";
}





public  String addCompte(String nomService,  int nCompte,  double montant) {
	
	Service service = services.get(nomService);
	if (service != null) {
		comptes.put(nCompte, new compte(nCompte, montant, service));
		return "ajouter avec succés";
	} else {
		return "service not found";
	}
}


public  Service findService(String nomService) {
	
	Service service = services.get(nomService);
	if (service != null) {
		return service ;
	} else {
		return null;
	}
}
public  compte findCompte(int nCompte) {
	
	compte cmpt = comptes.get(nCompte);
	if (cmpt != null) {
		return cmpt ;
	} else {
		return null;
	}
}


//public List<Service> allServices() {
//return new ArrayList<Service>(services.values());
//}

public List<compte> allComptes() {
	
return new ArrayList<compte>(comptes.values());
}



}
