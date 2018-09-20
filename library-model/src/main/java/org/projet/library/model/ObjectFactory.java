
package org.projet.library.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.projet.library.model package. 
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

    private final static QName _GetLivreidResponse_QNAME = new QName("http://webapp.libraryservice.projet.org/", "getLivreidResponse");
    private final static QName _DoListLivreResponse_QNAME = new QName("http://webapp.libraryservice.projet.org/", "doListLivreResponse");
    private final static QName _SetListLivre_QNAME = new QName("http://webapp.libraryservice.projet.org/", "setListLivre");
    private final static QName _SetListLivreResponse_QNAME = new QName("http://webapp.libraryservice.projet.org/", "setListLivreResponse");
    private final static QName _SetLivreid_QNAME = new QName("http://webapp.libraryservice.projet.org/", "setLivreid");
    private final static QName _DoListLivre_QNAME = new QName("http://webapp.libraryservice.projet.org/", "doListLivre");
    private final static QName _GetListLivre_QNAME = new QName("http://webapp.libraryservice.projet.org/", "getListLivre");
    private final static QName _GetLivreid_QNAME = new QName("http://webapp.libraryservice.projet.org/", "getLivreid");
    private final static QName _SetLivreidResponse_QNAME = new QName("http://webapp.libraryservice.projet.org/", "setLivreidResponse");
    private final static QName _GetListLivreResponse_QNAME = new QName("http://webapp.libraryservice.projet.org/", "getListLivreResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.projet.library.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DoListLivreResponse }
     * 
     */
    public DoListLivreResponse createDoListLivreResponse() {
        return new DoListLivreResponse();
    }

    /**
     * Create an instance of {@link GetLivreidResponse }
     * 
     */
    public GetLivreidResponse createGetLivreidResponse() {
        return new GetLivreidResponse();
    }

    /**
     * Create an instance of {@link SetLivreid }
     * 
     */
    public SetLivreid createSetLivreid() {
        return new SetLivreid();
    }

    /**
     * Create an instance of {@link SetListLivre }
     * 
     */
    public SetListLivre createSetListLivre() {
        return new SetListLivre();
    }

    /**
     * Create an instance of {@link SetListLivreResponse }
     * 
     */
    public SetListLivreResponse createSetListLivreResponse() {
        return new SetListLivreResponse();
    }

    /**
     * Create an instance of {@link DoListLivre }
     * 
     */
    public DoListLivre createDoListLivre() {
        return new DoListLivre();
    }

    /**
     * Create an instance of {@link GetListLivreResponse }
     * 
     */
    public GetListLivreResponse createGetListLivreResponse() {
        return new GetListLivreResponse();
    }

    /**
     * Create an instance of {@link GetListLivre }
     * 
     */
    public GetListLivre createGetListLivre() {
        return new GetListLivre();
    }

    /**
     * Create an instance of {@link GetLivreid }
     * 
     */
    public GetLivreid createGetLivreid() {
        return new GetLivreid();
    }

    /**
     * Create an instance of {@link SetLivreidResponse }
     * 
     */
    public SetLivreidResponse createSetLivreidResponse() {
        return new SetLivreidResponse();
    }

    /**
     * Create an instance of {@link Livre }
     * 
     */
    public Livre createLivre() {
        return new Livre();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLivreidResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "getLivreidResponse")
    public JAXBElement<GetLivreidResponse> createGetLivreidResponse(GetLivreidResponse value) {
        return new JAXBElement<GetLivreidResponse>(_GetLivreidResponse_QNAME, GetLivreidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoListLivreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "doListLivreResponse")
    public JAXBElement<DoListLivreResponse> createDoListLivreResponse(DoListLivreResponse value) {
        return new JAXBElement<DoListLivreResponse>(_DoListLivreResponse_QNAME, DoListLivreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetListLivre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "setListLivre")
    public JAXBElement<SetListLivre> createSetListLivre(SetListLivre value) {
        return new JAXBElement<SetListLivre>(_SetListLivre_QNAME, SetListLivre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetListLivreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "setListLivreResponse")
    public JAXBElement<SetListLivreResponse> createSetListLivreResponse(SetListLivreResponse value) {
        return new JAXBElement<SetListLivreResponse>(_SetListLivreResponse_QNAME, SetListLivreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetLivreid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "setLivreid")
    public JAXBElement<SetLivreid> createSetLivreid(SetLivreid value) {
        return new JAXBElement<SetLivreid>(_SetLivreid_QNAME, SetLivreid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoListLivre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "doListLivre")
    public JAXBElement<DoListLivre> createDoListLivre(DoListLivre value) {
        return new JAXBElement<DoListLivre>(_DoListLivre_QNAME, DoListLivre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListLivre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "getListLivre")
    public JAXBElement<GetListLivre> createGetListLivre(GetListLivre value) {
        return new JAXBElement<GetListLivre>(_GetListLivre_QNAME, GetListLivre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLivreid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "getLivreid")
    public JAXBElement<GetLivreid> createGetLivreid(GetLivreid value) {
        return new JAXBElement<GetLivreid>(_GetLivreid_QNAME, GetLivreid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetLivreidResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "setLivreidResponse")
    public JAXBElement<SetLivreidResponse> createSetLivreidResponse(SetLivreidResponse value) {
        return new JAXBElement<SetLivreidResponse>(_SetLivreidResponse_QNAME, SetLivreidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListLivreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "getListLivreResponse")
    public JAXBElement<GetListLivreResponse> createGetListLivreResponse(GetListLivreResponse value) {
        return new JAXBElement<GetListLivreResponse>(_GetListLivreResponse_QNAME, GetListLivreResponse.class, null, value);
    }

}
