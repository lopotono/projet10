package org.projet.libraryservice.webapp;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.projet.libraryservice.model.User;

@WebService(serviceName = "UsersWS")
public class UsersWS extends AbstractWebapp {
		
	@WebMethod
	public List<User> doList() {
		return getManagerFactory().getUserManager().getUsers();
	}
	
	@WebMethod
	public User doLogin(String name, String password) {
		
		User vUser = getManagerFactory().getUserManager().getUser(name, password);
		
		return vUser;		
	}
	
	@WebMethod
	public User idUser(int id) {
		
		User vUser = getManagerFactory().getUserManager().getUser(id);
		
		return vUser;
	}
}