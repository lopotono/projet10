
package org.projet.library.model.livres;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.projet.library.model.livres package. 
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

    private final static QName _DoListDispoResponse_QNAME = new QName("http://webapp.libraryservice.projet.org/", "doListDispoResponse");
    private final static QName _DoSearchResponse_QNAME = new QName("http://webapp.libraryservice.projet.org/", "doSearchResponse");
    private final static QName _DoListResponse_QNAME = new QName("http://webapp.libraryservice.projet.org/", "doListResponse");
    private final static QName _DoSearch_QNAME = new QName("http://webapp.libraryservice.projet.org/", "doSearch");
    private final static QName _DoListDispo_QNAME = new QName("http://webapp.libraryservice.projet.org/", "doListDispo");
    private final static QName _DoList_QNAME = new QName("http://webapp.libraryservice.projet.org/", "doList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.projet.library.model.livres
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
     * Create an instance of {@link DoListDispoResponse }
     * 
     */
    public DoListDispoResponse createDoListDispoResponse() {
        return new DoListDispoResponse();
    }

    /**
     * Create an instance of {@link DoListResponse }
     * 
     */
    public DoListResponse createDoListResponse() {
        return new DoListResponse();
    }

    /**
     * Create an instance of {@link DoSearch }
     * 
     */
    public DoSearch createDoSearch() {
        return new DoSearch();
    }

    /**
     * Create an instance of {@link DoListDispo }
     * 
     */
    public DoListDispo createDoListDispo() {
        return new DoListDispo();
    }

    /**
     * Create an instance of {@link DoList }
     * 
     */
    public DoList createDoList() {
        return new DoList();
    }

    /**
     * Create an instance of {@link Livre }
     * 
     */
    public Livre createLivre() {
        return new Livre();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoListDispoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "doListDispoResponse")
    public JAXBElement<DoListDispoResponse> createDoListDispoResponse(DoListDispoResponse value) {
        return new JAXBElement<DoListDispoResponse>(_DoListDispoResponse_QNAME, DoListDispoResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DoListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "doListResponse")
    public JAXBElement<DoListResponse> createDoListResponse(DoListResponse value) {
        return new JAXBElement<DoListResponse>(_DoListResponse_QNAME, DoListResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DoListDispo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "doListDispo")
    public JAXBElement<DoListDispo> createDoListDispo(DoListDispo value) {
        return new JAXBElement<DoListDispo>(_DoListDispo_QNAME, DoListDispo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "doList")
    public JAXBElement<DoList> createDoList(DoList value) {
        return new JAXBElement<DoList>(_DoList_QNAME, DoList.class, null, value);
    }

}
