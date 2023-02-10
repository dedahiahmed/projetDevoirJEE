package dEVOIR.JEE;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Admin {
	@JsonProperty
	private static  String login = "admin";
	@JsonProperty
	private static  String password ="admin";
	
	
	public Admin() {
		
	}
	

	

	
	
	
	public static String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		Admin.login = login;
	}
	public static String getPassword() {
		return password;
	}
	public static void  setPassword(String password) {
		Admin.password = password;
	}
	
	 public static boolean checkLogin(String login, String password) {
	       
	        if( login.equals(getLogin()) &&  password.equals(getPassword())){
				
				return true;
			}
			else{
				 return false;
			}
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
