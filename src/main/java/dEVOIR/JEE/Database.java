package dEVOIR.JEE;


import java.util.HashMap;
import java.util.Map;

public class Database {
	
private static Map<String , Service> Services = new HashMap<>();

public static Map<String , Service> getServices() {
	return Services;
}

 



private static Map<Integer , compte> Comptes = new HashMap<>();
	
public static Map<Integer , compte> getComptes() {
	return Comptes;
}



public static Map<Integer , Client> Clients = new HashMap<>();
public static Map<Integer , Client> getClients() {
	return Clients;
}








public static Map<String , Responsable> responsables = new HashMap<>();

public static Map<String , Responsable> getResponsables() {
	return responsables;
}


}
