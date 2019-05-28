package org.projet.libraryservice.webapp;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.projet.libraryservice.model.Reservation;

@WebService(serviceName = "ReservationWS")
public class ReservationWS extends AbstractWebapp {
		
	@WebMethod
	public List<Reservation> listReservationByUserId(int id) {
		
		return getManagerFactory().getReservationManager().listReservationByUserId(id);
	}
	
	@WebMethod
	public void insertReservation(Reservation reservation) {
		
		getManagerFactory().getReservationManager().insertReservation(reservation);
	}
	
	@WebMethod
	public List<Reservation> getListReservation() {
		
		return getManagerFactory().getReservationManager().getListReservation();
	}
	
	@WebMethod
	public Reservation getReservation(int id) {
		
		return getManagerFactory().getReservationManager().getReservation(id);
	}
	
	@WebMethod
	public void deleteReservation(Reservation reservation) {
		
		getManagerFactory().getReservationManager().deleteReservation(reservation);
	}
	
	@WebMethod
	public List<Reservation> getReservationsByIdLivre(int id) {
		
		return getManagerFactory().getReservationManager().getReservationsByIdLivre(id);
	}
	
	@WebMethod
	public Reservation getReservationByIdLivreAndPosition(int id, int position) {
		
		return getManagerFactory().getReservationManager().getReservationByIdLivreAndPosition(id, position);
	}
	
	@WebMethod
	public void updateReservation(Reservation reservation) {
		
		getManagerFactory().getReservationManager().updateReservation(reservation);
	}
}