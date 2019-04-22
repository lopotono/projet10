package org.projet.library.consumer.contract;

import java.util.List;

import org.projet.library.model.reservations.Reservation;

public interface ReservationDAO {
		
	List<Reservation> listReservationByUserId(int id);
		
	List<Reservation> getListReservation();
	
	Reservation getReservation(int id);
	
	List<Reservation> getPosition(int position);
	
	void deleteReservation(Reservation reservation);
	
	void insertReservation(Reservation reservation);
}
