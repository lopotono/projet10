
package org.projet.library.model.reservations;

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
@WebServiceClient(name = "ReservationWS", targetNamespace = "http://webapp.libraryservice.projet.org/", wsdlLocation = "http://linux.home:8080/libraryservice-webapp427024690506988823/ReservationWS?wsdl")
public class ReservationWS_Service
    extends Service
{

    private final static URL RESERVATIONWS_WSDL_LOCATION;
    private final static WebServiceException RESERVATIONWS_EXCEPTION;
    private final static QName RESERVATIONWS_QNAME = new QName("http://webapp.libraryservice.projet.org/", "ReservationWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://linux.home:8080/libraryservice-webapp427024690506988823/ReservationWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RESERVATIONWS_WSDL_LOCATION = url;
        RESERVATIONWS_EXCEPTION = e;
    }

    public ReservationWS_Service() {
        super(__getWsdlLocation(), RESERVATIONWS_QNAME);
    }

    public ReservationWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), RESERVATIONWS_QNAME, features);
    }

    public ReservationWS_Service(URL wsdlLocation) {
        super(wsdlLocation, RESERVATIONWS_QNAME);
    }

    public ReservationWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RESERVATIONWS_QNAME, features);
    }

    public ReservationWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ReservationWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ReservationWS
     */
    @WebEndpoint(name = "ReservationWSPort")
    public ReservationWS getReservationWSPort() {
        return super.getPort(new QName("http://webapp.libraryservice.projet.org/", "ReservationWSPort"), ReservationWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ReservationWS
     */
    @WebEndpoint(name = "ReservationWSPort")
    public ReservationWS getReservationWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webapp.libraryservice.projet.org/", "ReservationWSPort"), ReservationWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RESERVATIONWS_EXCEPTION!= null) {
            throw RESERVATIONWS_EXCEPTION;
        }
        return RESERVATIONWS_WSDL_LOCATION;
    }

}
