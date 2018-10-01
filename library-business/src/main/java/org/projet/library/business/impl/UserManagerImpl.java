package org.projet.library.business.impl;

import org.projet.library.business.contract.UserManager;
import org.projet.library.model.user.User;


public class UserManagerImpl extends AbstractManager implements UserManager {

	public User getUser(String name, String password) {
		return getDaoFactory().getUserDao().getUser(name, password);
	}
}