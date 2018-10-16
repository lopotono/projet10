package org.projet.libraryservice.consumer.impl;

import java.sql.Types;
import java.util.List;

import org.projet.libraryservice.consumer.contract.PretDAO;
import org.projet.libraryservice.consumer.impl.rowmapper.PretRowMapper;
import org.projet.libraryservice.model.Pret;
import org.projet.libraryservice.model.User;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class PretDAOImpl extends AbstractDaoImpl implements PretDAO {

	
	public List<Pret> getListPret() {

		String vSQL = "SELECT * FROM pret";

		PretRowMapper vRowMapper = new PretRowMapper();

		List<Pret> vListPret = getJdbcTemplate().query(vSQL, vRowMapper);

		return vListPret;
	}

	public List<Pret> getPretByUser(User vUser) {

		String vSQL = "SELECT * FROM pret WHERE id_user=" + vUser.getId();

		PretRowMapper vRowMapper = new PretRowMapper();

		List<Pret> pret = getJdbcTemplate().query(vSQL, vRowMapper);

		return pret;
	}

	public void update(Pret pret) {

		String vSQL = "UPDATE pret SET etat= :etat, datedebut= :datedebut, datefin= :datefin, dateprolongation= :dateprolongation, id_livre= :id_livre WHERE id_pret = :id_pret";

		MapSqlParameterSource vParams = new MapSqlParameterSource();
		vParams.addValue("etat", pret.getEtat(), Types.VARCHAR);
		vParams.addValue("id_pret", pret.getId(), Types.INTEGER);
		vParams.addValue("datedebut", pret.getDatedebut(), Types.DATE);
		vParams.addValue("datefin", pret.getDatefin(), Types.DATE);
		vParams.addValue("dateprolongation", pret.getDateprolongation(), Types.DATE);
		vParams.addValue("id_livre", pret.getTitre(), Types.INTEGER);

		NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());

		try {
			vJdbcTemplate.update(vSQL, vParams);
		} catch (DuplicateKeyException vEx) {

		}
	}
}