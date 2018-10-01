package org.projet.library.business.impl;

import java.util.List;

import org.projet.library.business.contract.LivreManager;
import org.projet.library.model.livres.Livre;

public class LivreManagerImpl extends AbstractManager implements LivreManager {

	public List<Livre> getLivres() {
		return getDaoFactory().getLivreDao().getLivres();
	}

	public List<Livre> getSearch(String titre) {
		return getDaoFactory().getLivreDao().getSearch(titre);
	}

}