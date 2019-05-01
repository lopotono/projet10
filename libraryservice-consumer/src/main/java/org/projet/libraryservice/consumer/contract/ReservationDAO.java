package org.projet.libraryservice.consumer.contract;

import java.util.List;

import org.projet.libraryservice.model.Reservation;

public interface ReservationDAO {

	List<Reservation> listReservationByUserId(int id);
		
	List<Reservation> getListReservation();
	
	Reservation getReservation(int id);
	
	void deleteReservation(Reservation reservation);
		
	void insertReservation(Reservation reservation);
	
	int getMaxPositionByLivreId(int id);
	
	List<Reservation> getReservationsByIdLivre(int id);
	
	List<Reservation> getReservationByIdLivreAndPosition(int id, int position);
}