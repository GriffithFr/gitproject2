package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Lanceur {

	public static void main(String[] args) {
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("FirstJpaProject");
	EntityManager em=emf.createEntityManager();
	
//	Adresse adresse1= new Adresse("Bourgneuf","Bayonne");
//	Adresse	adresse2= new Adresse("Thiers", "Bayonne");
//	Adresse adresse3= new Adresse("Ocean", "Biarritz");
//		
//	Personne personne1= new Personne("Mickaël","Closier");
//	Personne personne2= new Personne("Sebastien","Binet");
//	Personne personne3= new Personne("Lolita","Benoist");
//	
//	personne1.setAdresse(adresse2);
//	personne2.setAdresse(adresse1);
//	personne3.setAdresse(adresse3);
//	
//	em.getTransaction().begin();
//	
//	em.persist(adresse1);
//	em.persist(adresse2);
//	em.persist(adresse3);
//	
//	em.persist(personne1);
//	em.persist(personne2);
//	em.persist(personne3);
//	
//	em.getTransaction().commit();
//	
//
//	em.close();
//	emf.close();

	Adresse adresse1 = new Adresse ("rue1","ville1");
	Adresse adresse2 = new Adresse ("rue2","ville2");
	Adresse adresse3 = new Adresse ("rue3","Ville3");
	Adresse adresse4 = new Adresse ("rue4","Ville4");
	Adresse adresse5 = new Adresse ("rue5","Ville5");
	
	Personne personne1 = new Personne ("prenom1","nom1");
	Personne personne2 = new Personne ("prenom2","nom2");
	
	List<Adresse>list=new ArrayList<Adresse>();
	list.add(adresse1);
	list.add(adresse2);
	personne1.setAdresse(list);
	
	List<Adresse>list2=new ArrayList<Adresse>();
	list2.add(adresse3);
	list2.add(adresse4);	
	personne2.setAdresse(list2);
	
	em.getTransaction().begin();
	
	em.persist(adresse1);
	em.persist(adresse2);
	em.persist(adresse3);
	em.persist(adresse4);
	em.persist(adresse5);
	
	em.persist(personne1);
	em.persist(personne2);
	
	em.getTransaction().commit();
	em.close();
	emf.close();
	}
}
