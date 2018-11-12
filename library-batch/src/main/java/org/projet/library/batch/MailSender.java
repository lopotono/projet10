package org.projet.library.batch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class MailSender {
	
	@Autowired
	private JavaMailSender javaMailSender;
		
	public void sendMail(String from, String to, String subject, String body) {
		
		SimpleMailMessage mail = new SimpleMailMessage();
		
		mail.setFrom(from);
		mail.setTo(to);
		mail.setSubject(subject);
		mail.setText(body);
			
		System.out.println("Sending");
		
		javaMailSender.send(mail);
		
		System.out.println("Done !");
	}
}