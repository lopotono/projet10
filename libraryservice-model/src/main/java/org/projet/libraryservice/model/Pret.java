package org.projet.libraryservice.model;

import java.util.Calendar;
import java.util.Date;

public class Pret {
	
	private int id;
	private Calendar datedebut;
	private Calendar datefin;
	private String etat;
	private Date dateprolongation;
	
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
	
	public Date getDateprolongation() {
		return dateprolongation;
	}
	public void setDateprolongation(Date dateprolongation) {
		this.dateprolongation = dateprolongation;
	}
}