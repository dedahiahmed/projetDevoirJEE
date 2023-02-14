package dEVOIR.JEE;



public class Compte {
	
			private String NCompte;
			
			private double montant;
		
			private Service service;
			private Client client;
			
			
			public Client getClient() {
				return client;
			}
			public void setClient(Client client) {
				this.client = client;
			}
			public String getNCompte() {
			return NCompte;
			}
			public void setNCompte(String NCompte) {
				this.NCompte = NCompte;
				}
			
			
			public double getMontant() {
			return montant;
			}
			public void setMontant(double montant) {
			this.montant = montant;
			}
			
			  public Service getService() {
				  return service; 
				  } 
			  public void setService(Service service) { 
				  this.service = service; 
				  }
			  
			  
			public Compte() {
				super();
				// TODO Auto-generated constructor stub
			}
			public Compte(String nCompte, double montant, Service service, Client client) {
				super();
				NCompte = nCompte;
				this.montant = montant;
				this.service = service;
				this.client = client;
			}
			 

			
			
			 	
			

}