package org.projet.libraryservice.consumer.impl;

import java.util.List;

import org.projet.libraryservice.consumer.contract.UserDAO;
import org.projet.libraryservice.consumer.impl.rowmapper.UserRowMapper;
import org.projet.libraryservice.model.User;

public class UserDAOImpl extends AbstractDaoImpl implements UserDAO {

	public User getUser(String name, String password) {
		
		String vSQL = "SELECT * FROM user WHERE nom='"+ name + "' AND mot_de_passe='" + password + "'";
		
		UserRowMapper vRowMapper = new UserRowMapper();
		
		List<User> user = getJdbcTemplate().query(vSQL, vRowMapper);

		return user.get(0);
	}

	public User getUsers(int id) {

		String vSQL = "SELECT * FROM user WHERE id_user=" + id;
		
		UserRowMapper vRowMapper = new UserRowMapper();
		
		List<User> vListUser = getJdbcTemplate().query(vSQL, vRowMapper);
		
		return vListUser.get(0);
	}
}