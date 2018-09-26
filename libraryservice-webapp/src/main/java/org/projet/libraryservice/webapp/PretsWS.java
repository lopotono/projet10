package org.projet.libraryservice.webapp;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.projet.libraryservice.model.Pret;
import org.projet.libraryservice.model.User;

@WebService(serviceName = "PretsWS")
public class PretsWS extends AbstractWebapp {
		
	@WebMethod
	public List<Pret> doList(String name) {
		
		User vUser = getManagerFactory().getUserManager().getName(name);
				
		return getManagerFactory().getPretManager().getPretByUser(vUser);		
	}
	
	@WebMethod
	public void doPret(String name, int livreid) {
								
		Calendar datedebut = new GregorianCalendar();
		Calendar datefin = Calendar.getInstance();
		datefin.add(Calendar.MONTH, 1);
				
		User vUser = getManagerFactory().getUserManager().getName(name);
										
		getManagerFactory().getPretManager().SavePret(datedebut, datefin, "en cours", null, vUser.getId(), livreid);			
	}	
}