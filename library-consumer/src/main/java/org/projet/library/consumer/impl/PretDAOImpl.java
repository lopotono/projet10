package org.projet.library.consumer.impl;

import java.util.List;

import org.projet.library.consumer.contract.PretDAO;
import org.projet.library.model.livre.Livre;
import org.projet.library.model.prets.Pret;
import org.projet.library.model.prets.PretsWS;
import org.projet.library.model.prets.PretsWS_Service;
import org.projet.library.model.prets.User;

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
		
		List<Pret> prets = stub.getPretByUser(vUser);
				
		return prets;
	}

	public Pret getPretById(int id) {
	
		PretsWS stub = new PretsWS_Service().getPretsWSPort();
		
		Pret prets = stub.getPretById(id);
		
		return prets;
	}
	
	public List<Pret> getPretLate() {
		
		PretsWS stub = new PretsWS_Service().getPretsWSPort();
		
		List<Pret> prets = stub.getPretLate();
		
		return prets;		
	}

	public List<Pret> getPretOver() {
		
		PretsWS stub = new PretsWS_Service().getPretsWSPort();
		
		List<Pret> prets = stub.getPretOver();
		
		return prets;
	}

	public List<Pret> getPretByLivre(Livre livre) {

		PretsWS stub = new PretsWS_Service().getPretsWSPort();
		
		List<Pret> prets = stub.getPretByLivre(livre);
		
		return prets;
	}

	public List<Pret> listPretByUserId(int id) {
	
		PretsWS stub = new PretsWS_Service().getPretsWSPort();
		
		List<Pret> prets = stub.listPretByUserId(id);
		
		return prets;
	}
}