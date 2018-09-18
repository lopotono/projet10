package org.projet.libraryservice.business.contract;

public interface ManagerFactory {

    LivreManager getLivreManager();
    UserManager getUserManager();
    PretManager getPretManager();
}