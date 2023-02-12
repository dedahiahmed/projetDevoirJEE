 package dEVOIR.JEE;
 

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AdminService {
	private  Map<String,Service> services = Database.getServices();
	
	private   Map<Integer,compte> comptes = Database.getComptes();
	
	private  Map<Integer , Client> Clients = Database.getClients();
	
	private  Map<String , Responsable> responsables = Database.getResponsables();
	
	Client c =new Client();
	Responsable r = new Responsable();
	
	
	
	
public  String UpdatePass(String password) {
		
		Admin.setPassword(password);
		return "password change it";
	
	
}



public  String AddService(Service s ) {
	
	services.put(s.getNomService(), s);
	return s.getNomService() +" was add succefuly";
}

public String addClient(String nom ,int telephone, String password,String login) {
	   c = Clients.get(telephone);
	  if (!login.equals(nom) || !login.equals(String.valueOf(telephone))) {
	    return "erreur";
	  } else {
	    Clients.put(telephone, new Client( ));
	    return nom + " was added successfully";
	  }
	}
 


public  String addCompte(String nomService,  int Ncompte,  double montant , int Tel) {
	
	Service service = services.get(nomService);
	Client client = Clients.get(Tel);
	if (service != null && client!=null) {
		comptes.put(Ncompte, new compte(Ncompte, montant, service ,  client));
		return "ajouter avec succés";
	} else {
		return "service or compte not found";
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
public  compte findCompte(int Ncompte) {
	
	compte cmpt = comptes.get(Ncompte);
	if (cmpt != null) {
		return cmpt ;
	} else {
		return null;
	}
}

 
public List<Service> allServices() {
return new ArrayList<Service>(services.values());
}

public List<compte> allComptes() {
	
return new ArrayList<compte>(comptes.values());
}


public  String crediter(int nCompte, double montant){
	compte c = comptes.get(nCompte);
		c.setMontant(c.getMontant()+montant);
	return c.getNCompte()+ " a ete crédite d'un montant de "
	+ montant;
	}



public String AddResp(Responsable r) {
	
	responsables.put(r.getLogin(), r);
	
	return r.getLogin() + " was add succefuly";
}
}
