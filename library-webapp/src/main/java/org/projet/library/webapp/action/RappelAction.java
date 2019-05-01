package org.projet.library.webapp.action;

import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.projet.library.model.prets.Pret;
import org.projet.library.model.users.User;

import com.opensymphony.xwork2.ActionSupport;

public class RappelAction extends AbstractAction implements SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6865045859762325623L;

	private Pret pret;
	private int id;
	private Map<String, Object> session;
	private Calendar datefin;
	private List<Pret> listPret;
	private boolean option;

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

	public Calendar getDatefin() {
		return datefin;
	}

	public void setDatefin(Calendar datefin) {
		this.datefin = datefin;
	}

	public List<Pret> getListPret() {
		return listPret;
	}

	public void setListPret(List<Pret> listPret) {
		this.listPret = listPret;
	}

	public String execute() {

		String vResult = ActionSupport.INPUT;

		User vUser = (User) session.get("user");
		pret.setIdUser(vUser.getId());
		listPret = getManagerFactory().getPretManager().listPretByUserId(id);
		
		for (Pret pretlist : listPret) {
			pretlist.getIdLivre();
		}

		if (option) {
			vUser.setOption(true);
			getManagerFactory().getUserManager().updateUser(vUser);
			addActionMessage("Vous avez activé le rappel de fin de prêt par mail.");
		} else {
			vUser.setOption(false);
			getManagerFactory().getUserManager().updateUser(vUser);
			addActionMessage("Vous avez désactivé le rappel de fin de prêt par mail.");
		}

		vResult = ActionSupport.SUCCESS;
		return vResult;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}