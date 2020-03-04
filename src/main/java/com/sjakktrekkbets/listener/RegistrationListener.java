package com.sjakktrekkbets.listener;

import java.util.UUID;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.sjakktrekkbets.model.User;
import com.sjakktrekkbets.service.UserService;
import com.sjakktrekkbets.util.EmailSender;



@Component
public class RegistrationListener implements ApplicationListener<OnRegistrationCompleteEvent> {

	Logger logger = LoggerFactory.getLogger(RegistrationListener.class);
	
	@Autowired
	private UserService service;

	@Autowired
	private EmailSender mailSender;

	@Override
	public void onApplicationEvent(OnRegistrationCompleteEvent event) {
		try {
			this.confirmRegistration(event);
		} catch (MessagingException me) {
			me.printStackTrace();
			
		}
	}

	private void confirmRegistration(OnRegistrationCompleteEvent event) throws AddressException, MessagingException {
		User user = event.getUser();
		String token = UUID.randomUUID().toString();

		service.createVerificationToken(user, token);

		String subject = "Registration Confirmation";
		String confirmationUrl = event.getAppUrl() + "/confirmRegistration?token=" + token;
		String message = "Thank you for registering " + user.getName() + ""
				+ " \n\nTo confirm your account, please click on link below.";
		message += "\n\n http://23.254.181.218:8080" + confirmationUrl;

		mailSender.sendEmail(message, subject, user.getEmail());

	}
}
