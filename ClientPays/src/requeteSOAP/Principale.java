package requeteSOAP;

public class Principale {
	private static String operation = "getPays";
	private static String destenvoi = "http://localhost:8080/WebServicePays/services/Pays";
	private static String destination = "http://pays"; // Nom du package

	private static String pays ="France";

	private static EnvoiMessageSOAP unAppel = new EnvoiMessageSOAP();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			unAppel.connexion();
			unAppel.creationMessage(operation, pays, destination);
			unAppel.EmmissionReception(destenvoi, pays);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
