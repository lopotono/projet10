package org.projet.libraryservice.consumer.impl;

import org.projet.libraryservice.consumer.contract.DaoFactory;
import org.projet.libraryservice.consumer.contract.LivreDAO;

public class DaoFactoryImpl implements DaoFactory {

    private LivreDAO livreDao;


    public LivreDAO getLivreDao() {
        return livreDao;
    }

    public void setLivreDao(LivreDAO livreDao) {
        this.livreDao = livreDao;
    }
}