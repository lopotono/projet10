package org.projet.library.consumer.contract;

public interface DaoFactory {

	public LivreDAO getLivreDao();
	public PretDAO getPretDao();
	public UserDAO getUserDao();
	public ReservationDAO getReservationDao();
}