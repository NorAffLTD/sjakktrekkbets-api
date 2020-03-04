package com.sjakktrekkbets.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sjakktrekkbets.dto.AuthRequest;
import com.sjakktrekkbets.dto.JwtResponse;
import com.sjakktrekkbets.repository.ArticleRepository;
import com.sjakktrekkbets.security.JwtTokenProvider;

@RestController
public class AuthController {

	Logger logger = LoggerFactory.getLogger(AuthController.class);
	@Autowired
	private ArticleRepository articleRepository;

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	JwtTokenProvider tokenProvider;

	@CrossOrigin(origins = "*")
	@PostMapping("/rest-api/authenticate")
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody AuthRequest authRequest) {
		
		logger.info("Authenticate : {}",authRequest);

		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));

		SecurityContextHolder.getContext().setAuthentication(authentication);

		String jwt = tokenProvider.generateToken(authentication);
		return ResponseEntity.ok(new JwtResponse(jwt));
	}

}
