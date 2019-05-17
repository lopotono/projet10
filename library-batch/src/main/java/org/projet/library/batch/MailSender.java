package org.projet.library.batch;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;

@Component("projetMailSender")
public class MailSender {

	/*@Autowired(required = true)
	private JavaMailSender javaMailSender;*/

	public void sendMail(String from, String to, String subject, String body) {

		SimpleMailMessage mail = new SimpleMailMessage();

		mail.setFrom(from);
		mail.setTo(to);
		mail.setSubject(subject);
		mail.setText(body);

		System.out.println("Sending");

		getJavaMailSender().send(mail);

		System.out.println("Done !");

	}

	@Bean
	public JavaMailSender getJavaMailSender() {
		JavaMailSenderImpl jms = new JavaMailSenderImpl();
		jms.setHost("smtp.gmail.com");
		jms.setPort(587);
		jms.setUsername("terragef@gmail.com");
		jms.setPassword("Innelec_27");
		
		Properties p = jms.getJavaMailProperties();
		p.put("mail.smtp.auth", "true");
		p.put("mail.smtp.starttls.enable", "true");
		p.put("mail.transport.protocol", "smtp");
		return jms;
	}

	/*public void setJavaMailSender(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}*/
}
