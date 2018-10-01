package org.projet.library.business.impl;

import java.util.List;

import org.projet.library.business.contract.PretManager;
import org.projet.library.model.prets.Pret;

public class PretManagerImpl extends AbstractManager implements PretManager {

	public List<Pret> getPrets(String name) {
		return getDaoFactory().getPretDao().getPrets(name);
	}

	public void doPret(String name, int livreid) {

	}
}