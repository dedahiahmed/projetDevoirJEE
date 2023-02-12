package dEVOIR.JEE;



public class Client {
	private String nom;
	private int Telephone;
	
	private String login  ;

	public String getNom() {
		return nom;
	}




	public void setNom(String nom) {
		this.nom = nom;
	}
	private String password;
	
	
	
	
	
	
	
	
	
public Client(String nom ,int telephone, String password,String login ) {
		super();
		this.Telephone = telephone;
		this.login = login;
		this.password = password;
		this.nom=nom;
		
		
	}




	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getTelephone() {
		return Telephone;
	}
	public void setTelephone(int telephone) {
		Telephone = telephone;
	}
	

}
