package org.projet.libraryservice.webapp;

import java.util.List;

import org.projet.libraryservice.model.Livre;

public class SearchLivres extends AbstractWebapp {
	
	private List<Livre> searchlivre;
	private String titre;

	public List<Livre> getSearchlivre() {
		return searchlivre;
	}

	public void setSearchlivre(List<Livre> searchlivre) {
		this.searchlivre = searchlivre;
	}
	
	public String getTitre() {
		return titre;
	}
	
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public String doSearch() {
		
		if (titre != null) {
			
			setSearchlivre(getManagerFactory().getLivreManager().getSearchLivre(titre));
			
		} else {
			
		}		
		return doSearch();		
	}
}