package org.projet.libraryservice.business.impl;

import org.projet.libraryservice.business.contract.LivreManager;
import org.projet.libraryservice.business.contract.ManagerFactory;
import org.projet.libraryservice.business.contract.PretManager;
import org.projet.libraryservice.business.contract.ReservationManager;
import org.projet.libraryservice.business.contract.UserManager;

public class ManagerFactoryImpl implements ManagerFactory {

    private LivreManager livreManager;
    private UserManager userManager;
    private PretManager pretManager;
    private ReservationManager reservationManager;
    
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

	public PretManager getPretManager() {
		return pretManager;
	}

	public void setPretManager(PretManager pretManager) {
		this.pretManager = pretManager;
	}

	@Override
	public ReservationManager getReservationManager() {
		return this.reservationManager;
	}

	public void setReservationManager(ReservationManager reservationManager) {
		this.reservationManager = reservationManager;
	}
}