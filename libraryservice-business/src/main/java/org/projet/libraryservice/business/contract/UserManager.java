package org.projet.libraryservice.business.contract;

import org.projet.libraryservice.model.User;

public interface UserManager {
	
	User getUser(String name, String password);
}