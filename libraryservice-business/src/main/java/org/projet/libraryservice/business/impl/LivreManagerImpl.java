package org.projet.libraryservice.business.impl;

import org.projet.libraryservice.business.contract.LivreManager;
import org.projet.libraryservice.model.Livre;

import java.util.List;

public class LivreManagerImpl extends AbstractManager implements LivreManager {

    public List<Livre> getLivres() {
        return getDaoFactory().getLivreDao().getLivres();
    }

	public List<Livre> getSearchLivre(String titre) {
		return getDaoFactory().getLivreDao().getSearchLivre(titre);
	}

	public List<Livre> getLivresDispo(boolean livredispo) {
		return getDaoFactory().getLivreDao().getLivresDispo(livredispo);
	}

	public void update(Livre livre) {
		getDaoFactory().getLivreDao().update(livre);	
	}

	public Livre getLivre(int id) {
		return getDaoFactory().getLivreDao().getLivre(id);
	}
}