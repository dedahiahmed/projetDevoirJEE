package dEVOIR.JEE;

import com.owlike.genson.annotation.JsonProperty;

public class Admin {
	@JsonProperty
	private static  String login = "admin";
	@JsonProperty
	private static  String password ="admin";
	
	
	public Admin() {
		
	}
	

	
	public Admin(String login, String password) {
		this.login = login;
		this.password = password;
	}
	
	
	



	public static String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public static String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	 public static void main(String[] args) {
	        Database.addAdmin(new Admin());
	    }
	 public static boolean checkLogin(String login, String password) {
	        Admin admin = Database.admins.get(login);
	        if( login.equals(getLogin()) &&  password.equals(getPassword())){
				
				return true;
			}
			else{
				 return false;
			}
	    }
	 
	
}
