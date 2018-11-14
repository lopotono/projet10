package org.projet.library.batch;

import java.util.List;

import org.projet.library.business.contract.ManagerFactory;
import org.projet.library.model.livres.Livre;
import org.projet.library.model.prets.Pret;
import org.projet.library.model.users.User;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;

public class MailLateTasklet implements Tasklet {

	@Autowired
	private MailSender ms;

	@Autowired
	private ManagerFactory mf;

	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {

		List<Pret> list = mf.getPretManager().getPretLate();
		for (Pret pret : list) {
			User user = mf.getUserManager().getUser(pret.getIdUser());
			Livre livre = mf.getLivreManager().getLivre(pret.getIdLivre());
			String body = "Le livre " + livre.getTitre() + "doit être rendu au plus vite !";
			ms.sendMail("terragef@gmail.com", user.getMail(), "Pret en retard", body);
		}
		return RepeatStatus.FINISHED;
	}
}