	package dEVOIR.JEE;
 

import java.util.ArrayList;


import java.util.List;
import java.util.Map;



public class AdminService {
	
	public static Map<String, Client> clients = Database.getClients(); 
	
	public static Map<String, Compte> comptes = Database.getComptes(); 
	
	public static Map<String, Service> services = Database.getServices() ;
	  
	public static Map<String, Responsable> responsables = Database.getresponsables();
	public  String UpdatePass(String password) {
		
		Admin.setPassword(password);
		return "password change it";
	
	
}
	
	 public String addClient(Client c){ 
		 //Service service = services.get();
		  clients.put(c.getId(), c); 
		  return c.getNom()+" was add successfully"; 
	 }
	 
	 public List<Client> allClients() { 
		  return new ArrayList<Client>(clients.values()); 
		 } 
	 
	
	 
		 public Client getClient(String id){ 
			 Client c = clients.get(id); 
		  return c;  
		 } 
		 
		 
		 
		 
		 public String deleteClient(String id){ 
			 Client c = clients.remove(id); 
			  return c.getNom()+" Deleted successfully"; 
			 }
		 
		 
		 
		 public String Addservice(Service s) {
			 services.put(s.getnomService(), s);
			 return s.getnomService()+" was add successfully";
		 }
		 
		 public String addCompte(String nomservice ,String NCompte,double montant,String idClient) {
			  
			  Service s=services.get(nomservice) ;
			  Client c = clients.get(idClient);
			  if (s != null && c!=null) {
			  comptes.put(NCompte,  new Compte(NCompte, montant,s,c));
			  return "add successfully"; } 
			  else { 
				  return  "service or client not found";
			  } 
			  }
		 
		 public List<Compte> allComptes() {
			 return new ArrayList<Compte>(comptes.values());
			 }
		 
		 public Compte getCompte(String id){ 
			 Compte c = comptes.get(id); 
			  return c;  
			 } 
		 
		  public String crediter(String NCompte, double montant){ 
			  Compte c =  comptes.get(NCompte);
			  if(c !=null) {
			  c.setMontant(c.getMontant()+montant);
			  return c.getNCompte() + " a ete debite d'un montant de " + montant;
			  }
			  else {
				  return NCompte +"not found";
			  }
		  }
		  
		  public String addResponsable(String id, String nom, String nomService){ 
				Service s = services.get(nomService);
				  
				if(s==null) {
					return "Service not found";
				}
				else{
					responsables.put(id, new Responsable(id,nom,s));
				  return nom +" was add successfully"; 
				}
			 }
		  
		  
		  public List<Responsable> allResponsable() { 
			  return new ArrayList<Responsable>(responsables.values()); 
			 } 
		 
		
		 
			 public Responsable getResponsable(String id){ 
				 Responsable r =responsables.get(id); 
			  return r;  
			 } 
			 
			 
			 
			 
			 public String deleteResponsable(String id){ 
				 Responsable r = responsables.remove(id); 
				  return r.getNom()+" Deleted successfully"; 
				 }
		  
			 
			 public String annule(String id_debiteur, String id_crediteur, double montant){ 
				  Compte debit = comptes.get(id_debiteur); 
				  Compte credit = comptes.get(id_crediteur); 
				 if(credit.getMontant()< montant){ 
				   return "solde inssufisant"; 
				  } 
				 else {
					 credit.setMontant(debit.getMontant()-montant);
					  debit.setMontant(montant+credit.getMontant());
					  return debit.getClient().getNom()+" vous avez transferer avec success";
				 }
			   }

}
