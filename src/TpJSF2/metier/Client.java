package TpJSF2.metier;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Client {
	private String nom, prenom, identifiant, password;
	private Integer age, genre;
	
	public String getNom() {return nom;}
	public void setNom(String nom) {this.nom = nom;}

	public String getPrenom() {return prenom;}
	public void setPrenom(String prenom) {this.prenom = prenom;}

	public String getIdentifiant() {return identifiant;}
	public void setIdentifiant(String identifiant) {this.identifiant = identifiant;}

	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}

	public Integer getAge() {return age;}
	public void setAge(Integer age) {this.genre = age;}
	
	public Integer getGenre() {return genre;}
	public void setGenre(Integer genre) {this.genre = genre;}
	


	public String valider() {
		System.out.println("Inscription validée");
		return "Login";
	}
	
	public String annuler() {
		System.out.println("Inscription annulée");
		return "Login";
		
	}

}
