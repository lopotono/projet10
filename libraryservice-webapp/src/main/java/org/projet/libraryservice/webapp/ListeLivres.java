package org.projet.libraryservice.webapp;

import org.projet.libraryservice.model.Livre;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService(serviceName = "ListeLivres")
public class ListeLivres extends AbstractWebapp {

    private String listeLivres;

    public String getListeLivres() {
        return listeLivres;
    }

    public void setListeLivres(String listeLivres) {
        this.listeLivres = listeLivres;
    }

    @WebMethod
    public String execute() {
        List<Livre> list = getManagerFactory().getLivreManager().getLivres();
        setListeLivres(list.get(0).getTitre());
        return execute();
    }
}