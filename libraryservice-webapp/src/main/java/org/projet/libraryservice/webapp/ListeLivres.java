package org.projet.libraryservice.webapp;

import org.projet.libraryservice.model.Livre;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService(serviceName = "ListeLivres")
public class ListeLivres extends AbstractWebapp {

	private int livreid;
	private List<Livre> listLivre;

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

	@WebMethod
	public List<Livre> doListLivre() {
		listLivre = getManagerFactory().getLivreManager().getLivres();
		return listLivre;
	}
}