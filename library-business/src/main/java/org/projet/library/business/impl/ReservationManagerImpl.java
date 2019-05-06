package org.projet.library.business.impl;

import java.util.List;

import org.projet.library.business.contract.ReservationManager;
import org.projet.library.model.reservations.Reservation;

public class ReservationManagerImpl extends AbstractManager implements ReservationManager {

	public List<Reservation> getListReservation() {
		return getDaoFactory().getReservationDao().getListReservation();
	}

	public Reservation getReservation(int id) {
		return getDaoFactory().getReservationDao().getReservation(id);
	}

	public void deleteReservation(Reservation reservation) {
		getDaoFactory().getReservationDao().deleteReservation(reservation);
	}

	public void insertReservation(Reservation reservation) {
		getDaoFactory().getReservationDao().insertReservation(reservation);;		
	}

	public List<Reservation> listReservationByUserId(int id) {
		return getDaoFactory().getReservationDao().listReservationByUserId(id);
	}

	public List<Reservation> getReservationsByIdLivre(int id) {
		return getDaoFactory().getReservationDao().getReservationsByIdLivre(id);
	}

	public Reservation getReservationByIdLivreAndPosition(int id, int position) {
		return getDaoFactory().getReservationDao().getReservationByIdLivreAndPosition(id, position);
	}

	public void updateReservation(Reservation reservation) {
		getDaoFactory().getReservationDao().updateReservation(reservation);	
	}
}
