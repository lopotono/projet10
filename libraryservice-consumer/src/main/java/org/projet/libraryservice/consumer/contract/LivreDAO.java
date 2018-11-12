package org.projet.libraryservice.consumer.contract;

import org.projet.libraryservice.model.Livre;

import java.util.List;

public interface LivreDAO {

    List<Livre> getLivres();
    
    List<Livre> getSearchLivre(String titre);
    
    List<Livre> getLivresDispo(boolean livredispo);
    
    Livre getLivre(int id);
    
    void update(Livre livre);
}