package org.projet.library.webapp.action;

import org.projet.library.model.reservations.Reservation;

import com.opensymphony.xwork2.ActionSupport;

public class AnnulerAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6294017072158483046L;
	
	private boolean annuler;
	private int id;

	public boolean isAnnuler() {
		return annuler;
	}

	public void setAnnuler(boolean annuler) {
		this.annuler = annuler;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String execute() {
		
		String vResult = ActionSupport.SUCCESS;
		Reservation reservation = getManagerFactory().getReservationManager().getReservation(id);
		getManagerFactory().getReservationManager().deleteReservation(reservation);
		addActionError("Vous avez annulé votre réservation.");
		return vResult;
				
	}

}
