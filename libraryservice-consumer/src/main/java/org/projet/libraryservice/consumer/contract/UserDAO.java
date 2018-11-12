package org.projet.libraryservice.consumer.contract;

import java.util.List;

import org.projet.libraryservice.model.User;

public interface UserDAO {
	
	User getUser(String name, String password);
	
	User getUser(int id);
	
	List<User> getUsers();
	
	User getName(String name);
}