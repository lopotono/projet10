package org.projet.library.webapp.action;

import java.util.Calendar;

import org.projet.library.model.prets.Pret;

import com.opensymphony.xwork2.ActionSupport;

public class ProlongationAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -915156647719284676L;
	private Calendar dateprolongation;
	private Calendar datefin;
	private Pret pret;
	private int id;

	public Calendar getDateprolongation() {
		return dateprolongation;
	}

	public void setDateprolongation(Calendar dateprolongation) {
		this.dateprolongation = dateprolongation;
	}

	public Calendar getDatefin() {
		return datefin;
	}

	public void setDatefin(Calendar datefin) {
		this.datefin = datefin;
	}
	
	public Pret getPret() {
		return pret;
	}
	
	public void setPret(Pret pret) {
		this.pret = pret;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String execute() {
		
		String vResult = ActionSupport.INPUT;
		Pret pret = getManagerFactory().getPretManager().getPretById(id);
		
		// Vérifier la date de prolongation si existe déjà
		if (dateprolongation != null) {			
			Calendar date = pret.getDatefin();
			date.add(Calendar.MONTH, 1);			
			pret.setDateprolongation(date);
			pret.setEtat("prolongé");
			//Appel de la méthode update
			getManagerFactory().getPretManager().update(pret);
			vResult = ActionSupport.SUCCESS;
		}
		return vResult;	
	}
}