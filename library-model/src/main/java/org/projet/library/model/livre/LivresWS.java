
package org.projet.library.model.livre;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "LivresWS", targetNamespace = "http://webapp.libraryservice.projet.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LivresWS {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<org.projet.library.model.livre.Livre>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "doSearch", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.livre.DoSearch")
    @ResponseWrapper(localName = "doSearchResponse", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.livre.DoSearchResponse")
    @Action(input = "http://webapp.libraryservice.projet.org/LivresWS/doSearchRequest", output = "http://webapp.libraryservice.projet.org/LivresWS/doSearchResponse")
    public List<Livre> doSearch(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateLivre", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.livre.UpdateLivre")
    @ResponseWrapper(localName = "updateLivreResponse", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.livre.UpdateLivreResponse")
    @Action(input = "http://webapp.libraryservice.projet.org/LivresWS/updateLivreRequest", output = "http://webapp.libraryservice.projet.org/LivresWS/updateLivreResponse")
    public void updateLivre(
        @WebParam(name = "arg0", targetNamespace = "")
        Livre arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns org.projet.library.model.livre.Livre
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLivre", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.livre.GetLivre")
    @ResponseWrapper(localName = "getLivreResponse", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.livre.GetLivreResponse")
    @Action(input = "http://webapp.libraryservice.projet.org/LivresWS/getLivreRequest", output = "http://webapp.libraryservice.projet.org/LivresWS/getLivreResponse")
    public Livre getLivre(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns java.util.List<org.projet.library.model.livre.Livre>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLivres", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.livre.GetLivres")
    @ResponseWrapper(localName = "getLivresResponse", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.livre.GetLivresResponse")
    @Action(input = "http://webapp.libraryservice.projet.org/LivresWS/getLivresRequest", output = "http://webapp.libraryservice.projet.org/LivresWS/getLivresResponse")
    public List<Livre> getLivres();

    /**
     * 
     * @return
     *     returns java.util.List<org.projet.library.model.livre.Livre>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLivresDisponibles", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.livre.GetLivresDisponibles")
    @ResponseWrapper(localName = "getLivresDisponiblesResponse", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.livre.GetLivresDisponiblesResponse")
    @Action(input = "http://webapp.libraryservice.projet.org/LivresWS/getLivresDisponiblesRequest", output = "http://webapp.libraryservice.projet.org/LivresWS/getLivresDisponiblesResponse")
    public List<Livre> getLivresDisponibles();

}