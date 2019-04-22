package org.projet.library.business.contract;

import java.util.List;

import org.projet.library.model.reservations.Reservation;

public interface ReservationManager {
		
	List<Reservation> listReservationByUserId(int id);
		
	List<Reservation> getListReservation();
	
	Reservation getReservation(int id);
	
	List<Reservation> getPosition(int position);
	
	void deleteReservation(Reservation reservation);
	
	void insertReservation(Reservation reservation);

}
