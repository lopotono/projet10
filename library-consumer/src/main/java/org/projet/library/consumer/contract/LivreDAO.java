package org.projet.library.consumer.contract;

import java.util.List;

import org.projet.library.model.livre.Livre;

public interface LivreDAO {

	List<Livre> getLivres();
	
	List<Livre> getSearch(String titre);
	
	void update(Livre livre);
	
	Livre getLivre(int id);
	
	List<Livre> getLivresDisponibles();
}