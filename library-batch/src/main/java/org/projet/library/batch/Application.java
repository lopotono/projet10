package org.projet.library.batch;

import java.util.List;

import org.projet.library.business.contract.ManagerFactory;
import org.projet.library.model.livres.Livre;
import org.projet.library.model.prets.Pret;
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
@ImportResource({"classpath:businessContext.xml","classpath:consumerContext.xml"})
public class Application {

	@Autowired
	@Qualifier("projetMailSender")
	private MailSender ms;

	@Autowired
	private ManagerFactory mf;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, "--debug");
	}

	@Scheduled(cron = "0 */1 * * * ?")
	public void schedule() {
		List<Pret> list = mf.getPretManager().getPretLate();
		for (Pret pret : list) {
			User user = mf.getUserManager().getUser(pret.getIdUser());
			Livre livre = mf.getLivreManager().getLivre(pret.getIdLivre());
			String body = "Le livre " + livre.getTitre() + " doit être rendu au plus vite !";
			ms.sendMail("terragef@gmail.com", user.getMail(), "Pret en retard", body);
		}
	}
}