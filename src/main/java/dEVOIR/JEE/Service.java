package dEVOIR.JEE;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Service {
	@JsonProperty
	private int idService; 
	@JsonProperty
	private String nomService;
	
	
	
	public int getIdService() {
		return idService;
	}
	public void setIdService(int idService) {
		this.idService = idService;
	}

	public String getNomService() {
		return nomService;
	}
	public void setNomService(String nomService) {
		this.nomService = nomService;
	}
}
