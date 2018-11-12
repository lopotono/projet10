
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

    private final static QName _UpdatePret_QNAME = new QName("http://webapp.libraryservice.projet.org/", "updatePret");
    private final static QName _GetPretLateResponse_QNAME = new QName("http://webapp.libraryservice.projet.org/", "getPretLateResponse");
    private final static QName _GetPretByIdResponse_QNAME = new QName("http://webapp.libraryservice.projet.org/", "getPretByIdResponse");
    private final static QName _GetListPret_QNAME = new QName("http://webapp.libraryservice.projet.org/", "getListPret");
    private final static QName _GetPretById_QNAME = new QName("http://webapp.libraryservice.projet.org/", "getPretById");
    private final static QName _GetPretLate_QNAME = new QName("http://webapp.libraryservice.projet.org/", "getPretLate");
    private final static QName _UpdatePretResponse_QNAME = new QName("http://webapp.libraryservice.projet.org/", "updatePretResponse");
    private final static QName _GetListPretResponse_QNAME = new QName("http://webapp.libraryservice.projet.org/", "getListPretResponse");
    private final static QName _GetPretByUser_QNAME = new QName("http://webapp.libraryservice.projet.org/", "getPretByUser");
    private final static QName _GetPretByUserResponse_QNAME = new QName("http://webapp.libraryservice.projet.org/", "getPretByUserResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.projet.library.model.prets
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdatePret }
     * 
     */
    public UpdatePret createUpdatePret() {
        return new UpdatePret();
    }

    /**
     * Create an instance of {@link GetPretLateResponse }
     * 
     */
    public GetPretLateResponse createGetPretLateResponse() {
        return new GetPretLateResponse();
    }

    /**
     * Create an instance of {@link GetListPret }
     * 
     */
    public GetListPret createGetListPret() {
        return new GetListPret();
    }

    /**
     * Create an instance of {@link GetPretById }
     * 
     */
    public GetPretById createGetPretById() {
        return new GetPretById();
    }

    /**
     * Create an instance of {@link GetPretLate }
     * 
     */
    public GetPretLate createGetPretLate() {
        return new GetPretLate();
    }

    /**
     * Create an instance of {@link GetPretByIdResponse }
     * 
     */
    public GetPretByIdResponse createGetPretByIdResponse() {
        return new GetPretByIdResponse();
    }

    /**
     * Create an instance of {@link UpdatePretResponse }
     * 
     */
    public UpdatePretResponse createUpdatePretResponse() {
        return new UpdatePretResponse();
    }

    /**
     * Create an instance of {@link GetListPretResponse }
     * 
     */
    public GetListPretResponse createGetListPretResponse() {
        return new GetListPretResponse();
    }

    /**
     * Create an instance of {@link GetPretByUser }
     * 
     */
    public GetPretByUser createGetPretByUser() {
        return new GetPretByUser();
    }

    /**
     * Create an instance of {@link GetPretByUserResponse }
     * 
     */
    public GetPretByUserResponse createGetPretByUserResponse() {
        return new GetPretByUserResponse();
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
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePret }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "updatePret")
    public JAXBElement<UpdatePret> createUpdatePret(UpdatePret value) {
        return new JAXBElement<UpdatePret>(_UpdatePret_QNAME, UpdatePret.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPretLateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "getPretLateResponse")
    public JAXBElement<GetPretLateResponse> createGetPretLateResponse(GetPretLateResponse value) {
        return new JAXBElement<GetPretLateResponse>(_GetPretLateResponse_QNAME, GetPretLateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPretByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "getPretByIdResponse")
    public JAXBElement<GetPretByIdResponse> createGetPretByIdResponse(GetPretByIdResponse value) {
        return new JAXBElement<GetPretByIdResponse>(_GetPretByIdResponse_QNAME, GetPretByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListPret }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "getListPret")
    public JAXBElement<GetListPret> createGetListPret(GetListPret value) {
        return new JAXBElement<GetListPret>(_GetListPret_QNAME, GetListPret.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPretById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "getPretById")
    public JAXBElement<GetPretById> createGetPretById(GetPretById value) {
        return new JAXBElement<GetPretById>(_GetPretById_QNAME, GetPretById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPretLate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "getPretLate")
    public JAXBElement<GetPretLate> createGetPretLate(GetPretLate value) {
        return new JAXBElement<GetPretLate>(_GetPretLate_QNAME, GetPretLate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePretResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "updatePretResponse")
    public JAXBElement<UpdatePretResponse> createUpdatePretResponse(UpdatePretResponse value) {
        return new JAXBElement<UpdatePretResponse>(_UpdatePretResponse_QNAME, UpdatePretResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListPretResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "getListPretResponse")
    public JAXBElement<GetListPretResponse> createGetListPretResponse(GetListPretResponse value) {
        return new JAXBElement<GetListPretResponse>(_GetListPretResponse_QNAME, GetListPretResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPretByUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "getPretByUser")
    public JAXBElement<GetPretByUser> createGetPretByUser(GetPretByUser value) {
        return new JAXBElement<GetPretByUser>(_GetPretByUser_QNAME, GetPretByUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPretByUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "getPretByUserResponse")
    public JAXBElement<GetPretByUserResponse> createGetPretByUserResponse(GetPretByUserResponse value) {
        return new JAXBElement<GetPretByUserResponse>(_GetPretByUserResponse_QNAME, GetPretByUserResponse.class, null, value);
    }

}
