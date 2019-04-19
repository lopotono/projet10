
package org.projet.library.model.reservations;

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
@WebService(name = "ReservationWS", targetNamespace = "http://webapp.libraryservice.projet.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ReservationWS {


    /**
     * 
     * @param vUser
     * @return
     *     returns java.util.List<org.projet.library.model.reservations.Reservation>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listReservationByUser", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.reservations.ListReservationByUser")
    @ResponseWrapper(localName = "listReservationByUserResponse", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.reservations.ListReservationByUserResponse")
    @Action(input = "http://webapp.libraryservice.projet.org/ReservationWS/listReservationByUserRequest", output = "http://webapp.libraryservice.projet.org/ReservationWS/listReservationByUserResponse")
    public List<Reservation> listReservationByUser(
    		@WebParam(name = "arg0", targetNamespace = "")
    		org.projet.library.model.users.User vUser);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "insertReservation", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.reservations.InsertReservation")
    @ResponseWrapper(localName = "insertReservationResponse", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.reservations.InsertReservationResponse")
    @Action(input = "http://webapp.libraryservice.projet.org/ReservationWS/insertReservationRequest", output = "http://webapp.libraryservice.projet.org/ReservationWS/insertReservationResponse")
    public void insertReservation(
        @WebParam(name = "arg0", targetNamespace = "")
        Reservation arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns org.projet.library.model.reservations.Reservation
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getReservation", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.reservations.GetReservation")
    @ResponseWrapper(localName = "getReservationResponse", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.reservations.GetReservationResponse")
    @Action(input = "http://webapp.libraryservice.projet.org/ReservationWS/getReservationRequest", output = "http://webapp.libraryservice.projet.org/ReservationWS/getReservationResponse")
    public Reservation getReservation(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns java.util.List<org.projet.library.model.reservations.Reservation>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getListReservation", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.reservations.GetListReservation")
    @ResponseWrapper(localName = "getListReservationResponse", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.reservations.GetListReservationResponse")
    @Action(input = "http://webapp.libraryservice.projet.org/ReservationWS/getListReservationRequest", output = "http://webapp.libraryservice.projet.org/ReservationWS/getListReservationResponse")
    public List<Reservation> getListReservation();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "deleteReservation", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.reservations.DeleteReservation")
    @ResponseWrapper(localName = "deleteReservationResponse", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.reservations.DeleteReservationResponse")
    @Action(input = "http://webapp.libraryservice.projet.org/ReservationWS/deleteReservationRequest", output = "http://webapp.libraryservice.projet.org/ReservationWS/deleteReservationResponse")
    public void deleteReservation(
        @WebParam(name = "arg0", targetNamespace = "")
        Reservation arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<org.projet.library.model.reservations.Reservation>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPosition", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.reservations.GetPosition")
    @ResponseWrapper(localName = "getPositionResponse", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.reservations.GetPositionResponse")
    @Action(input = "http://webapp.libraryservice.projet.org/ReservationWS/getPositionRequest", output = "http://webapp.libraryservice.projet.org/ReservationWS/getPositionResponse")
    public List<Reservation> getPosition(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
