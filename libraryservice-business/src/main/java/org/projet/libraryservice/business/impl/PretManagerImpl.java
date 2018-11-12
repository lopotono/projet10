package org.projet.libraryservice.business.impl;

import java.util.Iterator;
import java.util.List;

import org.projet.libraryservice.business.contract.PretManager;
import org.projet.libraryservice.model.Livre;
import org.projet.libraryservice.model.Pret;
import org.projet.libraryservice.model.User;

public class PretManagerImpl extends AbstractManager implements PretManager {

	public List<Pret> getPretByUser(User vUser) {
		List<Pret> list = getDaoFactory().getPretDao().getPretByUser(vUser);
		for (Iterator<Pret> iterator = list.iterator(); iterator.hasNext();) {
			Pret pret = (Pret) iterator.next();
			Livre livre = getDaoFactory().getLivreDao().getLivre(pret.getId_livre());
			pret.setLivre(livre);
		}
		return list;
	}

	public void update(Pret pret) {
		getDaoFactory().getPretDao().update(pret);		
	}

	public List<Pret> getListPret() {
		return getDaoFactory().getPretDao().getListPret();
	}

	public Pret getPretById(int id) {
		return getDaoFactory().getPretDao().getPretById(id);
	}

	public List<Pret> getPretLate() {
		return getDaoFactory().getPretDao().getPretLate();
	}
}