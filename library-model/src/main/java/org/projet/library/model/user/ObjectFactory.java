
package org.projet.library.model.user;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.projet.library.model.user package. 
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

    private final static QName _DoLogin_QNAME = new QName("http://webapp.libraryservice.projet.org/", "doLogin");
    private final static QName _DoLoginResponse_QNAME = new QName("http://webapp.libraryservice.projet.org/", "doLoginResponse");
    private final static QName _DoListResponse_QNAME = new QName("http://webapp.libraryservice.projet.org/", "doListResponse");
    private final static QName _DoList_QNAME = new QName("http://webapp.libraryservice.projet.org/", "doList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.projet.library.model.user
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DoLogin }
     * 
     */
    public DoLogin createDoLogin() {
        return new DoLogin();
    }

    /**
     * Create an instance of {@link DoListResponse }
     * 
     */
    public DoListResponse createDoListResponse() {
        return new DoListResponse();
    }

    /**
     * Create an instance of {@link DoLoginResponse }
     * 
     */
    public DoLoginResponse createDoLoginResponse() {
        return new DoLoginResponse();
    }

    /**
     * Create an instance of {@link DoList }
     * 
     */
    public DoList createDoList() {
        return new DoList();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "doLogin")
    public JAXBElement<DoLogin> createDoLogin(DoLogin value) {
        return new JAXBElement<DoLogin>(_DoLogin_QNAME, DoLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "doLoginResponse")
    public JAXBElement<DoLoginResponse> createDoLoginResponse(DoLoginResponse value) {
        return new JAXBElement<DoLoginResponse>(_DoLoginResponse_QNAME, DoLoginResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "doList")
    public JAXBElement<DoList> createDoList(DoList value) {
        return new JAXBElement<DoList>(_DoList_QNAME, DoList.class, null, value);
    }

}
