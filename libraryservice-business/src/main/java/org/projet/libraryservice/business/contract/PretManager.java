package org.projet.libraryservice.business.contract;

import java.util.List;

import org.projet.libraryservice.model.Livre;
import org.projet.libraryservice.model.Pret;
import org.projet.libraryservice.model.User;

public interface PretManager {
		
	List<Pret> getListPret();
	
	List<Pret> getPretByUser(User vUser);

	void update(Pret pret);

	Pret getPretById(int id);

	List<Pret> getPretLate();
	
	List<Pret> getPretOver();
	
	List<Pret> getPretByLivre(Livre livre);
	
	List<Pret> listPretByUserId(int id);
}