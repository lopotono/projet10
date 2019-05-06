package org.projet.library.business.contract;

import java.util.List;

import org.projet.library.model.reservations.Reservation;

public interface ReservationManager {

	List<Reservation> listReservationByUserId(int id);

	List<Reservation> getListReservation();

	Reservation getReservation(int id);

	void deleteReservation(Reservation reservation);

	void insertReservation(Reservation reservation);

	List<Reservation> getReservationsByIdLivre(int id);

	Reservation getReservationByIdLivreAndPosition(int id, int position);
	
	void updateReservation(Reservation reservation);
}