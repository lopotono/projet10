package org.projet.library.consumer.impl;

import java.util.List;

import org.projet.library.consumer.contract.PretDAO;
import org.projet.library.model.prets.Pret;
import org.projet.library.model.prets.PretsWS;
import org.projet.library.model.prets.PretsWS_Service;
import org.projet.library.model.user.User;

public class PretDAOImpl implements PretDAO {

	public List<Pret> getListPret() {
		
		PretsWS stub = new PretsWS_Service().getPretsWSPort();
		
		List<Pret> prets = stub.getListPret();
		
		return prets;
	}

	public void update(Pret pret) {
	
		PretsWS stub = new PretsWS_Service().getPretsWSPort();
		
		stub.updatePret(pret);
	}

	public List<Pret> getPretByUser(User vUser) {
		
		PretsWS stub = new PretsWS_Service().getPretsWSPort();
		
		List<Pret> prets = stub.getPretByUser(null);
				
		return prets;
	}	
}