package org.projet.libraryservice.model;

import java.util.Date;

public class Reservation {
	
	private int id;
	private Date datereservation;
	private int position;
	private String etat;
	private int id_livre;
	private int id_user;
	private Livre livre;
	private User vUser;
	private Date datemail;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDatereservation() {
		return datereservation;
	}

	public void setDatereservation(Date datereservation) {
		this.datereservation = datereservation;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getId_livre() {
		return id_livre;
	}

	public void setId_livre(int id_livre) {
		this.id_livre = id_livre;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public Livre getLivre() {
		return livre;
	}

	public void setLivre(Livre livre) {
		this.livre = livre;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public User getvUser() {
		return vUser;
	}

	public void setvUser(User vUser) {
		this.vUser = vUser;
	}

	public Date getDatemail() {
		return datemail;
	}

	public void setDatemail(Date datemail) {
		this.datemail = datemail;
	}
}