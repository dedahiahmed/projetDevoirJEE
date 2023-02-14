package dEVOIR.JEE;


import java.util.HashMap;

import java.util.Map;



public class Database {
	
	private static Map<String , Service> Services = new HashMap<>();

	public static Map<String , Service> getServices() {
		return Services;
	}

	 



	public static Map<String , Compte> Comptes = new HashMap<>();
		
	public static Map<String , Compte> getComptes() {
		return Comptes;
	}



	public static Map<String , Client> Clients = new HashMap<>();
	public static Map<String , Client> getClients() {
		return Clients;


}

	
	public static Map<String , Responsable> responsables = new HashMap<>();
	
	public static Map<String , Responsable> getresponsables() {
		return responsables;
	}
}
