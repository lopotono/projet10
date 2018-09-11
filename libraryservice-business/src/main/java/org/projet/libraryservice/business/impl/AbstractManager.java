package org.projet.libraryservice.business.impl;

import org.projet.libraryservice.consumer.contract.DaoFactory;

public class AbstractManager {

    private DaoFactory daoFactory;

    public DaoFactory getDaoFactory() {
        return daoFactory;
    }

    public void setDaoFactory(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }
}