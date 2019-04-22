package org.projet.libraryservice.consumer.impl.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.projet.libraryservice.model.Reservation;
import org.springframework.jdbc.core.RowMapper;

public class ReservationRowMapper implements RowMapper<Reservation> {

	@Override
	public Reservation mapRow(ResultSet pRS, int pRowNum) throws SQLException {
		Reservation vReservation = new Reservation();
		vReservation.setId(pRS.getInt("id_reservation"));
		vReservation.setDatereservation(pRS.getDate("date_reservation"));
		vReservation.setPosition(pRS.getInt("position"));
		vReservation.setEtat(pRS.getString("etat"));
		vReservation.setId_user(pRS.getInt("id_utilisateur"));
		vReservation.setId_livre(pRS.getInt("id_livre"));
		return vReservation;
	}

}
