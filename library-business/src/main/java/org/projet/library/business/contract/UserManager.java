package org.projet.library.business.contract;

import org.projet.library.model.user.User;

public interface UserManager {
	
	User getUser(String name, String password);
}