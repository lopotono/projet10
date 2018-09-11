package org.projet.libraryservice.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.projet.libraryservice.business.contract.ManagerFactory;
import org.projet.libraryservice.business.impl.AbstractManager;

public abstract class AbstractAction extends ActionSupport {

    private static ManagerFactory managerFactory;

    public static ManagerFactory getManagerFactory() {
        return managerFactory;
    }

    public static void setManagerFactory(ManagerFactory managerFactory) {
        AbstractAction.managerFactory = managerFactory;
    }
}