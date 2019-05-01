package org.projet.libraryservice.business.contract;

import org.projet.libraryservice.model.Livre;

import java.util.List;

public interface LivreManager {

    List<Livre> getLivres();
    
    List<Livre> getSearchLivre(String titre);
           
    void update(Livre livre);
    
    Livre getLivre(int id);
    
    List<Livre> getLivresDisponibles();
}