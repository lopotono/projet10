package org.projet.library.webapp.action;

import org.projet.library.business.contract.ManagerFactory;

import com.opensymphony.xwork2.ActionSupport;

public abstract class AbstractAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7486567521291016434L;
	
	private static ManagerFactory managerFactory;

	public static ManagerFactory getManagerFactory() {
		return managerFactory;
	}

	public static void setManagerFactory(ManagerFactory managerFactory) {
		AbstractAction.managerFactory = managerFactory;
	}
}