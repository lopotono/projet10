package org.projet.library.business.impl;

import java.util.List;

import org.projet.library.business.contract.LivreManager;
import org.projet.library.model.livre.Livre;

public class LivreManagerImpl extends AbstractManager implements LivreManager {
		
	public List<Livre> getLivres() {
		return getDaoFactory().getLivreDao().getLivres();
	}

	public List<Livre> getSearch(String titre) {
		return getDaoFactory().getLivreDao().getSearch(titre);
	}

	public void update(Livre livre) {
		getDaoFactory().getLivreDao().update(livre);
	}

	public Livre getLivre(int id) {
		return getDaoFactory().getLivreDao().getLivre(id);
	}

	public List<Livre> getLivresDisponibles() {
		return getDaoFactory().getLivreDao().getLivresDisponibles();
	}	
}