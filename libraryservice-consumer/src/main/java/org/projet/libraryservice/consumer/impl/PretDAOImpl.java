package org.projet.libraryservice.consumer.impl;

import java.sql.Types;
import java.util.Calendar;
import java.util.Date;

import org.projet.libraryservice.consumer.contract.PretDAO;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class PretDAOImpl extends AbstractDaoImpl implements PretDAO {

	public void SavePret(Calendar datedebut, Calendar datefin, String etat, Date dateprolongation, String userid, String livreid) {

		String vSQL = "INSERT INTO pret (date_debut, date_fin, etat, dateprolongation, id_user, id_livre) VALUES (:date_debut,:date_fin,:etat,:dateprolongation,:id_user,:id_livre)";

		MapSqlParameterSource vParams = new MapSqlParameterSource();
		vParams.addValue("date_debut", datedebut, Types.DATE);
		vParams.addValue("date_fin", datefin, Types.DATE);
		vParams.addValue("etat", etat, Types.VARCHAR);
		vParams.addValue("dateprolongation", dateprolongation, Types.DATE);
		vParams.addValue("id_user", userid, Types.INTEGER);
		vParams.addValue("id_livre", livreid, Types.INTEGER);

		NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());

		try {
			vJdbcTemplate.update(vSQL, vParams);
		} catch (DuplicateKeyException vEx) {

		}
	}
}