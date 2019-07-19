package dao;

public class Lanceur2 {

	public static void main(String[] args) {

		PersonneController pc= new PersonneController();
		
//		pc.creerPersonneAdresse("Fischer", "Alex", "Tarnosplage", "Tarnos");
//		System.out.println(pc.trouverIdAdressePersonne("Alex","Fischer"));
		
		pc.creerListeAdressePersonne("Dubois", "Paul", "rue des pingouins", "Bidart", "rue des gitants", "Gitanville");
		
		 
	}

	
}
