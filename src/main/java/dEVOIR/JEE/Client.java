package dEVOIR.JEE;



public class Client {
	private String nom;
	private int Telephone;
	private static String login;
	

	public String getNom() {
		return nom;
	}




	public void setNom(String nom) {
		this.nom = nom;
	}
	private static String password;
	
	
	
	
	
	
	
	
	
public Client(String nom ,int telephone, String password,String login ) {
		super();
		this.Telephone = telephone;
		Client.login = login;
		Client.password = password;
		this.nom=nom;
		
		
	}




	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		Client.login = login;
	}
	public static String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		Client.password = password;
	}
	public int getTelephone() {
		return Telephone;
	}
	public void setTelephone(int telephone) {
		Telephone = telephone;
	}
	
	public static String CheckLogin(String login, String password) {
	       
        if( login.equals(getLogin()) &&  password.equals(getPassword())){
			
			return "bienvenue" ;
		}
		else{
			 return "mot de passe or username incorrect "+login;
		}
    }






}
