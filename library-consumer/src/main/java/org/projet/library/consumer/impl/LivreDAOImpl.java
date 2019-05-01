package org.projet.library.consumer.impl;

import java.util.List;

import org.projet.library.consumer.contract.LivreDAO;
import org.projet.library.model.livre.Livre;
import org.projet.library.model.livre.LivresWS;
import org.projet.library.model.livre.LivresWS_Service;

public class LivreDAOImpl implements LivreDAO {
	
	public List<Livre> getLivres() {

		LivresWS stub = new LivresWS_Service().getLivresWSPort();

		List<Livre> livres = stub.getLivres();

		return livres;
	}

	public List<Livre> getSearch(String titre) {
		
		LivresWS stub = new LivresWS_Service().getLivresWSPort();
		
		List<Livre> livres = stub.doSearch(titre);
		
		return livres;
	}

	public void update(Livre livre) {
		
		LivresWS stub = new LivresWS_Service().getLivresWSPort();
		
		stub.updateLivre(livre);		
	}

	public Livre getLivre(int id) {

		LivresWS stub = new LivresWS_Service().getLivresWSPort();
		
		Livre livres = stub.getLivre(id);
		
		return livres;
	}

	public List<Livre> getLivresDisponibles() {

		LivresWS stub = new LivresWS_Service().getLivresWSPort();
		
		List<Livre> livres = stub.getLivresDisponibles();
		
		return livres;
	}
}