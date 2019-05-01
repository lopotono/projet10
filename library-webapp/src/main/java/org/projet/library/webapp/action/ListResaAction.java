package org.projet.library.webapp.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.projet.library.model.reservations.Reservation;

import com.opensymphony.xwork2.ActionSupport;

public class ListResaAction extends AbstractAction implements SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 302679272470083262L;

	private Map<String, Object> session;
	private List<Reservation> listReservation;
	
	
	public Map<String, Object> getSession() {
		return session;
	}
	
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
		
	}
	
	public List<Reservation> getListReservation() {
		return listReservation;
	}
	
	public void setListReservation(List<Reservation> listReservation) {
		this.listReservation = listReservation;
	}
	
	public String execute() {
		
		org.projet.library.model.users.User vUser = (org.projet.library.model.users.User) session.get("user");
		listReservation = getManagerFactory().getReservationManager().listReservationByUserId(vUser.getId());
		if (listReservation.size() == 0) {
			addActionError("Vous n'avez aucune réservation.");
		}
		return ActionSupport.SUCCESS;	
	}
}