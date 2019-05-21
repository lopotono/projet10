package org.projet.libraryservice.consumer.impl;

import org.projet.libraryservice.consumer.contract.LivreDAO;
import org.projet.libraryservice.consumer.impl.rowmapper.LivreRowMapper;
import org.projet.libraryservice.model.Livre;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.sql.Types;
import java.util.List;

public class LivreDAOImpl extends AbstractDaoImpl implements LivreDAO {

	public LivreDAOImpl() {

	}

	public List<Livre> getLivres() {

		String vSQL = "SELECT * FROM livre ORDER BY titre";

		LivreRowMapper vRowMapper = new LivreRowMapper();

		List<Livre> vListLivres = getJdbcTemplate().query(vSQL, vRowMapper);

		return vListLivres;
	}

	public List<Livre> getSearchLivre(String titre) {

		String vSQL = "SELECT * FROM livre WHERE LOWER(titre) LIKE '%" + titre + "%'";

		LivreRowMapper vRowMapper = new LivreRowMapper();

		List<Livre> livres = getJdbcTemplate().query(vSQL, vRowMapper);

		return livres;
	}

	public Livre getLivre(int id) {

		String vSQL = "SELECT * FROM livre WHERE id_livre=" + id;
		
		LivreRowMapper vRowMapper = new LivreRowMapper();

		List<Livre> vListLivres = getJdbcTemplate().query(vSQL, vRowMapper);
		
		return vListLivres.get(0);
	}

	public void update(Livre livre) {
		
		String vSQL = "UPDATE livre SET nombre_exemplaire= nombre_exemplaire";
		
		MapSqlParameterSource vParams = new MapSqlParameterSource();
		vParams.addValue("nombre_exemplaire", livre.getNbexemplaire(), Types.INTEGER);
		
		NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
		
		try {
			vJdbcTemplate.update(vSQL, vParams);
		} catch (DuplicateKeyException vEx) {

		}		
	}

	@Override
	public List<Livre> getLivresDisponibles() {
		
		String vSQL = "SELECT * FROM livre WHERE disponible=false";
		
		LivreRowMapper vRowMapper = new LivreRowMapper();
		
		List<Livre> vListLivres = getJdbcTemplate().query(vSQL, vRowMapper);
		
		return vListLivres;
	}
}