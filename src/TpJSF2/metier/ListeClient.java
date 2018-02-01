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
		
		for (int i=1; i<=10; i++) {
			Client client = new Client();
			client.setNom("nom" +i);
			client.setPrenom("prenom" +i);
			client.setIdentifiant("identifiant" +i);
			client.setPassword("password" +i);
			
			listeClient.add(client);
		}
		
	}
	
	
	/**
	 * 
	 * @param identifiant
	 * @param password
	 * @return Client si client trouvé, null sinon
	 */
	public Client checkAuthentification(String identifiant, String password) {
		for(Client c : listeClient) {
			if (c.getIdentifiant().equalsIgnoreCase(identifiant) && c.getPassword().equals(password)) {
				return c;
			}
		}
		return null;	
	}

	

}
