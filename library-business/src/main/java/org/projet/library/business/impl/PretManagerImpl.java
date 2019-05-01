package org.projet.library.business.impl;

import java.util.Calendar;
import java.util.List;

import org.projet.library.business.contract.PretManager;
import org.projet.library.model.livre.Livre;
import org.projet.library.model.prets.Pret;
import org.projet.library.model.prets.User;

public class PretManagerImpl extends AbstractManager implements PretManager {

	public List<Pret> getListPret() {
		return getDaoFactory().getPretDao().getListPret();
	}

	public void update(Pret pret) {
		getDaoFactory().getPretDao().update(pret);
	}

	public List<Pret> getPretByUser(User vUser) {
		
		return getDaoFactory().getPretDao().getPretByUser(vUser);
	}

	public Pret getPretById(int id) {
		return getDaoFactory().getPretDao().getPretById(id);
	}

	public List<Pret> getPretLate() {
		return getDaoFactory().getPretDao().getPretLate();
	}

	public List<Pret> getPretOver() {
		return getDaoFactory().getPretDao().getPretOver();
	}

	public Pret getListPret(Calendar datefin) {
		return null;
	}

	public List<Pret> getPretByLivre(Livre livre) {
		return getDaoFactory().getPretDao().getPretByLivre(livre);
	}

	public List<Pret> listPretByUserId(int id) {
		return getDaoFactory().getPretDao().listPretByUserId(id);
	}
}