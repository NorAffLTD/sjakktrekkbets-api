package com.sjakktrekkbets.util;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.sjakktrekkbets.controller.RegisterationController;

@Component
public class EmailSender {

	Logger logger = LoggerFactory.getLogger(EmailSender.class);

	private Session session;

	public EmailSender() {

//		final String username = "syed.ajmal.hasan@gmail.com";
//		final String password = "iowlzvoiizwkmugr";
//		Properties prop = new Properties();
//		prop.put("mail.smtp.host", "smtp.gmail.com");
//		prop.put("mail.smtp.port", "587");
//		prop.put("mail.smtp.auth", "true");
//		prop.put("mail.smtp.starttls.enable", "true"); // TLS

		final String username = "support@sjakktrekkbets.com";
		final String password = "hu5JYzFXYEBKmdsh";
		Properties prop = new Properties();
		prop.put("mail.smtp.host", "mail.sjakktrekkbets.com");
		//prop.put("mail.smtp.port", "465");
		prop.put("mail.smtp.port", "25");
		prop.put("mail.smtp.auth", "true");
		//prop.put("mail.smtp.starttls.enable", "true"); // TLS

		session = Session.getInstance(prop, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});
		logger.info("Properteis are set ...");
	}

	public void sendEmail(String message, String subject, String toEmail) throws AddressException, MessagingException {
		logger.info("Sending Email to {}", toEmail);

		Message miMessage = new MimeMessage(session);
		miMessage.setFrom(new InternetAddress("support@sjakktrekkbets.com"));
		miMessage.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
		miMessage.setSubject(subject);
		miMessage.setText(message);

		Transport.send(miMessage);

		logger.info("Email sent to : {}", toEmail);

	}
	
	public static void main(String[] args) throws AddressException, MessagingException {
		EmailSender emailSender = new  EmailSender();
		emailSender.sendEmail("Test message", "Test subject", "syed.ajmal.hasan@gmail.com");
	}

}
