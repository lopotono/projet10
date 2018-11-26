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

		String vSQL = "SELECT * FROM pret WHERE id_utilisateur=" + vUser.getId();

		PretRowMapper vRowMapper = new PretRowMapper();

		List<Pret> pret = getJdbcTemplate().query(vSQL, vRowMapper);

		return pret;
	}

	public void update(Pret pret) {

		String vSQL = "UPDATE pret SET etat= :etat, date_debut= :date_debut, date_fin= :date_fin, prolongation= :prolongation WHERE id_pret = :id_pret";

		MapSqlParameterSource vParams = new MapSqlParameterSource();
		vParams.addValue("etat", pret.getEtat(), Types.VARCHAR);
		vParams.addValue("id_pret", pret.getId(), Types.INTEGER);
		vParams.addValue("date_debut", pret.getDatedebut(), Types.DATE);
		vParams.addValue("date_fin", pret.getDatefin(), Types.DATE);
		vParams.addValue("prolongation", pret.isProlongation(), Types.BOOLEAN);

		NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());

		try {
			vJdbcTemplate.update(vSQL, vParams);
		} catch (DuplicateKeyException vEx) {

		}
	}

	public Pret getPretById(int id) {
	
		String vSQL = "SELECT * FROM pret WHERE id_pret=" + id;
		
		PretRowMapper vRowMapper = new PretRowMapper();

		List<Pret> pret = getJdbcTemplate().query(vSQL, vRowMapper);
		
		return pret.get(0);		
	}

	public List<Pret> getPretLate() {
		
		String vSQL = "SELECT * FROM pret WHERE date_fin < NOW()";
		
		PretRowMapper vRowMapper = new PretRowMapper();
		
		List<Pret> pret = getJdbcTemplate().query(vSQL, vRowMapper);
		
		return pret;
	}
}