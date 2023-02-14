package dEVOIR.JEE;



public class Responsable {
	private String id ;
	private String nom ;
	Service service;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Responsable(String id, String nom, Service service) {
		super();
		this.id = id;
		this.nom = nom;
		
		this.service = service;
	}
	public Responsable() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
