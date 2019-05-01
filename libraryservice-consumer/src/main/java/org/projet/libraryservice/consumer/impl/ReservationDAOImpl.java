package org.projet.libraryservice.consumer.impl;

import java.sql.Types;
import java.util.List;

import org.projet.libraryservice.consumer.contract.ReservationDAO;
import org.projet.libraryservice.consumer.impl.rowmapper.ReservationRowMapper;
import org.projet.libraryservice.model.Reservation;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class ReservationDAOImpl extends AbstractDaoImpl implements ReservationDAO {

	public List<Reservation> listReservationByUserId(int id) {
		
		String vSQL = "SELECT * FROM reservation WHERE id_utilisateur=" + id;
		
		ReservationRowMapper vRowMapper = new ReservationRowMapper();
		
		List<Reservation> reservation = getJdbcTemplate().query(vSQL, vRowMapper);
		
		return reservation;
	}

	public void insertReservation(Reservation reservation) {
		
		String vSQL = "INSERT INTO reservation (date_reservation, etat, id_utilisateur, id_livre) VALUES (:date_reservation,:etat,:id_utilisateur,:id_livre)";
		
		MapSqlParameterSource vParams = new MapSqlParameterSource();
		vParams.addValue("date_reservation", reservation.getDatereservation(), Types.DATE);
		vParams.addValue("etat", reservation.getEtat(), Types.VARCHAR);
		vParams.addValue("id_utilisateur", reservation.getId_user(), Types.INTEGER);
		vParams.addValue("id_livre", reservation.getId_livre(), Types.INTEGER);
		
		NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());

		try {
			vJdbcTemplate.update(vSQL, vParams);
		} catch (DuplicateKeyException vEx) {

		}
		
	}

	public List<Reservation> getListReservation() {

		String vSQL = "SELECT * FROM reservation";
		
		ReservationRowMapper vRowMapper = new ReservationRowMapper();
		
		List<Reservation> vListReservation = getJdbcTemplate().query(vSQL, vRowMapper);
		
		return vListReservation;
	}

	public Reservation getReservation(int id) {

		String vSQL = "SELECT * FROM reservation WHERE id_reservation=" + id;
		
		ReservationRowMapper vRowMapper = new ReservationRowMapper();
		
		List<Reservation> reservation = getJdbcTemplate().query(vSQL, vRowMapper);
		
		return reservation.get(0);
	}

	public void deleteReservation(Reservation reservation) {
		
		String vSQL = "DELETE FROM reservation WHERE id_reservation=:id_reservation";
		
		MapSqlParameterSource vParams = new MapSqlParameterSource();
		vParams.addValue("id_reservation", reservation.getId(), Types.INTEGER);
		
		NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
		
		try {
			vJdbcTemplate.update(vSQL, vParams);
		} catch (DuplicateKeyException vEx) {

		}
				
	}
	
	public int getMaxPositionByLivreId(int id) {
		
		String vSQL = "SELECT MAX(position) FROM reservation WHERE id_livre=:id_livre";
		
		MapSqlParameterSource vParams = new MapSqlParameterSource();
		vParams.addValue("id_livre", id, Types.INTEGER);
		
		NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
		
		Integer value = vJdbcTemplate.queryForObject(vSQL, vParams, Integer.class);
		
		if (value == null) {
			value = 0;
		}
		return value;
	}

	@Override
	public List<Reservation> getReservationsByIdLivre(int id) {

		String vSQL = "SELECT * FROM reservation WHERE id_livre=" + id;
		
		ReservationRowMapper vRowMapper = new ReservationRowMapper();
		
		List<Reservation> reservation = getJdbcTemplate().query(vSQL, vRowMapper);
				
		return reservation;
	}

	@Override
	public List<Reservation> getReservationByIdLivreAndPosition(int id, int position) {

		String vSQL = "SELECT * FROM reservation WHERE id_livre=:id_livre AND position=:position";
		
		ReservationRowMapper vRowMapper = new ReservationRowMapper();
		
		List<Reservation> reservation = getJdbcTemplate().query(vSQL, vRowMapper);
		
		return reservation;
	}
}