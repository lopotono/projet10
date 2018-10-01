
package org.projet.library.model.prets;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.projet.library.model.prets package. 
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

    private final static QName _DoListPretResponse_QNAME = new QName("http://webapp.libraryservice.projet.org/", "doListPretResponse");
    private final static QName _DoListPret_QNAME = new QName("http://webapp.libraryservice.projet.org/", "doListPret");
    private final static QName _DoPretResponse_QNAME = new QName("http://webapp.libraryservice.projet.org/", "doPretResponse");
    private final static QName _DoPret_QNAME = new QName("http://webapp.libraryservice.projet.org/", "doPret");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.projet.library.model.prets
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DoListPretResponse }
     * 
     */
    public DoListPretResponse createDoListPretResponse() {
        return new DoListPretResponse();
    }

    /**
     * Create an instance of {@link DoListPret }
     * 
     */
    public DoListPret createDoListPret() {
        return new DoListPret();
    }

    /**
     * Create an instance of {@link DoPretResponse }
     * 
     */
    public DoPretResponse createDoPretResponse() {
        return new DoPretResponse();
    }

    /**
     * Create an instance of {@link DoPret }
     * 
     */
    public DoPret createDoPret() {
        return new DoPret();
    }

    /**
     * Create an instance of {@link Pret }
     * 
     */
    public Pret createPret() {
        return new Pret();
    }

    /**
     * Create an instance of {@link Livre }
     * 
     */
    public Livre createLivre() {
        return new Livre();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoListPretResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "doListPretResponse")
    public JAXBElement<DoListPretResponse> createDoListPretResponse(DoListPretResponse value) {
        return new JAXBElement<DoListPretResponse>(_DoListPretResponse_QNAME, DoListPretResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoListPret }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "doListPret")
    public JAXBElement<DoListPret> createDoListPret(DoListPret value) {
        return new JAXBElement<DoListPret>(_DoListPret_QNAME, DoListPret.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoPretResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "doPretResponse")
    public JAXBElement<DoPretResponse> createDoPretResponse(DoPretResponse value) {
        return new JAXBElement<DoPretResponse>(_DoPretResponse_QNAME, DoPretResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoPret }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "doPret")
    public JAXBElement<DoPret> createDoPret(DoPret value) {
        return new JAXBElement<DoPret>(_DoPret_QNAME, DoPret.class, null, value);
    }

}
