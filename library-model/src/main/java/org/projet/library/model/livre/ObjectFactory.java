
package org.projet.library.model.livre;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.projet.library.model.livre package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UpdateLivre_QNAME = new QName("http://webapp.libraryservice.projet.org/", "updateLivre");
    private final static QName _DoSearchResponse_QNAME = new QName("http://webapp.libraryservice.projet.org/", "doSearchResponse");
    private final static QName _GetLivre_QNAME = new QName("http://webapp.libraryservice.projet.org/", "getLivre");
    private final static QName _GetLivresResponse_QNAME = new QName("http://webapp.libraryservice.projet.org/", "getLivresResponse");
    private final static QName _GetLivreResponse_QNAME = new QName("http://webapp.libraryservice.projet.org/", "getLivreResponse");
    private final static QName _UpdateLivreResponse_QNAME = new QName("http://webapp.libraryservice.projet.org/", "updateLivreResponse");
    private final static QName _GetLivresDisponibles_QNAME = new QName("http://webapp.libraryservice.projet.org/", "getLivresDisponibles");
    private final static QName _DoSearch_QNAME = new QName("http://webapp.libraryservice.projet.org/", "doSearch");
    private final static QName _GetLivresDisponiblesResponse_QNAME = new QName("http://webapp.libraryservice.projet.org/", "getLivresDisponiblesResponse");
    private final static QName _GetLivres_QNAME = new QName("http://webapp.libraryservice.projet.org/", "getLivres");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.projet.library.model.livre
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DoSearchResponse }
     * 
     */
    public DoSearchResponse createDoSearchResponse() {
        return new DoSearchResponse();
    }

    /**
     * Create an instance of {@link UpdateLivre }
     * 
     */
    public UpdateLivre createUpdateLivre() {
        return new UpdateLivre();
    }

    /**
     * Create an instance of {@link GetLivreResponse }
     * 
     */
    public GetLivreResponse createGetLivreResponse() {
        return new GetLivreResponse();
    }

    /**
     * Create an instance of {@link UpdateLivreResponse }
     * 
     */
    public UpdateLivreResponse createUpdateLivreResponse() {
        return new UpdateLivreResponse();
    }

    /**
     * Create an instance of {@link GetLivresDisponibles }
     * 
     */
    public GetLivresDisponibles createGetLivresDisponibles() {
        return new GetLivresDisponibles();
    }

    /**
     * Create an instance of {@link GetLivre }
     * 
     */
    public GetLivre createGetLivre() {
        return new GetLivre();
    }

    /**
     * Create an instance of {@link GetLivresResponse }
     * 
     */
    public GetLivresResponse createGetLivresResponse() {
        return new GetLivresResponse();
    }

    /**
     * Create an instance of {@link DoSearch }
     * 
     */
    public DoSearch createDoSearch() {
        return new DoSearch();
    }

    /**
     * Create an instance of {@link GetLivres }
     * 
     */
    public GetLivres createGetLivres() {
        return new GetLivres();
    }

    /**
     * Create an instance of {@link GetLivresDisponiblesResponse }
     * 
     */
    public GetLivresDisponiblesResponse createGetLivresDisponiblesResponse() {
        return new GetLivresDisponiblesResponse();
    }

    /**
     * Create an instance of {@link Livre }
     * 
     */
    public Livre createLivre() {
        return new Livre();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateLivre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "updateLivre")
    public JAXBElement<UpdateLivre> createUpdateLivre(UpdateLivre value) {
        return new JAXBElement<UpdateLivre>(_UpdateLivre_QNAME, UpdateLivre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoSearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "doSearchResponse")
    public JAXBElement<DoSearchResponse> createDoSearchResponse(DoSearchResponse value) {
        return new JAXBElement<DoSearchResponse>(_DoSearchResponse_QNAME, DoSearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLivre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "getLivre")
    public JAXBElement<GetLivre> createGetLivre(GetLivre value) {
        return new JAXBElement<GetLivre>(_GetLivre_QNAME, GetLivre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLivresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "getLivresResponse")
    public JAXBElement<GetLivresResponse> createGetLivresResponse(GetLivresResponse value) {
        return new JAXBElement<GetLivresResponse>(_GetLivresResponse_QNAME, GetLivresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLivreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "getLivreResponse")
    public JAXBElement<GetLivreResponse> createGetLivreResponse(GetLivreResponse value) {
        return new JAXBElement<GetLivreResponse>(_GetLivreResponse_QNAME, GetLivreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateLivreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "updateLivreResponse")
    public JAXBElement<UpdateLivreResponse> createUpdateLivreResponse(UpdateLivreResponse value) {
        return new JAXBElement<UpdateLivreResponse>(_UpdateLivreResponse_QNAME, UpdateLivreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLivresDisponibles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "getLivresDisponibles")
    public JAXBElement<GetLivresDisponibles> createGetLivresDisponibles(GetLivresDisponibles value) {
        return new JAXBElement<GetLivresDisponibles>(_GetLivresDisponibles_QNAME, GetLivresDisponibles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "doSearch")
    public JAXBElement<DoSearch> createDoSearch(DoSearch value) {
        return new JAXBElement<DoSearch>(_DoSearch_QNAME, DoSearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLivresDisponiblesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "getLivresDisponiblesResponse")
    public JAXBElement<GetLivresDisponiblesResponse> createGetLivresDisponiblesResponse(GetLivresDisponiblesResponse value) {
        return new JAXBElement<GetLivresDisponiblesResponse>(_GetLivresDisponiblesResponse_QNAME, GetLivresDisponiblesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLivres }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "getLivres")
    public JAXBElement<GetLivres> createGetLivres(GetLivres value) {
        return new JAXBElement<GetLivres>(_GetLivres_QNAME, GetLivres.class, null, value);
    }

}
