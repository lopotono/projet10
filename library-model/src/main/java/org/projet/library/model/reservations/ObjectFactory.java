
package org.projet.library.model.reservations;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.projet.library.model.reservations package. 
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

    private final static QName _InsertReservation_QNAME = new QName("http://webapp.libraryservice.projet.org/", "insertReservation");
    private final static QName _GetPosition_QNAME = new QName("http://webapp.libraryservice.projet.org/", "getPosition");
    private final static QName _InsertReservationResponse_QNAME = new QName("http://webapp.libraryservice.projet.org/", "insertReservationResponse");
    private final static QName _ListReservationByUser_QNAME = new QName("http://webapp.libraryservice.projet.org/", "listReservationByUser");
    private final static QName _DeleteReservationResponse_QNAME = new QName("http://webapp.libraryservice.projet.org/", "deleteReservationResponse");
    private final static QName _ListReservationByUserResponse_QNAME = new QName("http://webapp.libraryservice.projet.org/", "listReservationByUserResponse");
    private final static QName _GetReservationResponse_QNAME = new QName("http://webapp.libraryservice.projet.org/", "getReservationResponse");
    private final static QName _GetListReservationResponse_QNAME = new QName("http://webapp.libraryservice.projet.org/", "getListReservationResponse");
    private final static QName _GetPositionResponse_QNAME = new QName("http://webapp.libraryservice.projet.org/", "getPositionResponse");
    private final static QName _GetListReservation_QNAME = new QName("http://webapp.libraryservice.projet.org/", "getListReservation");
    private final static QName _DeleteReservation_QNAME = new QName("http://webapp.libraryservice.projet.org/", "deleteReservation");
    private final static QName _GetReservation_QNAME = new QName("http://webapp.libraryservice.projet.org/", "getReservation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.projet.library.model.reservations
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListReservationByUser }
     * 
     */
    public ListReservationByUser createListReservationByUser() {
        return new ListReservationByUser();
    }

    /**
     * Create an instance of {@link DeleteReservationResponse }
     * 
     */
    public DeleteReservationResponse createDeleteReservationResponse() {
        return new DeleteReservationResponse();
    }

    /**
     * Create an instance of {@link ListReservationByUserResponse }
     * 
     */
    public ListReservationByUserResponse createListReservationByUserResponse() {
        return new ListReservationByUserResponse();
    }

    /**
     * Create an instance of {@link InsertReservation }
     * 
     */
    public InsertReservation createInsertReservation() {
        return new InsertReservation();
    }

    /**
     * Create an instance of {@link GetPosition }
     * 
     */
    public GetPosition createGetPosition() {
        return new GetPosition();
    }

    /**
     * Create an instance of {@link InsertReservationResponse }
     * 
     */
    public InsertReservationResponse createInsertReservationResponse() {
        return new InsertReservationResponse();
    }

    /**
     * Create an instance of {@link GetListReservationResponse }
     * 
     */
    public GetListReservationResponse createGetListReservationResponse() {
        return new GetListReservationResponse();
    }

    /**
     * Create an instance of {@link GetPositionResponse }
     * 
     */
    public GetPositionResponse createGetPositionResponse() {
        return new GetPositionResponse();
    }

    /**
     * Create an instance of {@link GetReservationResponse }
     * 
     */
    public GetReservationResponse createGetReservationResponse() {
        return new GetReservationResponse();
    }

    /**
     * Create an instance of {@link GetListReservation }
     * 
     */
    public GetListReservation createGetListReservation() {
        return new GetListReservation();
    }

    /**
     * Create an instance of {@link DeleteReservation }
     * 
     */
    public DeleteReservation createDeleteReservation() {
        return new DeleteReservation();
    }

    /**
     * Create an instance of {@link GetReservation }
     * 
     */
    public GetReservation createGetReservation() {
        return new GetReservation();
    }

    /**
     * Create an instance of {@link Livre }
     * 
     */
    public Livre createLivre() {
        return new Livre();
    }

    /**
     * Create an instance of {@link Reservation }
     * 
     */
    public Reservation createReservation() {
        return new Reservation();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "insertReservation")
    public JAXBElement<InsertReservation> createInsertReservation(InsertReservation value) {
        return new JAXBElement<InsertReservation>(_InsertReservation_QNAME, InsertReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPosition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "getPosition")
    public JAXBElement<GetPosition> createGetPosition(GetPosition value) {
        return new JAXBElement<GetPosition>(_GetPosition_QNAME, GetPosition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "insertReservationResponse")
    public JAXBElement<InsertReservationResponse> createInsertReservationResponse(InsertReservationResponse value) {
        return new JAXBElement<InsertReservationResponse>(_InsertReservationResponse_QNAME, InsertReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListReservationByUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "listReservationByUser")
    public JAXBElement<ListReservationByUser> createListReservationByUser(ListReservationByUser value) {
        return new JAXBElement<ListReservationByUser>(_ListReservationByUser_QNAME, ListReservationByUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "deleteReservationResponse")
    public JAXBElement<DeleteReservationResponse> createDeleteReservationResponse(DeleteReservationResponse value) {
        return new JAXBElement<DeleteReservationResponse>(_DeleteReservationResponse_QNAME, DeleteReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListReservationByUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "listReservationByUserResponse")
    public JAXBElement<ListReservationByUserResponse> createListReservationByUserResponse(ListReservationByUserResponse value) {
        return new JAXBElement<ListReservationByUserResponse>(_ListReservationByUserResponse_QNAME, ListReservationByUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "getReservationResponse")
    public JAXBElement<GetReservationResponse> createGetReservationResponse(GetReservationResponse value) {
        return new JAXBElement<GetReservationResponse>(_GetReservationResponse_QNAME, GetReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "getListReservationResponse")
    public JAXBElement<GetListReservationResponse> createGetListReservationResponse(GetListReservationResponse value) {
        return new JAXBElement<GetListReservationResponse>(_GetListReservationResponse_QNAME, GetListReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPositionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "getPositionResponse")
    public JAXBElement<GetPositionResponse> createGetPositionResponse(GetPositionResponse value) {
        return new JAXBElement<GetPositionResponse>(_GetPositionResponse_QNAME, GetPositionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "getListReservation")
    public JAXBElement<GetListReservation> createGetListReservation(GetListReservation value) {
        return new JAXBElement<GetListReservation>(_GetListReservation_QNAME, GetListReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "deleteReservation")
    public JAXBElement<DeleteReservation> createDeleteReservation(DeleteReservation value) {
        return new JAXBElement<DeleteReservation>(_DeleteReservation_QNAME, DeleteReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "getReservation")
    public JAXBElement<GetReservation> createGetReservation(GetReservation value) {
        return new JAXBElement<GetReservation>(_GetReservation_QNAME, GetReservation.class, null, value);
    }

}
