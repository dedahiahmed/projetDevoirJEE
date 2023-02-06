package dEVOIR.JEE;

import java.util.HashMap;
import java.util.Map;

public class Database {
	static Map<String, Admin> admins = new HashMap<>();

	public static Map<String, Admin> getAdmins() {
		return admins;
	}

	public static void setAdmins(Map<String, Admin> admins) {
		Database.admins = admins;
	}
	 public static void addAdmin(Admin admin) {
	        admins.put(Admin.getLogin(), admin);
	    }
	
	

}
