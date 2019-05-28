package org.projet.libraryservice.business.contract;

import java.util.List;

import org.projet.libraryservice.model.Reservation;

public interface ReservationManager {
				
	List<Reservation> getListReservation();
	
	Reservation getReservation(int id);
	
	void deleteReservation(Reservation reservation);
		
	void insertReservation(Reservation reservation);

	List<Reservation> listReservationByUserId(int id);
	
	List<Reservation> getReservationsByIdLivre(int id);
	
	Reservation getReservationByIdLivreAndPosition(int id, int position);
	
	void updateReservation(Reservation reservation);
}