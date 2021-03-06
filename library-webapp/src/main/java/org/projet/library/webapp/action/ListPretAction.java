package org.projet.library.webapp.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.projet.library.model.prets.Pret;
import org.projet.library.model.prets.User;

import com.opensymphony.xwork2.ActionSupport;

public class ListPretAction extends AbstractAction implements SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4522159096673660852L;
	
	private List<Pret> listPrets;
	private Pret pret;
	private Map<String, Object> session;
	private User vUser;

	public List<Pret> getListPrets() {
		return listPrets;
	}

	public void setListPrets(List<Pret> listPrets) {
		this.listPrets = listPrets;
	}
	
	public Pret getPret() {
		return pret;
	}

	public void setPret(Pret pret) {
		this.pret = pret;
	}
	
	public Map<String, Object> getSession() {
		return session;
	}
	
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
	public User getvUser() {
		return vUser;
	}
	
	public void setvUser(User vUser) {
		this.vUser = vUser;
	}
										
	public String listPret() {
		org.projet.library.model.user.User usr = (org.projet.library.model.user.User) session.get("user");
		vUser = new User();
		vUser.setId(usr.getId());
		listPrets = getManagerFactory().getPretManager().getPretByUser(vUser);
	
		return ActionSupport.SUCCESS;
	}
}