package org.projet.library.consumer.impl;

import java.util.List;

import org.projet.library.consumer.contract.LivreDAO;
import org.projet.library.model.livres.Livre;
import org.projet.library.model.livres.LivresWS;
import org.projet.library.model.livres.LivresWS_Service;

public class LivreDAOImpl implements LivreDAO {

	public List<Livre> getLivres() {

		LivresWS stub = new LivresWS_Service().getLivresWSPort();

		List<Livre> livres = stub.doListDispo();

		return livres;
	}

	public List<Livre> getSearch(String titre) {
		
		LivresWS stub = new LivresWS_Service().getLivresWSPort();
		
		List<Livre> livres = stub.doSearch("Nord");
		
		return livres;
	}
}