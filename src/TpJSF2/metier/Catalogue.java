package TpJSF2.metier;

import java.util.ArrayList;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.model.ListDataModel;

@ManagedBean
@ApplicationScoped
public class Catalogue extends ListDataModel<Article> {
	
	public Catalogue() {
		
		ArrayList<Article> liste = new ArrayList<>();
		
		for (int i=1;i<=10; i++) {
			Article art = new Article();
			art.setNom("NomArt" + i);
			art.setDescription("Description " +i);
			art.setPrix(i*12.34);
			
			liste.add(art);
		}
		
		//Catalogue (DataModel= alimenté par l'article créé
		this.setWrappedData(liste);
	}

}
