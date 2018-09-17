package org.projet.libraryservice.consumer.contract;

import org.projet.libraryservice.model.User;

public interface UserDAO {
	
	User getUser(String name, String password);
}