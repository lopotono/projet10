package org.projet.library.webapp.action;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.interceptor.SessionAware;
import org.projet.library.model.exception.NotFoundException;
import org.projet.library.model.user.User;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends AbstractAction implements SessionAware{ 
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3398753480148407536L;
	
	private String name;
	private String password;
	private Map<String, Object> session;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String doLogin() {
		String vResult = ActionSupport.INPUT;
		if (!StringUtils.isAllEmpty(name, password)) {
			try {
				User vUser = AbstractAction.getManagerFactory().getUserManager().getUser(name, password);
				
				if (vUser == null) {
					throw new NotFoundException();
				}
				this.session.put("user", vUser);
				
				vResult = ActionSupport.SUCCESS;
				
			} catch (NotFoundException pE) {
				this.addActionError("Identifiant ou mot de passe invalide !");
			}
		}
		return vResult;
	}
	
	public String doLogout() {

		this.session.remove("user");

		return ActionSupport.SUCCESS;
	}
	
	@Override
	public void setSession(Map<String, Object> pSession) {
		this.session = pSession;		
	}
}