package org.projet.libraryservice.business.contract;

import java.util.List;

import org.projet.libraryservice.model.Reservation;

public interface ReservationManager {
				
	List<Reservation> getListReservation();
	
	Reservation getReservation(int id);
	
	void deleteReservation(Reservation reservation);
	
	List<Reservation> getPosition(int position);
	
	void insertReservation(Reservation reservation);

	List<Reservation> listReservationByUserId(int id);
}