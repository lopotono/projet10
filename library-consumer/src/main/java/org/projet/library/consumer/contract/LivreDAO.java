package org.projet.library.consumer.contract;

import java.util.List;

import org.projet.library.model.livres.Livre;


public interface LivreDAO {

	List<Livre> getLivres();
	
	List<Livre> getSearch(String titre);
}