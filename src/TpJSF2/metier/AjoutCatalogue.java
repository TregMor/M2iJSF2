package TpJSF2.metier;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlInputText;
import javax.faces.event.AjaxBehaviorEvent;

@ManagedBean
@RequestScoped
public class AjoutCatalogue{
	
	private String nom, errorNom, description, errorDescription, prix, errorPrix ;
	
	public void ajoutCatalogue(){
		setErrorNom("");
		setErrorDescription("");
		setErrorPrix("");
	}
	
	public void verifierNom(AjaxBehaviorEvent event) {
		
		if (getNom().length() >=10) {System.out.println("on est ds le if Nom");
			setErrorNom("Il y a trop de caractères");
		}else{
			System.out.println("on est ds le else Nom");
			setErrorNom("");
		}	
	}
	
	public void verifierPrix(AjaxBehaviorEvent event) {
	
		HtmlInputText composantSaisie = (HtmlInputText)event.getSource();
		Double prix;
		System.out.println("prix Doublé");
		try {
			prix =new Double(getPrix());
		
			if (prix <0){
				composantSaisie.setStyle("background-Color:blue");
			}else{
				composantSaisie.setStyle("");
			} System.out.println("on est ds le try");
		}catch(Exception e){
			System.out.println(e);
		}System.out.println("on a passé le catch");
	}
	
//	public String enregistrer(Article article){
//		Article newArticle = new Article();
//		
//		newArticle.setNom();
//		
//		return null;}
	
	
	public String getNom() {
		return nom;}
	public void setNom(String nom) {
		this.nom = nom;}
	public String getDescription() {
		return description;}
	public void setDescription(String description) {
		this.description = description;}
	public String getPrix() {
		return prix;}
	public void setPrix(String prix) {
		this.prix = prix;}

	public String getErrorNom() {
		return errorNom;}
	public void setErrorNom(String errorNom) {
		this.errorNom = errorNom;}
	public String getErrorDescription() {
		return errorDescription;}
	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;}
	public String getErrorPrix() {
		return errorPrix;}
	public void setErrorPrix(String errorPrix) {
		this.errorPrix = errorPrix;}
}
