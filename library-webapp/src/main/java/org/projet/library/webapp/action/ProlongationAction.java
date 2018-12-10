package org.projet.library.webapp.action;

import java.util.Calendar;
import java.util.Properties;

import org.projet.library.model.prets.Pret;
import org.projet.library.webapp.PropertyLoader;

import com.opensymphony.xwork2.ActionSupport;

public class ProlongationAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -915156647719284676L;
	private boolean prolongation;
	private Calendar datefin;
	private Pret pret;
	private int id;

	public boolean isProlongation() {
		return prolongation;
	}

	public void setProlongation(boolean prolongation) {
		this.prolongation = prolongation;
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

			Calendar date = pret.getDatefin();
			PropertyLoader propertiesloader = new PropertyLoader();
			Properties properties = propertiesloader.getProperty();
			int nb = Integer.valueOf(properties.getProperty("nombreJours"));
			date.add(Calendar.DATE, nb);
			pret.setProlongation(true);
			pret.setEtat("prolongé");
			// Appel de la méthode update
			getManagerFactory().getPretManager().update(pret);
			vResult = ActionSupport.SUCCESS;
		return vResult;
	}	
}