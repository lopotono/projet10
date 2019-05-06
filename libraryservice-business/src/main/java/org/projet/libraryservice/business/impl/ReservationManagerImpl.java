package org.projet.libraryservice.business.impl;

import java.util.Iterator;
import java.util.List;

import org.projet.libraryservice.business.contract.ReservationManager;
import org.projet.libraryservice.model.Livre;
import org.projet.libraryservice.model.Reservation;

public class ReservationManagerImpl extends AbstractManager implements ReservationManager {
	
	public List<Reservation> getListReservation() {
		return getDaoFactory().getReservationDao().getListReservation();
	}

	@Override
	public Reservation getReservation(int id) {
		return getDaoFactory().getReservationDao().getReservation(id);
	}

	@Override
	public void deleteReservation(Reservation reservation) {
		getDaoFactory().getReservationDao().deleteReservation(reservation);
		// récupérer toutes les réservations pour le livre reservation.getId_livre
		List<Reservation> list = getDaoFactory().getReservationDao().getReservationsByIdLivre(reservation.getId_livre());
		// Pour chaque réservation décrementer de 1 la position actuelle
		for (Iterator<Reservation> iterator = list.iterator(); iterator.hasNext();) {
			Reservation resa = (Reservation) iterator.next();
			int position = getDaoFactory().getReservationDao().getReservationByPositionId(reservation.getPosition());
			resa.setPosition(position-1);
			// appeler update chaque réservation
			getDaoFactory().getReservationDao().updateReservation(resa);
		}		
	}

	@Override
	public void insertReservation(Reservation reservation) {
		int position = getDaoFactory().getReservationDao().getMaxPositionByLivreId(reservation.getId_livre());
		reservation.setPosition(position + 1);
		getDaoFactory().getReservationDao().insertReservation(reservation);	
	}

	@Override
	public List<Reservation> listReservationByUserId(int id) {
		List<Reservation> list = getDaoFactory().getReservationDao().listReservationByUserId(id);
		for (Iterator<Reservation> iterator = list.iterator(); iterator.hasNext();) {
			Reservation reservation = (Reservation) iterator.next();
			Livre livre = getDaoFactory().getLivreDao().getLivre(reservation.getId_livre());
			reservation.setLivre(livre);
		}
		return list;
	}

	@Override
	public List<Reservation> getReservationsByIdLivre(int id) {
		return getDaoFactory().getReservationDao().getReservationsByIdLivre(id);
	}

	@Override
	public Reservation getReservationByIdLivreAndPosition(int id, int position) {
		return getDaoFactory().getReservationDao().getReservationByIdLivreAndPosition(id, position);
	}

	@Override
	public void updateReservation(Reservation reservation) {
		getDaoFactory().getReservationDao().updateReservation(reservation);
	}	
}