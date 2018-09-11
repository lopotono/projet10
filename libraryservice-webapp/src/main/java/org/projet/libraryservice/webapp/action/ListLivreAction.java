package org.projet.libraryservice.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.projet.libraryservice.model.Livre;

import java.util.List;

public class ListLivreAction extends AbstractAction {

    private String listLivre;

    public String getListLivre() {
        return listLivre;
    }

    public void setListLivre(String listLivre) {
        this.listLivre = listLivre;
    }

    public String execute() {
        List<Livre> list = getManagerFactory().getLivreManager().getLivres();
        setListLivre(list.get(0).getTitre());
        return ActionSupport.SUCCESS;
    }
}