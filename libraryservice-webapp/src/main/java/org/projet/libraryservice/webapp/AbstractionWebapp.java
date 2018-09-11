package org.projet.libraryservice.webapp;

import com.opensymphony.xwork2.ActionSupport;
import org.projet.libraryservice.business.contract.ManagerFactory;

public abstract class AbstractionWebapp extends ActionSupport {

    private static ManagerFactory managerFactory;

    public static ManagerFactory getManagerFactory() {
        return managerFactory;
    }

    public static void setManagerFactory(ManagerFactory managerFactory) {
        AbstractionWebapp.managerFactory = managerFactory;
    }
}