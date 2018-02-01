package TpJSF2.metier;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="beanVille")
@SessionScoped
public class Ville {

	private String nom, codePostal;

//	public Ville() {
//		codePostal = "35000";
//	}
	
	public String getNom() {
		return nom;
		}

	public void setNom(String nom) {
		this.nom = nom;}

	public String getCodePostal() {
		return codePostal;}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;}
	
	public String valider() {
		if(getCodePostal().equals("44000")) {    //equalsIgnoreCase
			setNom("Nantes");
		}else {
			setNom("code postal inconnu");
		}	
	return null;
	}
}
