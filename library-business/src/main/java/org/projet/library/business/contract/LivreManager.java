package org.projet.library.business.contract;

import java.util.List;

import org.projet.library.model.livres.Livre;

public interface LivreManager {
	
	List<Livre> getLivres();
	
	List<Livre> getSearch(String titre);
}