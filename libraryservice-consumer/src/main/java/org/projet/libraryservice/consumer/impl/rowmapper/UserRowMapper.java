package org.projet.libraryservice.consumer.impl.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import org.projet.libraryservice.model.User;

public class UserRowMapper implements RowMapper<User> {
	
	public User mapRow(ResultSet pRS, int pRowNum) throws SQLException {
		User vUser = new User();
		vUser.setId(pRS.getInt("id_utilisateur"));
		vUser.setName(pRS.getString("nom"));
		vUser.setPrenom(pRS.getString("prenom"));
		vUser.setAdresse(pRS.getString("adresse"));
		vUser.setCodepostal(pRS.getInt("code_postal"));
		vUser.setVille(pRS.getString("ville"));
		vUser.setPassword(pRS.getString("mot_de_passe"));
		vUser.setMail(pRS.getString("mail"));
		vUser.setOption(pRS.getBoolean("option"));
		return vUser;		
	}
}