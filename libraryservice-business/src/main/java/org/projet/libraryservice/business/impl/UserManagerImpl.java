package org.projet.libraryservice.business.impl;

import java.util.List;

import org.projet.libraryservice.business.contract.UserManager;
import org.projet.libraryservice.model.User;

public class UserManagerImpl extends AbstractManager implements UserManager {

	public User getUser(String name, String password) {
		return getDaoFactory().getUserDao().getUser(name, password);
	}

	public User getUser(int id) {
		return getDaoFactory().getUserDao().getUser(id);
	}

	public List<User> getUsers() {
		return getDaoFactory().getUserDao().getUsers();
	}

	public User getName(String name) {
		return getDaoFactory().getUserDao().getName(name);
	}

	@Override
	public void updateUser(User user) {
		getDaoFactory().getUserDao().updateUser(user);	
	}
}