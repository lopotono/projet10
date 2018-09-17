package org.projet.libraryservice.webapp;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.projet.libraryservice.model.User;

@WebService(serviceName = "LoginUser")
public class Login extends AbstractWebapp {
	
	private String name;
	private String password;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@WebMethod
	public User doLogin() {
		
		User vUser = getManagerFactory().getUserManager().getUser(name, password);
		
		return vUser;		
	}
}