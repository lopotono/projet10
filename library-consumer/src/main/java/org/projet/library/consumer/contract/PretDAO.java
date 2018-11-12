package org.projet.library.consumer.contract;

import java.util.List;

import org.projet.library.model.prets.Pret;
import org.projet.library.model.prets.User;

public interface PretDAO {
		
	List<Pret> getListPret();
		
	void update(Pret pret);
	
	List<Pret> getPretByUser(User vUser);
	
	Pret getPretById(int id);
	
	List<Pret> getPretLate();
}