package org.projet.library.consumer.impl;

import org.projet.library.consumer.contract.UserDAO;
import org.projet.library.model.users.User;
import org.projet.library.model.users.UsersWS;
import org.projet.library.model.users.UsersWS_Service;


public class UserDAOImpl implements UserDAO {

	public User getUser(String name, String password) {
		
		UsersWS stub = new UsersWS_Service().getUsersWSPort();
		
		return stub.doLogin(name, password);
	}

	public User getUser(int id) {
		
		UsersWS stub = new UsersWS_Service().getUsersWSPort();

		return stub.idUser(id);
	}

	public void updateUser(User user) {

		UsersWS stub = new UsersWS_Service().getUsersWSPort();
		
		stub.updateUser(user);		
	}
}