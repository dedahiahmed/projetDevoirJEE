package dEVOIR.JEE;

import com.fasterxml.jackson.annotation.JsonProperty;

public class compte {
	@JsonProperty
	private int Ncompte;
	@JsonProperty
	private double montant;
	@JsonProperty
	private Service service;
	
	
	public int getNCompte() {
		return Ncompte;
	}
	public void setNCompte(int Ncompte) {
		this.Ncompte = Ncompte;
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
	
	public compte(int Ncompte, double montant, Service service) {
		super();
		this.Ncompte = Ncompte;
		this.montant = montant;
		this.service = service;
	}
 

}
