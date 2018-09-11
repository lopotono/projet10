package org.projet.libraryservice.business.impl;

import org.projet.libraryservice.business.contract.LivreManager;
import org.projet.libraryservice.business.contract.ManagerFactory;

public class ManagerFactoryImpl implements ManagerFactory {

    private LivreManager livreManager;
    public LivreManager getLivreManager() {
        return this.livreManager;
    }
}