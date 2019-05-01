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
	private int id;
	private int position;

	@Autowired
	private ManagerFactory mf;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

	public void doMail() {

		Livre livre = new Livre();
		String subject = "Votre livre est disponible.";
		String body = "Le livre " + livre.getTitre()
				+ " est disponible à la bibliothèque. Vous disposez de 48 h pour venir le chercher, au-delà de cette période la réservation sera annulée.";

		// Récupérer les livres disponibles
		List<Livre> listlivresdispo = mf.getLivreManager().getLivresDisponibles();
		for (Livre listlivre : listlivresdispo) {
			if (listlivre.isDisponible() == true) {
				// Récupérer la liste des réservations par livre
				List<Reservation> listreservation = mf.getReservationManager().getReservationsByIdLivre(id);
				// Si liste des réservations vide ne rien faire
				for (Reservation resa : listreservation) {
					if (listreservation.isEmpty()) {
						return;
					}
					// Si liste des réservations non vide
					else if (listreservation.size() > 0) {
						Reservation reservation = new Reservation();
						// Utilisateur avec la position 1
						if (reservation.getPosition() == 1) {
							Calendar dateJour = Calendar.getInstance();
							// Si le mail n'est pas envoyé
							if (reservation.getDatemail() == null) {
								// Récupérer la date du jour (date du mail)
								resa.setDatemail(dateJour);
								User user = mf.getUserManager().getUser(reservation.getIdUser());
								ms.sendMail("terragef@gmail.com", user.getMail(), subject, body);
								resa.setPosition(resa.getPosition() - 1);
								// Insertion des nouvelles données dans la table reservation
								mf.getReservationManager().insertReservation(reservation);
								// Le mail est déjà envoyé
							} else if (reservation.getDatemail() != null) {
								// Si les 48 heures ne sont pas encore passées
								Calendar datelimite = Calendar.getInstance();
								datelimite.add(Calendar.DATE, 2);
								if (!datelimite.equals(dateJour)) {
									return;
								} else if (datelimite.equals(dateJour)) {
									// Si 48 heures sont passées : supprimer la réservation
									mf.getReservationManager().deleteReservation(reservation);
									// Passer à la position suivante dans la liste des réservations
									resa.setPosition(resa.getPosition() + 1);
									mf.getReservationManager().getReservationByIdLivreAndPosition(id, position);
									User user = mf.getUserManager().getUser(reservation.getIdUser());
									ms.sendMail("terragef@gmail.com", user.getMail(), subject, body);
								}
							}
						}
					}
				}
			}
		}
	}
}