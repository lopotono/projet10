package org.projet.library.business.contract;

import java.util.List;

import org.projet.library.model.prets.Pret;
import org.projet.library.model.user.User;

public interface PretManager {
	
	List<Pret> getListPret();
		
	void update(Pret pret);
	
	List<Pret> getPretByUser(User vUser);
}