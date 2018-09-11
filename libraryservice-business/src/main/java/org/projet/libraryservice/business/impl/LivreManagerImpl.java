package org.projet.libraryservice.business.impl;

import org.projet.libraryservice.business.contract.LivreManager;
import org.projet.libraryservice.model.Livre;

import java.util.List;

public class LivreManagerImpl extends AbstractManager implements LivreManager {

    public List<Livre> getLivres() {
        return getDaoFactory().getLivreDao().getLivres();
    }
}