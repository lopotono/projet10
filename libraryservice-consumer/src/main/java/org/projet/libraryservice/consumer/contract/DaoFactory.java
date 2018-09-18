package org.projet.libraryservice.consumer.contract;

public interface DaoFactory {

   public LivreDAO getLivreDao();
   public UserDAO getUserDao();
   public PretDAO getPretDao();
}