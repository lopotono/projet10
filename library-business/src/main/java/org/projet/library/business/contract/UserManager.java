package org.projet.library.business.contract;

import org.projet.library.model.users.User;

public interface UserManager {
	
	User getUser(String name, String password);

	User getUser(int id);
}