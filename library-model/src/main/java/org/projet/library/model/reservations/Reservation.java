
package org.projet.library.model.reservations;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour reservation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="reservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datereservation" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="etat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_livre" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_user" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="livre" type="{http://webapp.libraryservice.projet.org/}livre" minOccurs="0"/>
 *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="vUser" type="{http://webapp.libraryservice.projet.org/}user" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reservation", propOrder = {
    "datereservation",
    "etat",
    "id",
    "idLivre",
    "idUser",
    "livre",
    "position",
    "vUser"
})
public class Reservation {

    @XmlSchemaType(name = "dateTime")
    protected Date datereservation;
    protected String etat;
    protected int id;
    @XmlElement(name = "id_livre")
    protected int idLivre;
    @XmlElement(name = "id_user")
    protected int idUser;
    protected Livre livre;
    protected int position;
    protected User vUser;

    /**
     * Obtient la valeur de la propriété datereservation.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getDatereservation() {
        return datereservation;
    }

    /**
     * Définit la valeur de la propriété datereservation.
     * 
     * @param dateJour
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatereservation(Date dateJour) {
        this.datereservation = dateJour;
    }

    /**
     * Obtient la valeur de la propriété etat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtat() {
        return etat;
    }

    /**
     * Définit la valeur de la propriété etat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtat(String value) {
        this.etat = value;
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété idLivre.
     * 
     */
    public int getIdLivre() {
        return idLivre;
    }

    /**
     * Définit la valeur de la propriété idLivre.
     * 
     */
    public void setIdLivre(int value) {
        this.idLivre = value;
    }

    /**
     * Obtient la valeur de la propriété idUser.
     * 
     */
    public int getIdUser() {
        return idUser;
    }

    /**
     * Définit la valeur de la propriété idUser.
     * 
     */
    public void setIdUser(int value) {
        this.idUser = value;
    }

    /**
     * Obtient la valeur de la propriété livre.
     * 
     * @return
     *     possible object is
     *     {@link Livre }
     *     
     */
    public Livre getLivre() {
        return livre;
    }

    /**
     * Définit la valeur de la propriété livre.
     * 
     * @param value
     *     allowed object is
     *     {@link Livre }
     *     
     */
    public void setLivre(Livre value) {
        this.livre = value;
    }

    /**
     * Obtient la valeur de la propriété position.
     * 
     */
    public int getPosition() {
        return position;
    }

    /**
     * Définit la valeur de la propriété position.
     * 
     */
    public void setPosition(int value) {
        this.position = value;
    }

    /**
     * Obtient la valeur de la propriété vUser.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getVUser() {
        return vUser;
    }

    /**
     * Définit la valeur de la propriété vUser.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setVUser(User value) {
        this.vUser = value;
    }

}
