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

	public List<Reservation> getPosition(int position) {
		return getDaoFactory().getReservationDao().getPosition(position);
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
}
