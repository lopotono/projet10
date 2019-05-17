package org.projet.library.batch;

import java.util.Calendar;
import java.util.List;

import org.projet.library.business.contract.ManagerFactory;
import org.projet.library.model.livre.Livre;
import org.projet.library.model.prets.Pret;
import org.projet.library.model.reservations.Reservation;
import org.projet.library.model.users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
@ImportResource({ "classpath:businessContext.xml", "classpath:consumerContext.xml" })
public class Application {

	@Autowired
	@Qualifier("projetMailSender")
	private MailSender ms;

	@Autowired
	private ManagerFactory mf;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

	@Scheduled(cron = "0 */1 * * * ?")

	public void schedule() {
		List<Pret> list = mf.getPretManager().getPretLate();
		for (Pret pret : list) {
			org.projet.library.model.users.User user = mf.getUserManager().getUser(pret.getIdUser());
			Livre livre = mf.getLivreManager().getLivre(pret.getIdLivre());
			String body = "Le livre " + livre.getTitre() + " doit être rendu au plus vite !";
			ms.sendMail("terragef@gmail.com", user.getMail(), "Pret en retard", body);
		}
	}

	@Scheduled(cron = "*/1 * * * * ?")
	public void doMail() {
		// Récupérer les livres disponibles
		List<Livre> listlivresdispo = mf.getLivreManager().getLivresDisponibles();
		for (Livre livredispo : listlivresdispo) {
			// Récupérer la liste des réservations par livre
			List<Reservation> listreservation = mf.getReservationManager()
					.getReservationsByIdLivre(livredispo.getLivreid());
			for (Reservation resa : listreservation) {
				// Utilisateur avec la position 1
				if (resa.getPosition() == 1) {
					Calendar dateJour = Calendar.getInstance();
					// Si le mail n'est pas envoyé
					if (resa.getDatemail() == null) {
						// Récupérer la date du jour (date du mail)
						sendMail(resa);
						// Le mail est déjà envoyé
					} else {
						// Si les 48 heures ne sont pas encore passées
						Calendar datelimite = resa.getDatemail();
						datelimite.add(Calendar.DATE, 2);
						if (datelimite.compareTo(dateJour) < 0) {
							// Si 48 heures sont passées : supprimer la réservation
							mf.getReservationManager().deleteReservation(resa);
							Reservation reservationsuivante = mf.getReservationManager()
									.getReservationByIdLivreAndPosition(livredispo.getLivreid(), 1);
							sendMail(reservationsuivante);
						}
					}
				}
			}
		}
	}

	private void sendMail(Reservation reservation) {

		String subject = "Votre livre est disponible.";
		String body = "Le livre " + reservation.getLivre().getTitre()
				+ " est disponible à la bibliothèque. Vous disposez de 48 h pour venir le chercher, au-delà de cette période la réservation sera annulée.";

		Calendar dateJour = Calendar.getInstance();
		System.out.println(dateJour);
		reservation.setDatemail(dateJour);
		User user = mf.getUserManager().getUser(reservation.getIdUser());
		ms.sendMail("terragef@gmail.com", user.getMail(), subject, body);
		mf.getReservationManager().updateReservation(reservation);
	}

	public void recallMail() {

		// Récupérer la liste des utilisateurs qui ont coché l'option (true)
		List<User> listuser = mf.getUserManager().listUserByOption(true);
		for (User user : listuser) {
			// Récupérer la liste des prêts de chaque utilisateur
			List<Pret> listpret = mf.getPretManager().listPretByUserId(user.getId());
			for (Pret pret : listpret) {
				// Récupérer la date du jour
				Calendar today = Calendar.getInstance();
				// Récupérer la date de fin de prêt
				Calendar datefin = pret.getDatefin();
				// Retrancher 5 jours à la date de fin de prêt
				datefin.add(Calendar.DATE, -5);
				// Faire comparer les dates du jour et de fin de pret
				// Si les dates sont égales envoi du mail
				if (datefin.compareTo(today) < 0) {
					Livre livre = mf.getLivreManager().getLivre(pret.getIdLivre());
					String subject = "Rappel de fin de prêt.";
					String body = "Vous recevez ce mail parce que vous avez activé le rappel automatique de fin de prêt (5 jours avant le terme du prêt)."
							+ "Liste de vos prêts : " + livre.getTitre() + "Date de fin de prêt : " + pret.getDatefin();
					ms.sendMail("terragef@gmail.com", user.getMail(), subject, body);
				}
			}
		}
	}
}