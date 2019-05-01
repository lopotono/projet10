package org.projet.library.business.impl;

import org.projet.library.business.contract.UserManager;
import org.projet.library.model.users.User;


public class UserManagerImpl extends AbstractManager implements UserManager {

	public User getUser(String name, String password) {
		return getDaoFactory().getUserDao().getUser(name, password);
	}

	public User getUser(int id) {
		return getDaoFactory().getUserDao().getUser(id);
	}

	public void updateUser(User user) {
		getDaoFactory().getUserDao().updateUser(user);
	}
}