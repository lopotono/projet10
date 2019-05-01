package org.projet.library.consumer.contract;

import org.projet.library.model.users.User;

public interface UserDAO {
	
	User getUser(String name, String password);
	
	User getUser(int id);
	
	void updateUser(User user);
}