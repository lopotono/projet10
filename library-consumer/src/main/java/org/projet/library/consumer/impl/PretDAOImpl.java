package org.projet.library.consumer.impl;

import java.util.List;

import org.projet.library.consumer.contract.PretDAO;
import org.projet.library.model.prets.Pret;
import org.projet.library.model.prets.PretsWS;
import org.projet.library.model.prets.PretsWS_Service;

public class PretDAOImpl implements PretDAO {

	public List<Pret> getPrets(String name) {
		
		PretsWS stub = new PretsWS_Service().getPretsWSPort();
		
		List<Pret> prets = stub.doListPret(name);
		
		return prets;
	}

	public void doPret(String name, int livreid) {
		
		PretsWS stub = new PretsWS_Service().getPretsWSPort();
		
		stub.doPret(name, livreid);					
	}	
}