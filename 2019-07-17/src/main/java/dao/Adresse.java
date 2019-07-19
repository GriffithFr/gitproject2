package dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adresse {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idAdresse;
	private String rue;
	private String ville;

			
  // On a créé un constructeur vide qui ne prend rien
	public Adresse() {
	}
	
	// Ici le constructeur mais juste avec rue et ville
	public Adresse(String rue, String ville) {
		this.rue = rue;
		this.ville = ville;
	}
	public String toString() {
		return "Adresse [idAdresse=" + idAdresse + ", rue=" + rue + ", ville=" + ville + "]";
	}
	
	public int getIdAdresse() {
		return idAdresse;
	}
	public void setIdAdresse(int idAdresse) {
		this.idAdresse = idAdresse;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	
}
