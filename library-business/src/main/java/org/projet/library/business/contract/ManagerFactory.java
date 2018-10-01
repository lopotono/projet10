package org.projet.library.business.contract;

public interface ManagerFactory {
	
	LivreManager getLivreManager();
	
	PretManager getPretManager();
	
	UserManager getUserManager();
}