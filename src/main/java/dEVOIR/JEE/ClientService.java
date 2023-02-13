package dEVOIR.JEE;
import java.util.Map;




public class ClientService {
	
	public static   Map<Integer , compte> comptes = Database.getComptes();
	public   Map<Integer , Client> Clients = Database.getClients();

	public static String transfert(int Tel_debiteur, int Tel_crediteur, double montant){
			compte debit = comptes.get(Tel_debiteur);
			compte credit = comptes.get(Tel_crediteur);
			if(compte.getMontant()< montant){
			return "solde inssufisant";
			}
			compte.setMontant(montant+compte.getMontant());
			compte.setMontant(compte.getMontant()-montant);
			return montant+ "a ete transferer avec success";
			}
	
	
}
