package org.projet.libraryservice.webapp;

import org.projet.libraryservice.business.contract.ManagerFactory;

public abstract class AbstractWebapp {

	private static ManagerFactory managerFactory;

	public static ManagerFactory getManagerFactory() {
		return managerFactory;
	}

	public static void setManagerFactory(ManagerFactory managerFactory) {
		AbstractWebapp.managerFactory = managerFactory;
	}
}