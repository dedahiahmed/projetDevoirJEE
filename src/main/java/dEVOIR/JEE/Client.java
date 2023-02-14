package dEVOIR.JEE;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Client {
	@JsonProperty
	private String nom;
	
	@JsonProperty
	private String id;

	
	public String getNom() {
	return nom;
	}
	public void setNom(String nom) {
	this.nom = nom;
	}

	
	public String getId() {
	return id;
	}
	public void setIdentifiant(String identifiant) {
	this.id = identifiant;
	}
	



}