
package org.projet.library.model.livre;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour livre complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="livre">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="auteur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disponible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="editeur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="genre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isbn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="livreid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nbexemplaire" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="personnemax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="titre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "livre", propOrder = {
    "auteur",
    "disponible",
    "editeur",
    "genre",
    "isbn",
    "livreid",
    "nbexemplaire",
    "personnemax",
    "titre"
})
public class Livre {

    protected String auteur;
    protected boolean disponible;
    protected String editeur;
    protected String genre;
    protected String isbn;
    protected int livreid;
    protected int nbexemplaire;
    protected int personnemax;
    protected String titre;

    /**
     * Obtient la valeur de la propriété auteur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuteur() {
        return auteur;
    }

    /**
     * Définit la valeur de la propriété auteur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuteur(String value) {
        this.auteur = value;
    }

    /**
     * Obtient la valeur de la propriété disponible.
     * 
     */
    public boolean isDisponible() {
        return disponible;
    }

    /**
     * Définit la valeur de la propriété disponible.
     * 
     */
    public void setDisponible(boolean value) {
        this.disponible = value;
    }

    /**
     * Obtient la valeur de la propriété editeur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditeur() {
        return editeur;
    }

    /**
     * Définit la valeur de la propriété editeur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditeur(String value) {
        this.editeur = value;
    }

    /**
     * Obtient la valeur de la propriété genre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Définit la valeur de la propriété genre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenre(String value) {
        this.genre = value;
    }

    /**
     * Obtient la valeur de la propriété isbn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Définit la valeur de la propriété isbn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsbn(String value) {
        this.isbn = value;
    }

    /**
     * Obtient la valeur de la propriété livreid.
     * 
     */
    public int getLivreid() {
        return livreid;
    }

    /**
     * Définit la valeur de la propriété livreid.
     * 
     */
    public void setLivreid(int value) {
        this.livreid = value;
    }

    /**
     * Obtient la valeur de la propriété nbexemplaire.
     * 
     */
    public int getNbexemplaire() {
        return nbexemplaire;
    }

    /**
     * Définit la valeur de la propriété nbexemplaire.
     * 
     */
    public void setNbexemplaire(int value) {
        this.nbexemplaire = value;
    }

    /**
     * Obtient la valeur de la propriété personnemax.
     * 
     */
    public int getPersonnemax() {
        return personnemax;
    }

    /**
     * Définit la valeur de la propriété personnemax.
     * 
     */
    public void setPersonnemax(int value) {
        this.personnemax = value;
    }

    /**
     * Obtient la valeur de la propriété titre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Définit la valeur de la propriété titre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitre(String value) {
        this.titre = value;
    }

}
