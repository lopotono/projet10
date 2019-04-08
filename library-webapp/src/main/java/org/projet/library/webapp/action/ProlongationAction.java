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
		// Récupération de la date du jour 
		Calendar now = Calendar.getInstance();
		// Récupération de la date de fin de prêt
		Calendar date = pret.getDatefin();		
		
		// Conditions pour comparer la date du jour et la date de fin de prêt
		if (date.equals(now) || date.after(now)) {
			PropertyLoader propertiesloader = new PropertyLoader();
			Properties properties = propertiesloader.getProperty();
			int nb = Integer.valueOf(properties.getProperty("nombreJours"));
			date.add(Calendar.DATE, nb);
			pret.setProlongation(true);
			pret.setEtat("prêt prolongé");
		// Condition pour comparer avant la date de fin de prêt	
		} else if (date.before(now)) {
			pret.setEtat("en cours");
			pret.setProlongation(false);
		}
		// Appel de la méthode update
		getManagerFactory().getPretManager().update(pret);

		vResult = ActionSupport.SUCCESS;
		return vResult;
	}

}
