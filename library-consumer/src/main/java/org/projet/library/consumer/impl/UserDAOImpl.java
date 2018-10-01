package org.projet.library.consumer.impl;

import org.projet.library.consumer.contract.UserDAO;
import org.projet.library.model.user.User;
import org.projet.library.model.user.UsersWS;
import org.projet.library.model.user.UsersWS_Service;


public class UserDAOImpl implements UserDAO {

	public User getUser(String name, String password) {
		
		UsersWS stub = new UsersWS_Service().getUsersWSPort();
		
		return stub.doLogin(name, password);
	}
}