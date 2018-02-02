package TpJSF2.metier;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class ListeClient {
	
	private List <Client> listeClient;
	
	public ListeClient() {
		listeClient = new ArrayList<Client>();
		
		//Création de 10 clients
		for (int i=1; i<=10; i++) {
			Client client = new Client();
			client.setNom("nom" +i);
			client.setPrenom("prenom" +i);
			client.setIdentifiant("identifiant" +i);
			client.setPassword("password" +i);
			
			//Place les clients ds la liste
			listeClient.add(client);
		}
	}
	
	/**
	 * @param identifiant
	 * @param password
	 * @return Client si client trouvé, null sinon
	 */
	public Client checkAuthentication(String identifiant, String password) {
		for(Client clientTrouve : listeClient) {
			if (clientTrouve.getIdentifiant().equalsIgnoreCase(identifiant) && clientTrouve.getPassword().equals(password)) {
				return clientTrouve;
			}
		}
		return null;	
	}
}
