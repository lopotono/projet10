package org.projet.library.consumer.contract;

import java.util.List;

import org.projet.library.model.prets.Pret;

public interface PretDAO {
	
	List<Pret> getPrets(String name);
	
	void doPret(String name, int livreid);
}