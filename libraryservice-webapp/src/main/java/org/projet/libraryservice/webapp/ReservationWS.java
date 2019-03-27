package org.projet.libraryservice.webapp;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.projet.libraryservice.model.Reservation;
import org.projet.libraryservice.model.User;

@WebService(serviceName = "ReservationWS")
public class ReservationWS extends AbstractWebapp {
	
	@WebMethod
	public Reservation getReservationByPret(int id) {
		
		return getManagerFactory().getReservationManager().getReservationByPret(id);
	}
	
	@WebMethod
	public List<Reservation> getReservationByUser(User vUser) {
		
		return getManagerFactory().getReservationManager().getReservationByUser(vUser);
	}
	
	

}
