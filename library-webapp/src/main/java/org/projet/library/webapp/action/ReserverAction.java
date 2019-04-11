package org.projet.library.webapp.action;

import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.projet.library.model.livres.Livre;
import org.projet.library.model.reservations.Reservation;
import org.projet.library.model.users.User;

import com.opensymphony.xwork2.ActionSupport;

public class ReserverAction extends AbstractAction implements SessionAware {

	private static final long serialVersionUID = 3672597566981260465L;

	private int id;
	private Map<String, Object> session;
	private Date datereservation;
	private String etat;
	private int iduser;
	private int idlivre;
	private int livreid;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
		
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
		
	}
	
	public int getLivreid() {
		return livreid;
	}

	public void setLivreid(int livreid) {
		this.livreid = livreid;
	}

	public String execute() {
		
		String vResult = ActionSupport.INPUT;
		
		// Récupérer id du livre
		Livre livre = getManagerFactory().getLivreManager().getLivre(id);
		Reservation reservation = new Reservation();
		
		// Récupérer la date du jour (datereservation)
		Date dateJour = new Date();
		// Insérer état à "réservé"
		reservation.setEtat("réservé");
		// Insérer datereservation = date du jour
		reservation.setDatereservation(dateJour);
		// Récupérer id livre et insérer id du livre 
		reservation.setIdLivre(livre.getLivreid());
		reservation.setLivre(livre);

		User user = (User) this.session.get("user");
		// Récupérer id utilisateur
		reservation.setIdUser(user.getId());
		// Insertion des données (état, date du jour) dans la table réservation
		getManagerFactory().getReservationManager().insertReservation(datereservation, etat, iduser, idlivre);
		return vResult;
	}
	
}

