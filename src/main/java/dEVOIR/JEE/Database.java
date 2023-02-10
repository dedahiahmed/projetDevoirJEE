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

}
