
package org.projet.library.model.prets;

import java.util.Calendar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour pret complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="pret">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datedebut" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="datefin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="etat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_livre" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_user" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="livre" type="{http://webapp.libraryservice.projet.org/}livre" minOccurs="0"/>
 *         &lt;element name="prolongation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pret", propOrder = {
    "datedebut",
    "datefin",
    "etat",
    "id",
    "idLivre",
    "idUser",
    "livre",
    "prolongation"
})
public class Pret {

    @XmlSchemaType(name = "dateTime")
    protected Calendar datedebut;
    @XmlSchemaType(name = "dateTime")
    protected Calendar datefin;
    protected String etat;
    protected int id;
    @XmlElement(name = "id_livre")
    protected int idLivre;
    @XmlElement(name = "id_user")
    protected int idUser;
    protected Livre livre;
    protected boolean prolongation;

    /**
     * Obtient la valeur de la propriété datedebut.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Calendar getDatedebut() {
        return datedebut;
    }

    /**
     * Définit la valeur de la propriété datedebut.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatedebut(Calendar value) {
        this.datedebut = value;
    }

    /**
     * Obtient la valeur de la propriété datefin.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Calendar getDatefin() {
        return datefin;
    }

    /**
     * Définit la valeur de la propriété datefin.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatefin(Calendar value) {
        this.datefin = value;
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
     * Obtient la valeur de la propriété prolongation.
     * 
     */
    public boolean isProlongation() {
        return prolongation;
    }

    /**
     * Définit la valeur de la propriété prolongation.
     * 
     */
    public void setProlongation(boolean value) {
        this.prolongation = value;
    }

}
