package org.projet.library.webapp.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.projet.library.model.reservations.Livre;
import org.projet.library.model.reservations.Reservation;
import org.projet.library.model.users.User;

import com.opensymphony.xwork2.ActionSupport;

public class ReserverAction extends AbstractAction implements SessionAware {

	private static final long serialVersionUID = 3672597566981260465L;
	
	private int id;
	private Map<String, Object> session;
	private int livreid;
	private User vUser;
	private List<Reservation> listReservation;
	private Livre livre;

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

	public User getvUser() {
		return vUser;
	}

	public void setvUser(User vUser) {
		this.vUser = vUser;
	}

	public List<Reservation> getListReservation() {
		return listReservation;
	}

	public void setListReservation(List<Reservation> listReservation) {
		this.listReservation = listReservation;
	}

	public Livre getLivre() {
		return livre;
	}

	public void setLivre(Livre livre) {
		this.livre = livre;
	}

	public String execute() {

		String vResult = ActionSupport.INPUT;
		
		// Récupérer id du livre
		org.projet.library.model.livres.Livre livre = getManagerFactory().getLivreManager().getLivre(livreid);
		Livre livre2 = transforme(livre);
		Reservation reservation = new Reservation();
		// Récupérer la date du jour (datereservation)
		Date dateJour = new Date();
		// Insérer état à "réservé"
		reservation.setEtat("réservé");
		// Insérer datereservation = date du jour
		reservation.setDatereservation(dateJour);
		// Récupérer id livre et insérer id du livre
		reservation.setIdLivre(livre2.getLivreid());
		reservation.setLivre(livre2);
		org.projet.library.model.users.User vUser = (org.projet.library.model.users.User) session.get("user");
		// Récupérer id utilisateur
		reservation.setIdUser(vUser.getId());
		listReservation = getManagerFactory().getReservationManager().listReservationByUserId(vUser.getId());
		for (Reservation resa : listReservation) {
			if (reservation.getIdLivre() == resa.getIdLivre()) {
				addActionError("Vous avez déjà réservé ce livre : " + livre.getTitre());
				return ActionSupport.ERROR;
			}
		}
		// Insertion des données (état, date du jour, id livre et id user) dans la table
		// réservation
		getManagerFactory().getReservationManager().insertReservation(reservation);
		
		addActionMessage("Vous avez réservé le livre : " + livre.getTitre() + " de " + livre.getAuteur());
		vResult = ActionSupport.SUCCESS;
		return vResult;
	}

	private Livre transforme(org.projet.library.model.livres.Livre livre) {

		Livre livre2 = new Livre();
		livre2.setLivreid(livre.getLivreid());
		livre2.setTitre(livre.getTitre());
		livre2.setAuteur(livre.getAuteur());
		livre2.setDisponible(livre.isDisponible());
		livre2.setEditeur(livre.getEditeur());
		livre2.setGenre(livre.getGenre());
		livre2.setIsbn(livre.getIsbn());
		livre2.setNbexemplaire(livre.getNbexemplaire());
		livre2.setPersonnemax(livre.getPersonnemax());
		return livre2;
	}
}