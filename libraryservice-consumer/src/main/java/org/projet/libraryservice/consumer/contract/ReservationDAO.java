package org.projet.libraryservice.consumer.contract;

import java.util.List;

import org.projet.libraryservice.model.Reservation;

public interface ReservationDAO {

	List<Reservation> listReservationByUserId(int id);
		
	List<Reservation> getListReservation();
	
	Reservation getReservation(int id);
	
	void deleteReservation(Reservation reservation);
	
	List<Reservation> getPosition(int position);
	
	void insertReservation(Reservation reservation);

}