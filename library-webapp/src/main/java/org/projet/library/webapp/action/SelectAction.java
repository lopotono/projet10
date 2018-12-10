package org.projet.library.webapp.action;

import java.util.Calendar;

import org.projet.library.model.prets.Pret;
import org.projet.library.webapp.PropertyLoader;

import com.opensymphony.xwork2.ActionSupport;

public class SelectAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4909988216019197523L;
	private int id;
	private Calendar datedebut;
	private int nombreJours;
	
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

	public String execute() {
		
		String vResult = ActionSupport.INPUT;
		Pret pret = getManagerFactory().getPretManager().getPretById(id);
		
		Calendar date = pret.getDatedebut();
		PropertyLoader properties = new PropertyLoader();
		properties.getProperty();
		date.add(Calendar.DATE, nombreJours);
		System.out.println(nombreJours);
		pret.setDatefin(date);
		getManagerFactory().getPretManager().update(pret);
		vResult = ActionSupport.SUCCESS;
		return vResult;		
	}
}