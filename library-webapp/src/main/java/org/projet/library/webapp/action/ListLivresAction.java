package org.projet.library.webapp.action;

import java.util.List;

import org.projet.library.model.livre.Livre;

import com.opensymphony.xwork2.ActionSupport;

public class ListLivresAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2116271561692587943L;
	
	private List<Livre> listLivres;
	private int id;
		
	public List<Livre> getListLivres() {
		return listLivres;
	}

	public void setListLivres(List<Livre> listLivres) {
		this.listLivres = listLivres;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
		
	public String doList() {
		listLivres = getManagerFactory().getLivreManager().getLivres();
		return ActionSupport.SUCCESS;		
	}	
}