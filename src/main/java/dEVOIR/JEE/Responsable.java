package dEVOIR.JEE;




import com.fasterxml.jackson.annotation.JsonProperty;

public class Responsable {
	@JsonProperty
	private String Login ;
	@JsonProperty
	private String password;
	
	
	
	
	
	 public Responsable(String Login, String password) {
	        this.Login = Login;
	        this.password = password;
	       
	    }
	public String getLogin() {
		return Login;
	}
	public Responsable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setLogin(String login) {
		this.Login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
