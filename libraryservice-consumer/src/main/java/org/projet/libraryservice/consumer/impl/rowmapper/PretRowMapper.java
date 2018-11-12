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
		vPret.setDatedebut(pRS.getDate("date_debut"));
		Calendar cal = Calendar.getInstance();
		cal.setTime(pRS.getDate("date_fin"));
		vPret.setDatefin(cal);
		vPret.setEtat(pRS.getString("etat"));
		if (pRS.getDate("dateprolongation") != null) {
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(pRS.getDate("dateprolongation"));
		vPret.setDateprolongation(cal1);
		vPret.setId_livre(pRS.getInt("id_livre"));
		vPret.setId_user(pRS.getInt("id_utilisateur"));
		}
		return vPret;
	}
}