package org.projet.library.webapp.action;

import java.util.List;

import org.projet.library.model.livres.Livre;

import com.opensymphony.xwork2.ActionSupport;

public class ListLivresAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2116271561692587943L;
	
	private List<Livre> listLivres;
		
	public List<Livre> getListLivres() {
		return listLivres;
	}

	public void setListLivres(List<Livre> listLivres) {
		this.listLivres = listLivres;
	}
	
	public String doList() {
		listLivres = getManagerFactory().getLivreManager().getLivres();
		return ActionSupport.SUCCESS;		
	}
}