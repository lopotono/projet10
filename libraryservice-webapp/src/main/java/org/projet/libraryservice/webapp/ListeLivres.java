package org.projet.libraryservice.webapp;

import com.opensymphony.xwork2.ActionSupport;
import org.projet.libraryservice.business.impl.AbstractManager;
import org.projet.libraryservice.model.Livre;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService(serviceName = "ListeLivres")
public class ListeLivres extends AbstractManager {

    private String listeLivres;

    public String getListeLivres() {
        return listeLivres;
    }

    public void setListeLivres(String listeLivres) {
        this.listeLivres = listeLivres;
    }

    @WebMethod
    public String execute() {
        List<Livre> getLivres = getDaoFactory().getLivreDao().getLivres();
        return ActionSupport.SUCCESS;
    }
}
