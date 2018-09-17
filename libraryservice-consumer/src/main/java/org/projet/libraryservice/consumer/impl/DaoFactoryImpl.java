package org.projet.libraryservice.consumer.impl;

import org.projet.libraryservice.consumer.contract.DaoFactory;
import org.projet.libraryservice.consumer.contract.LivreDAO;
import org.projet.libraryservice.consumer.contract.UserDAO;

public class DaoFactoryImpl implements DaoFactory {

    private LivreDAO livreDao;
    private UserDAO userDao;

    public LivreDAO getLivreDao() {
        return livreDao;
    }

    public void setLivreDao(LivreDAO livreDao) {
        this.livreDao = livreDao;
    }

	public UserDAO getUserDao() {
		return userDao;
	}
	
	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}
}