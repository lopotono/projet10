package org.projet.libraryservice.webapp;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.projet.libraryservice.model.Livre;
import org.projet.libraryservice.model.Pret;
import org.projet.libraryservice.model.User;

@WebService(serviceName = "PretsWS")
public class PretsWS extends AbstractWebapp {

	@WebMethod
	public List<Pret> getListPret() {
				
		return getManagerFactory().getPretManager().getListPret();
	}

	@WebMethod
	public void updatePret(Pret pret) {
		
		getManagerFactory().getPretManager().update(pret);		
	}
	
	@WebMethod
	public List<Pret> getPretByUser(User vUser) {
		
		return getManagerFactory().getPretManager().getPretByUser(vUser);
	}
	
	@WebMethod
	public Pret getPretById(int id) {
		
		return getManagerFactory().getPretManager().getPretById(id);
	}
	
	@WebMethod
	public List<Pret> getPretLate() {
		
		return getManagerFactory().getPretManager().getPretLate();
	}
	
	@WebMethod
	public List<Pret> getPretOver() {
		
		return getManagerFactory().getPretManager().getPretOver();
	}
	
	@WebMethod
	public List<Pret> getPretByLivre(Livre livre) {
		 
		return getManagerFactory().getPretManager().getPretByLivre(livre);
	}
	
	@WebMethod
	public List<Pret> listPretByUserId(int id) {
		
		return getManagerFactory().getPretManager().listPretByUserId(id);
	}
}