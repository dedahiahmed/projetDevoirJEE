package dEVOIR.JEE;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Service {
	@JsonProperty
	private String idService;
	@JsonProperty
	private String nomService;

	
	  public String getidService() { 
		  return idService;
	  } 
	  public void serIdService(String idService) { 
		  this.idService = idService;
	  }
	 
	public String getnomService() {
		return nomService;
	}
	public void setnomService(String nomService) {
		this.nomService = nomService;
	

	}

}
