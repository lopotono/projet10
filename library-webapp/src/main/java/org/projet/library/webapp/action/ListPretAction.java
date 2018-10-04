package org.projet.library.webapp.action;

import java.util.List;

import org.projet.library.model.prets.Pret;
import org.projet.library.model.user.User;

public class ListPretAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4522159096673660852L;

	private List<Pret> listPret;

	
	public List<Pret> getListPret() {
		return listPret;
	}
	
	public void setListPret(List<Pret> listPret) {
		this.listPret = listPret;
	}
	
	
	public String listPret() {
		return null;
		//User vUser = getManagerFactory().getUserManager().
		//listPret = getManagerFactory().getPretManager().getPrets(name);
	}
}