package org.projet.library.webapp.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.projet.library.model.users.User;

import com.opensymphony.xwork2.ActionSupport;

public class RappelAction extends AbstractAction implements SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6865045859762325623L;

	private Map<String, Object> session;
	private boolean option;

	public Map<String, Object> getSession() {
		return session;
	}
	
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
	public boolean isOption() {
		return option;
	}
	
	public void setOption(boolean option) {
		this.option = option;
	}
			
	public String execute() {

		String vResult = ActionSupport.INPUT;

		User vUser = (User) session.get("user");
		vUser.setOption(option);
		getManagerFactory().getUserManager().updateUser(vUser);
		
		if (option) {			
			addActionMessage("Vous avez activé le rappel de fin de prêt par mail.");
		} else {
			addActionMessage("Vous avez désactivé le rappel de fin de prêt par mail.");
		}
		vResult = ActionSupport.SUCCESS;
		return vResult;
	}	
}