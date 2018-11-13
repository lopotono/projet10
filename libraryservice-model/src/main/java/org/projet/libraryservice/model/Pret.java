package org.projet.libraryservice.model;

import java.util.Calendar;

public class Pret {
	
	private int id;
	private Calendar datedebut;
	private Calendar datefin;
	private String etat;
	private boolean prolongation;
	private Livre livre;
	private int id_livre;
	private int id_user;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Calendar getDatedebut() {
		return datedebut;
	}
	public void setDatedebut(Calendar datedebut) {
		this.datedebut = datedebut;
	}	
	
	public Calendar getDatefin() {
		return datefin;
	}
	public void setDatefin(Calendar datefin) {
		this.datefin = datefin;
	}
	
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	
	public boolean isProlongation() {
		return prolongation;
	}
	public void setProlongation(boolean prolongation) {
		this.prolongation = prolongation;
	}	
	
	public Livre getLivre() {
		return livre;
	}
	public void setLivre(Livre livre) {
		this.livre = livre;
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
}