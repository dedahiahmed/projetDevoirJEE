package dEVOIR.JEE;

public class compte {
	
	private static int Ncompte;
	
	private static double montant;
	
	private Service service;
	
	private Client client;

	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}

	
	
	public static int getNCompte() {
		return Ncompte;
	}
	public void setNCompte(int Ncompte) {
		compte.Ncompte = Ncompte;
	}
	public static double getMontant() {
		return montant;
	}
	public static void setMontant(double montant) {
		compte.montant = montant;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	
	public compte(int Ncompte, double montant, Service service , Client client) {
		super();
		compte.Ncompte = Ncompte;
		compte.montant = montant;
		this.service = service;
		this.client = client;
	}
 

}
