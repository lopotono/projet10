package org.projet.library.webapp.action;

import java.util.List;

import org.projet.library.model.livres.Livre;

import com.opensymphony.xwork2.ActionSupport;

public class SearchAction extends AbstractAction {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9180319008594123602L;
	
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
	
	public String search() {
		
		if (titre != null) {
			
			setSearchlivre(getManagerFactory().getLivreManager().getSearch(titre));
			
			return ActionSupport.SUCCESS;
		
		}else {
			return ActionSupport.ERROR;
		}		
	}
}