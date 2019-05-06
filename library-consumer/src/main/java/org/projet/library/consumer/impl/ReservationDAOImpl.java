package org.projet.library.consumer.impl;

import java.util.List;

import org.projet.library.consumer.contract.ReservationDAO;
import org.projet.library.model.reservations.Reservation;
import org.projet.library.model.reservations.ReservationWS;
import org.projet.library.model.reservations.ReservationWS_Service;

public class ReservationDAOImpl implements ReservationDAO {
	
	public List<Reservation> getListReservation() {

		ReservationWS stub = new ReservationWS_Service().getReservationWSPort();
		
		List<Reservation> reservation = stub.getListReservation();
		
		return reservation;
	}

	public Reservation getReservation(int id) {

		ReservationWS stub = new ReservationWS_Service().getReservationWSPort();
		
		Reservation reservation = stub.getReservation(id);
		
		return reservation;
	}

	public void deleteReservation(Reservation reservation) {

		ReservationWS stub = new ReservationWS_Service().getReservationWSPort();
		
		stub.deleteReservation(reservation);		
	}

	public void insertReservation(Reservation reservation) {
		
		ReservationWS stub = new ReservationWS_Service().getReservationWSPort();
		
		stub.insertReservation(reservation);		
	}

	public List<Reservation> listReservationByUserId(int id) {
		
		ReservationWS stub = new ReservationWS_Service().getReservationWSPort();
		
		List<Reservation> reservation = stub.listReservationByUserId(id);
		
		return reservation;
	}

	public List<Reservation> getReservationsByIdLivre(int id) {
		
		ReservationWS stub = new ReservationWS_Service().getReservationWSPort();
		
		List<Reservation> reservation = stub.getReservationsByIdLivre(id);
		
		return reservation;
	}

	public Reservation getReservationByIdLivreAndPosition(int id, int position) {

		ReservationWS stub = new ReservationWS_Service().getReservationWSPort();
		
		Reservation reservation = stub.getReservationByIdLivreAndPosition(id, position);
		
		return reservation;
	}

	public void updateReservation(Reservation reservation) {
	
		ReservationWS stub = new ReservationWS_Service().getReservationWSPort();
		
		stub.updateReservation(reservation);		
	}
}