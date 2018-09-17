package org.projet.libraryservice.business.impl;

import org.projet.libraryservice.business.contract.LivreManager;
import org.projet.libraryservice.business.contract.ManagerFactory;
import org.projet.libraryservice.business.contract.UserManager;

public class ManagerFactoryImpl implements ManagerFactory {

    private LivreManager livreManager;
    private UserManager userManager;
    
    public LivreManager getLivreManager() {
        return this.livreManager;
    }

    public void setLivreManager(LivreManager livreManager) {
        this.livreManager = livreManager;
    }

	public UserManager getUserManager() {
		return this.userManager;
	}
	
	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}
}