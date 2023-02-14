package dEVOIR.JEE;
import java.util.Map;




public class ClientService {
	
public static Map<String, Client> clients = Database.getClients(); 
	
	public static Map<String, Compte> comptes = Database.getComptes(); 
	
	
	
	 public String versement(String Ncompte, double montant){ 
		  Compte c =  comptes.get(Ncompte);
		  if(c !=null) {
		  c.setMontant(c.getMontant()+montant);
		  return c.getNCompte() + " was credited with an amount of " + montant;
		  }
		  else {
			  return Ncompte + "not found";
		  }
	  }
	 
	 
	 
	 public String retrait(String numconte, double montant){
		  Compte c = comptes.get(numconte);
	  if(c.getMontant()<montant){
		  return "solde inssufisant"; 
		  }
	  else {
	  c.setMontant(c.getMontant()-montant);
	  return " le compte de " + c.getClient().getNom() +  "a vis une operation de retrait avec un montant de "+montant;
	  }
	  }
	 
	 
	 public String transfert(String id_debiteur, String id_crediteur, double montant){ 
		  Compte debit = comptes.get(id_debiteur); 
		  Compte credit = comptes.get(id_crediteur); 
		 if(debit.getMontant()< montant){ 
		   return "solde inssufisant"; 
		  } 
		 else {
			  debit.setMontant(debit.getMontant()-montant);
			  credit.setMontant(montant+credit.getMontant());
			  return debit.getClient().getNom()+" vous avez transferer avec success";
		 }
	   }
	 
	
	
}
