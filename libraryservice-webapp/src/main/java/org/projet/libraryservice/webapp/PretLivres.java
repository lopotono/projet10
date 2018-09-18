package org.projet.libraryservice.webapp;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.jws.WebService;

import org.projet.libraryservice.model.Livre;
import org.projet.libraryservice.model.Pret;
import org.projet.libraryservice.model.User;

@WebService(serviceName = "PretLivres")
public class PretLivres extends AbstractWebapp {
	
	private List<Livre> listLivres;
	private String livreid;
	private Calendar datedebut;
	private Calendar datefin;
	private String etat;
	private Date dateprolongation;
	private boolean livredispo;
	private String userid;
	private Pret pret;
	
	public List<Livre> getListLivres() {
		return listLivres;
	}
	public void setListLivres(List<Livre> listLivres) {
		this.listLivres = listLivres;
	}
	
	public String getLivreid() {
		return livreid;
	}
	public void setLivreid(String livreid) {
		this.livreid = livreid;
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
	
	public boolean isLivredispo() {
		return livredispo;
	}
	public void setLivredispo(boolean livredispo) {
		this.livredispo = livredispo;
	}
	
	public String getUserid() {
		return userid;
	}
	
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public Pret getPret() {
		return pret;
	}
	
	public void setPret(Pret pret) {
		this.pret = pret;
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
	
	public String doPret() {
		
		listLivres = getManagerFactory().getLivreManager().getLivresDispo(livredispo);
				
		//userid = getManagerFactory().getUserManager().getUsers(userid);
		
		Calendar datedebut = new GregorianCalendar();
		Calendar datefin = Calendar.getInstance();
		datefin.add(Calendar.MONTH, 1);
		
		if (this.livreid != null) {
			try {
				pret = new Pret();
				this.pret.setDatedebut(datedebut);
				this.pret.setDatefin(datefin);
				getManagerFactory().getPretManager().SavePret(datedebut, datefin, etat, dateprolongation, userid, livreid);
			} catch (Exception e) {
				
			}
		}
		return livreid;		
	}	
}