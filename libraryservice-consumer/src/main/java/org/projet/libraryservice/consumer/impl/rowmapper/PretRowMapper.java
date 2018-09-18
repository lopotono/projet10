package org.projet.libraryservice.consumer.impl.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

import org.projet.libraryservice.model.Pret;
import org.springframework.jdbc.core.RowMapper;

public class PretRowMapper implements RowMapper<Pret> {

	public Pret mapRow(ResultSet pRS, int pRowNum) throws SQLException {
		Pret vPret = new Pret();
		vPret.setId(pRS.getInt("id_pret"));
		Calendar cal = Calendar.getInstance();
		cal.setTime(pRS.getDate("date_debut"));
		vPret.setDatedebut(cal);
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(pRS.getDate("date_fin"));
		vPret.setDatefin(cal1);
		
		return null;
	}

}
