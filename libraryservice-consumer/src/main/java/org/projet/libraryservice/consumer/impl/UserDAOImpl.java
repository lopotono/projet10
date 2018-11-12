package org.projet.libraryservice.consumer.impl;

import java.util.List;

import org.projet.libraryservice.consumer.contract.UserDAO;
import org.projet.libraryservice.consumer.impl.rowmapper.UserRowMapper;
import org.projet.libraryservice.model.User;

public class UserDAOImpl extends AbstractDaoImpl implements UserDAO {

	public User getUser(String name, String password) {

		String vSQL = "SELECT * FROM utilisateur WHERE nom='" + name + "' AND mot_de_passe='" + password + "'";

		UserRowMapper vRowMapper = new UserRowMapper();

		List<User> user = getJdbcTemplate().query(vSQL, vRowMapper);

		return user.get(0);
	}

	public User getUser(int id) {

		String vSQL = "SELECT * FROM utilisateur WHERE id_utilisateur=" + id;

		UserRowMapper vRowMapper = new UserRowMapper();

		List<User> vListUser = getJdbcTemplate().query(vSQL, vRowMapper);

		return vListUser.get(0);
	}

	public List<User> getUsers() {

		String vSQL = "SELECT * FROM utilisateur";

		UserRowMapper vRowMapper = new UserRowMapper();

		List<User> vListUser = getJdbcTemplate().query(vSQL, vRowMapper);

		return vListUser;
	}

	public User getName(String name) {

		String vSQL = "SELECT * FROM utilisateur WHERE nom=" + name;
		
		UserRowMapper vRowMapper = new UserRowMapper();

		List<User> user = getJdbcTemplate().query(vSQL, vRowMapper);

		return user.get(0);		
	}
}