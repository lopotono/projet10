package org.projet.libraryservice.webapp;

import org.projet.libraryservice.model.Livre;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService(serviceName = "LivresWS")
public class LivresWS extends AbstractWebapp {

	@WebMethod
	public List<Livre> getLivres() {
		return getManagerFactory().getLivreManager().getLivres();
	}
		
	@WebMethod
	public List<Livre> doSearch(String titre) {		
		return getManagerFactory().getLivreManager().getSearchLivre(titre);
	}
	
	@WebMethod
	public void updateLivre(Livre livre) {
		getManagerFactory().getLivreManager().update(livre);
	}
	
	@WebMethod
	public Livre getLivre(int id) {
		return getManagerFactory().getLivreManager().getLivre(id);
	}
	
	@WebMethod
	public List<Livre> getLivresDisponibles() {
		return getManagerFactory().getLivreManager().getLivresDisponibles();
	}
}