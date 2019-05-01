package org.projet.libraryservice.consumer.impl;

import java.sql.Types;
import java.util.List;

import org.projet.libraryservice.consumer.contract.UserDAO;
import org.projet.libraryservice.consumer.impl.rowmapper.UserRowMapper;
import org.projet.libraryservice.model.User;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

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

	@Override
	public void updateUser(User user) {

		String vSQL = "UPDATE user SET nom=:nom, prenom=:prenom, adresse=:adresse, code_postal=:code_postal, ville=:ville, mot_de_passe=:mot_de_passe, mail=:mail, option=:option WHERE id_utilisateur=:id_utilisateur";

		MapSqlParameterSource vParams = new MapSqlParameterSource();
		vParams.addValue("nom", user.getName(), Types.VARCHAR);
		vParams.addValue("prenom", user.getPrenom(), Types.VARCHAR);
		vParams.addValue("adresse", user.getAdresse(), Types.VARCHAR);
		vParams.addValue("code_postal", user.getCodepostal(), Types.INTEGER);
		vParams.addValue("ville", user.getVille(), Types.VARCHAR);
		vParams.addValue("mot_de_passe", user.getPassword(), Types.VARCHAR);
		vParams.addValue("mail", user.getMail(), Types.VARCHAR);
		vParams.addValue("option", user.isOption(), Types.BOOLEAN);

		NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());

		try {
			vJdbcTemplate.update(vSQL, vParams);
		} catch (DuplicateKeyException vEx) {
		}
	}
}