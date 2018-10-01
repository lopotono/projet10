package org.projet.library.business.contract;

import java.util.List;

import org.projet.library.model.prets.Pret;

public interface PretManager {

	List<Pret> getPrets(String name);

	void doPret(String name, int livreid);
}