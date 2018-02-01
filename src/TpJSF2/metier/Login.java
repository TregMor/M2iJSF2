package TpJSF2.metier;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.html.HtmlOutputLabel;

@ManagedBean(name="loginBean")
@SessionScoped
public class Login {

	private String Identifiant;
	private String Password;
	
	private HtmlOutputLabel infoMessage;
	

	public HtmlOutputLabel getInfoMessage() {
		return infoMessage;
	}
	public void setInfoMessage(HtmlOutputLabel infoMessage) {
		this.infoMessage = infoMessage;
	}
	public String getIdentifiant() {
		return Identifiant;}
	public void setIdentifiant(String identifiant) {
		Identifiant = identifiant;}
	public String getPassword() {
		return Password;}
	public void setPassword(String password) {
		Password = password;}
	
	public String valider() {
		if(getIdentifiant().equalsIgnoreCase("Login1") && getPassword().equalsIgnoreCase("pwd1")) { 
			//System.out.println("Success");
			infoMessage.setValue("Succès");
			infoMessage.setStyle("color:green;");
		}else {
			//System.out.println("Failed");
			infoMessage.setValue("Echec");
			infoMessage.setStyle("color:red;");
		}	
	return null;
	}
	
}
