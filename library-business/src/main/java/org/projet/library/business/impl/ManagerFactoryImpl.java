package org.projet.library.business.impl;

import org.projet.library.business.contract.LivreManager;
import org.projet.library.business.contract.UserManager;
import org.projet.library.business.contract.ManagerFactory;
import org.projet.library.business.contract.PretManager;

public class ManagerFactoryImpl implements ManagerFactory{

	private LivreManager livreManager;
	
	public LivreManager getLivreManager() {
		return livreManager;
	}

	public void setLivreManager(LivreManager livreManager) {
		this.livreManager = livreManager;
	}

	private PretManager pretManager;
	
	public PretManager getPretManager() {
		return pretManager;
	}

	public void setPretManager(PretManager pretManager) {
		this.pretManager = pretManager;
	}

	private UserManager userManager;
	
	public UserManager getUserManager() {
		return userManager;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}
}