package org.projet.libraryservice.webapp;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.projet.libraryservice.model.Livre;

@WebService(serviceName = "LivresDispo")
public class ListeLivresDispo extends AbstractWebapp {
	
	private int livreid;
	private List<Livre> listLivre;
	private boolean livredispo;
	
	public int getLivreid() {
		return livreid;
	}
	public void setLivreid(int livreid) {
		this.livreid = livreid;
	}
	
	public List<Livre> getListLivre() {
		return listLivre;
	}
	public void setListLivre(List<Livre> listLivre) {
		this.listLivre = listLivre;
	}
	
	public boolean isLivredispo() {
		return livredispo;
	}
	public void setLivredispo(boolean livredispo) {
		this.livredispo = livredispo;
	}
	
	@WebMethod
	public List<Livre> doListDispo() {		
		listLivre = getManagerFactory().getLivreManager().getLivresDispo(livredispo);		
		return listLivre;						
	}
}