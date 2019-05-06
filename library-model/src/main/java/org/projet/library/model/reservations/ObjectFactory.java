
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
    private final static QName _InsertReservationResponse_QNAME = new QName("http://webapp.libraryservice.projet.org/", "insertReservationResponse");
    private final static QName _ListReservationByUserId_QNAME = new QName("http://webapp.libraryservice.projet.org/", "listReservationByUserId");
    private final static QName _GetReservationResponse_QNAME = new QName("http://webapp.libraryservice.projet.org/", "getReservationResponse");
    private final static QName _GetListReservationResponse_QNAME = new QName("http://webapp.libraryservice.projet.org/", "getListReservationResponse");
    private final static QName _GetReservationsByIdLivre_QNAME = new QName("http://webapp.libraryservice.projet.org/", "getReservationsByIdLivre");
    private final static QName _GetListReservation_QNAME = new QName("http://webapp.libraryservice.projet.org/", "getListReservation");
    private final static QName _GetReservation_QNAME = new QName("http://webapp.libraryservice.projet.org/", "getReservation");
    private final static QName _GetReservationByIdLivreAndPositionResponse_QNAME = new QName("http://webapp.libraryservice.projet.org/", "getReservationByIdLivreAndPositionResponse");
    private final static QName _UpdateReservationResponse_QNAME = new QName("http://webapp.libraryservice.projet.org/", "updateReservationResponse");
    private final static QName _GetReservationsByIdLivreResponse_QNAME = new QName("http://webapp.libraryservice.projet.org/", "getReservationsByIdLivreResponse");
    private final static QName _DeleteReservationResponse_QNAME = new QName("http://webapp.libraryservice.projet.org/", "deleteReservationResponse");
    private final static QName _ListReservationByUserIdResponse_QNAME = new QName("http://webapp.libraryservice.projet.org/", "listReservationByUserIdResponse");
    private final static QName _UpdateReservation_QNAME = new QName("http://webapp.libraryservice.projet.org/", "updateReservation");
    private final static QName _GetReservationByIdLivreAndPosition_QNAME = new QName("http://webapp.libraryservice.projet.org/", "getReservationByIdLivreAndPosition");
    private final static QName _DeleteReservation_QNAME = new QName("http://webapp.libraryservice.projet.org/", "deleteReservation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.projet.library.model.reservations
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetReservationsByIdLivreResponse }
     * 
     */
    public GetReservationsByIdLivreResponse createGetReservationsByIdLivreResponse() {
        return new GetReservationsByIdLivreResponse();
    }

    /**
     * Create an instance of {@link DeleteReservationResponse }
     * 
     */
    public DeleteReservationResponse createDeleteReservationResponse() {
        return new DeleteReservationResponse();
    }

    /**
     * Create an instance of {@link GetReservationByIdLivreAndPositionResponse }
     * 
     */
    public GetReservationByIdLivreAndPositionResponse createGetReservationByIdLivreAndPositionResponse() {
        return new GetReservationByIdLivreAndPositionResponse();
    }

    /**
     * Create an instance of {@link UpdateReservationResponse }
     * 
     */
    public UpdateReservationResponse createUpdateReservationResponse() {
        return new UpdateReservationResponse();
    }

    /**
     * Create an instance of {@link ListReservationByUserIdResponse }
     * 
     */
    public ListReservationByUserIdResponse createListReservationByUserIdResponse() {
        return new ListReservationByUserIdResponse();
    }

    /**
     * Create an instance of {@link UpdateReservation }
     * 
     */
    public UpdateReservation createUpdateReservation() {
        return new UpdateReservation();
    }

    /**
     * Create an instance of {@link GetReservationByIdLivreAndPosition }
     * 
     */
    public GetReservationByIdLivreAndPosition createGetReservationByIdLivreAndPosition() {
        return new GetReservationByIdLivreAndPosition();
    }

    /**
     * Create an instance of {@link DeleteReservation }
     * 
     */
    public DeleteReservation createDeleteReservation() {
        return new DeleteReservation();
    }

    /**
     * Create an instance of {@link InsertReservation }
     * 
     */
    public InsertReservation createInsertReservation() {
        return new InsertReservation();
    }

    /**
     * Create an instance of {@link InsertReservationResponse }
     * 
     */
    public InsertReservationResponse createInsertReservationResponse() {
        return new InsertReservationResponse();
    }

    /**
     * Create an instance of {@link ListReservationByUserId }
     * 
     */
    public ListReservationByUserId createListReservationByUserId() {
        return new ListReservationByUserId();
    }

    /**
     * Create an instance of {@link GetListReservationResponse }
     * 
     */
    public GetListReservationResponse createGetListReservationResponse() {
        return new GetListReservationResponse();
    }

    /**
     * Create an instance of {@link GetReservationsByIdLivre }
     * 
     */
    public GetReservationsByIdLivre createGetReservationsByIdLivre() {
        return new GetReservationsByIdLivre();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "insertReservationResponse")
    public JAXBElement<InsertReservationResponse> createInsertReservationResponse(InsertReservationResponse value) {
        return new JAXBElement<InsertReservationResponse>(_InsertReservationResponse_QNAME, InsertReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListReservationByUserId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "listReservationByUserId")
    public JAXBElement<ListReservationByUserId> createListReservationByUserId(ListReservationByUserId value) {
        return new JAXBElement<ListReservationByUserId>(_ListReservationByUserId_QNAME, ListReservationByUserId.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservationsByIdLivre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "getReservationsByIdLivre")
    public JAXBElement<GetReservationsByIdLivre> createGetReservationsByIdLivre(GetReservationsByIdLivre value) {
        return new JAXBElement<GetReservationsByIdLivre>(_GetReservationsByIdLivre_QNAME, GetReservationsByIdLivre.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "getReservation")
    public JAXBElement<GetReservation> createGetReservation(GetReservation value) {
        return new JAXBElement<GetReservation>(_GetReservation_QNAME, GetReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservationByIdLivreAndPositionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "getReservationByIdLivreAndPositionResponse")
    public JAXBElement<GetReservationByIdLivreAndPositionResponse> createGetReservationByIdLivreAndPositionResponse(GetReservationByIdLivreAndPositionResponse value) {
        return new JAXBElement<GetReservationByIdLivreAndPositionResponse>(_GetReservationByIdLivreAndPositionResponse_QNAME, GetReservationByIdLivreAndPositionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "updateReservationResponse")
    public JAXBElement<UpdateReservationResponse> createUpdateReservationResponse(UpdateReservationResponse value) {
        return new JAXBElement<UpdateReservationResponse>(_UpdateReservationResponse_QNAME, UpdateReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservationsByIdLivreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "getReservationsByIdLivreResponse")
    public JAXBElement<GetReservationsByIdLivreResponse> createGetReservationsByIdLivreResponse(GetReservationsByIdLivreResponse value) {
        return new JAXBElement<GetReservationsByIdLivreResponse>(_GetReservationsByIdLivreResponse_QNAME, GetReservationsByIdLivreResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ListReservationByUserIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "listReservationByUserIdResponse")
    public JAXBElement<ListReservationByUserIdResponse> createListReservationByUserIdResponse(ListReservationByUserIdResponse value) {
        return new JAXBElement<ListReservationByUserIdResponse>(_ListReservationByUserIdResponse_QNAME, ListReservationByUserIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "updateReservation")
    public JAXBElement<UpdateReservation> createUpdateReservation(UpdateReservation value) {
        return new JAXBElement<UpdateReservation>(_UpdateReservation_QNAME, UpdateReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservationByIdLivreAndPosition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "getReservationByIdLivreAndPosition")
    public JAXBElement<GetReservationByIdLivreAndPosition> createGetReservationByIdLivreAndPosition(GetReservationByIdLivreAndPosition value) {
        return new JAXBElement<GetReservationByIdLivreAndPosition>(_GetReservationByIdLivreAndPosition_QNAME, GetReservationByIdLivreAndPosition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.libraryservice.projet.org/", name = "deleteReservation")
    public JAXBElement<DeleteReservation> createDeleteReservation(DeleteReservation value) {
        return new JAXBElement<DeleteReservation>(_DeleteReservation_QNAME, DeleteReservation.class, null, value);
    }

}
