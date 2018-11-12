
package org.projet.library.model.users;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "UsersWS", targetNamespace = "http://webapp.libraryservice.projet.org/", wsdlLocation = "http://linux.home:8080/libraryservice-webapp1332032557942792292/UsersWS?wsdl")
public class UsersWS_Service
    extends Service
{

    private final static URL USERSWS_WSDL_LOCATION;
    private final static WebServiceException USERSWS_EXCEPTION;
    private final static QName USERSWS_QNAME = new QName("http://webapp.libraryservice.projet.org/", "UsersWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://linux.home:8080/libraryservice-webapp1332032557942792292/UsersWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        USERSWS_WSDL_LOCATION = url;
        USERSWS_EXCEPTION = e;
    }

    public UsersWS_Service() {
        super(__getWsdlLocation(), USERSWS_QNAME);
    }

    public UsersWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), USERSWS_QNAME, features);
    }

    public UsersWS_Service(URL wsdlLocation) {
        super(wsdlLocation, USERSWS_QNAME);
    }

    public UsersWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, USERSWS_QNAME, features);
    }

    public UsersWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UsersWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UsersWS
     */
    @WebEndpoint(name = "UsersWSPort")
    public UsersWS getUsersWSPort() {
        return super.getPort(new QName("http://webapp.libraryservice.projet.org/", "UsersWSPort"), UsersWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UsersWS
     */
    @WebEndpoint(name = "UsersWSPort")
    public UsersWS getUsersWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webapp.libraryservice.projet.org/", "UsersWSPort"), UsersWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (USERSWS_EXCEPTION!= null) {
            throw USERSWS_EXCEPTION;
        }
        return USERSWS_WSDL_LOCATION;
    }

}
