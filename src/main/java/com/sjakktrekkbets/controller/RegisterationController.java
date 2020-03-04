package com.sjakktrekkbets.controller;

import java.util.Calendar;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sjakktrekkbets.dto.RegisterRequest;
import com.sjakktrekkbets.listener.OnRegistrationCompleteEvent;
import com.sjakktrekkbets.model.User;
import com.sjakktrekkbets.model.VerificationToken;
import com.sjakktrekkbets.repository.VerificationTokenRepository;
import com.sjakktrekkbets.security.JwtTokenProvider;
import com.sjakktrekkbets.service.UserService;

@RestController
public class RegisterationController {

	Logger logger = LoggerFactory.getLogger(RegisterationController.class);
	@Autowired
	private UserService userService;

	@Autowired
	JwtTokenProvider tokenProvider;

	@Autowired
	ApplicationEventPublisher eventPublisher;

	@Autowired
	VerificationTokenRepository verificationTokenRepository;

	@Autowired
	private HttpServletRequest request;

	@CrossOrigin(origins = "*")
	@PostMapping("/rest-api/register")
	public ResponseEntity<?> registerUser(@RequestBody RegisterRequest registerRequest) {

		logger.info("Register request : {}", registerRequest);

		User rUser = userService.findByEmail(registerRequest.getEmail());

		if (rUser != null) {
			logger.info("User already registered");
			return ResponseEntity.ok("User already registered, please provide different email");
		}

		User nUser = userService.registerNewUserAccount(registerRequest);

		String appUrl = "/rest-api";// request.getContextPath();
		eventPublisher.publishEvent(new OnRegistrationCompleteEvent(nUser, request.getLocale(), appUrl));

		return ResponseEntity.ok("Thank you for registering! Please check your email for confirmation.");
	}

	@CrossOrigin(origins = "*")
	@GetMapping("/rest-api/confirmRegistration")
	public ResponseEntity<?> confirmRegistration(@RequestParam("token") String token) {

		logger.info("Register confirmation request : {}", token);
		Locale locale = request.getLocale();
		VerificationToken verificationToken = verificationTokenRepository.findByToken(token);

		if (verificationToken == null) {
			return ResponseEntity.ok("Invalid token");
		}

		Calendar calendar = Calendar.getInstance();

		if ((verificationToken.getExpiryDate().getTime() - calendar.getTime().getTime()) <= 0) {
			return ResponseEntity.ok("Verification token has expired");
		}

		User user = verificationToken.getUser();

		user.setStatus(User.ACTIVE_STATUS);
		verificationToken.setUser(null);
		verificationTokenRepository.delete(verificationToken);

		userService.updateUser(user);
		logger.info("User verified, email :{}, name: {}", user.getEmail(), user.getName());
		return ResponseEntity
				.ok("Congratulations! Your account has been verified, pelase login in with your credentials.");
	}

}
