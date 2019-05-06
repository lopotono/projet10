package org.projet.library.batch;

import java.util.Calendar;
import java.util.List;

import org.projet.library.business.contract.ManagerFactory;
import org.projet.library.model.livre.Livre;
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

@SpringBootApplication
@EnableScheduling
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
@ImportResource({ "classpath:businessContext.xml", "classpath:consumerContext.xml" })
public class ReservationMail {

	@Autowired
	@Qualifier("projetMailSender")
	private MailSender ms;

	@Autowired
	private ManagerFactory mf;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

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
							Reservation reservationsuivante = mf.getReservationManager().getReservationByIdLivreAndPosition(livredispo.getLivreid(), 1);
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
		reservation.setDatemail(dateJour);
		User user = mf.getUserManager().getUser(reservation.getIdUser());
		ms.sendMail("terragef@gmail.com", user.getMail(), subject, body);
		mf.getReservationManager().updateReservation(reservation);
	}
}