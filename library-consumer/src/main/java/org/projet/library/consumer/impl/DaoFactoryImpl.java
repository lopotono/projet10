package org.projet.library.consumer.impl;

import org.projet.library.consumer.contract.DaoFactory;
import org.projet.library.consumer.contract.LivreDAO;
import org.projet.library.consumer.contract.PretDAO;
import org.projet.library.consumer.contract.ReservationDAO;
import org.projet.library.consumer.contract.UserDAO;

public class DaoFactoryImpl implements DaoFactory {
	
	private LivreDAO livreDao;
	private PretDAO pretDao;
	private UserDAO userDao;
	private ReservationDAO reservationDao;
	
	public LivreDAO getLivreDao() {
		return livreDao;
	}
	public void setLivreDao(LivreDAO livreDao) {
		this.livreDao = livreDao;
	}
	
	public PretDAO getPretDao() {
		return pretDao;
	}
	public void setPretDao(PretDAO pretDao) {
		this.pretDao = pretDao;
	}
	
	public UserDAO getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}
	
	public ReservationDAO getReservationDao() {
		return reservationDao;
	}
	public void setReservationDao(ReservationDAO reservationDao) {
		this.reservationDao = reservationDao;
	}
}