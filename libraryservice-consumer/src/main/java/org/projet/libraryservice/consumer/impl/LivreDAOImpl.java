package org.projet.libraryservice.consumer.impl;

import org.projet.libraryservice.consumer.contract.LivreDAO;
import org.projet.libraryservice.consumer.impl.rowmapper.LivreRowMapper;
import org.projet.libraryservice.model.Livre;

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

		String vSQL = "SELECT * FROM livre WHERE titre LIKE '%" + titre + "%'";

		LivreRowMapper vRowMapper = new LivreRowMapper();

		List<Livre> livres = getJdbcTemplate().query(vSQL, vRowMapper);

		return livres;
	}

	public List<Livre> getLivresDispo(boolean livredispo) {

		String vSQL = "SELECT * FROM livre WHERE disponible=" + livredispo;

		LivreRowMapper vRowMapper = new LivreRowMapper();

		List<Livre> vListLivres = getJdbcTemplate().query(vSQL, vRowMapper);

		return vListLivres;
	}
}