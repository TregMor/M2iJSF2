package TpJSF2.metier;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.html.HtmlOutputLabel;
import javax.faces.context.FacesContext;
import javax.jms.Session;
import javax.servlet.http.HttpSession;

@ManagedBean(name="loginBean")
@SessionScoped
public class Login {

	private String identifiant;
	private String password;	
	private HtmlOutputLabel infoMessage;
	

	public HtmlOutputLabel getInfoMessage() {
		return infoMessage;
	}
	public void setInfoMessage(HtmlOutputLabel infoMessage) {
		this.infoMessage = infoMessage;
	}
	public String getIdentifiant() {
		return identifiant;}
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;}
	public String getPassword() {
		return password;}
	public void setPassword(String password) {
		this.password = password;}
	
	public String valider(ListeClient listeClient) {

		//ListeClient lesClients = (ListeClient)FacesC
		
		Client clientTrouve = listeClient.checkAuthentication(identifiant, password);
		if(clientTrouve != null) {
		// if(getIdentifiant().equalsIgnoreCase("Login1") && getPassword().equalsIgnoreCase("pwd1")) { 
			//System.out.println("Success");
			infoMessage.setValue("Succès");
			infoMessage.setStyle("color:green;");
			
			//Place le client trouvé ds l'espace de session
			//Il sera associé à la clé clientAuthentifié
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("clientAuthentifie", clientTrouve);
			return "ViewCatalogue";
		}else {
			//System.out.println("Failed");
			infoMessage.setValue("Echec");
			infoMessage.setStyle("color:red;");
		}	
	return null;
	}

	public String deconnecter() {

		//Pr fermer la sesion:
		HttpSession session = (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true);
		session.invalidate();
		
		//FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove("clientAuthentifie");
		return "login";
		
	}
	
}
