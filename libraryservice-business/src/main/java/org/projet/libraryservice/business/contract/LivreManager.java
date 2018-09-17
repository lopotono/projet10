package org.projet.libraryservice.business.contract;

import org.projet.libraryservice.model.Livre;

import java.util.List;

public interface LivreManager {

    List<Livre> getLivres();
    
    List<Livre> getSearchLivre(String titre);
}