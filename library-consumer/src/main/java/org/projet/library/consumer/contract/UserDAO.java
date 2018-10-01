package org.projet.library.consumer.contract;

import org.projet.library.model.user.User;

public interface UserDAO {
	
	User getUser(String name, String password);	
}