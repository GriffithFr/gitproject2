package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class PersonneController {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("FirstJpaProject");
	EntityManager em = emf.createEntityManager();
	
	
	public void creerListeAdressePersonne (String nom,String prenom,String rue1,String ville1,String rue2,String ville2) {
		Personne personne = new Personne(nom, prenom);
		Adresse a1= new Adresse(rue1, ville1);
		Adresse a2= new Adresse(rue2, ville2);
		List<Adresse> ad1=new ArrayList<Adresse>();
		ad1.add(a1);
		ad1.add(a2);
		personne.setAdresse(ad1);
		
		em.getTransaction().begin();
		em.persist(a1);
		em.persist(a2);
		em.persist(personne);
		em.getTransaction().commit();
		emf.close();
		em.close();
		
	}
	
}
	


//
//	EntityManagerFactory emf = Persistence.createEntityManagerFactory("FirstJpaProject");
//	EntityManager em = emf.createEntityManager();
//
//	public Adresse trouverIdAdressePersonne(String nom, String prenom) {
//		Query qury = em.createNativeQuery("Select*from personne where nom=? AND prenom=? ", dao.Personne.class);
//		qury.setParameter(1, nom);
//		qury.setParameter(2, prenom);
//
//		dao.Personne personne = (Personne) qury.getSingleResult();
//
//		return personne.getAdresse();
//	}
//
//	public void creerPersonneAdresse(String fnom, String fprenom, String frue, String fville) {
//
//		Personne personne = new Personne(fnom, fprenom);
//		Adresse add = new Adresse(frue, fville);
//
//		personne.setAdresse(add);
//
//		em.getTransaction().begin();
//		em.persist(add);
//		em.persist(personne);
//		em.getTransaction().commit();
//	}
//}
	 		
//	 		Bravo t'y étais presque mais non:
	 		
//	 		Query qury= em.createNativeQuery("INSERT INTO `personne`(`Nom`, `Prenom`) VALUES (?,?)");
//	 		qury.setParameter(1, nom);
//	 		qury.setParameter(2, prenom);
//	 		Personne personne = (Personne) qury.
//	 		Query qury2= em.createNativeQuery("INSERT INTO `adresse`(`rue`, `ville`) VALUES (?,?)");
//	 		qury2.setParameter(1, rue);
//	 		qury2.setParameter(2, ville);
//	 		Adresse adresse = (Adresse) qury2.;
//	 		personne.setAdresse(adresse);
//	 		
//	 		em.getTransaction().begin();
//	 		em.persist(adresse);
////	 		em.persist(personne);
////	 		em.getTransaction().commit();
//	 	}
//	 	
//	 	 

 


