package com.sjakktrekkbets.exceptions;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = { BadCredentialsException.class })
	protected ResponseEntity<Object> handleBadCredentialsException(RuntimeException ex, WebRequest request) {
		String bodyOfResponse = "Wront username or password";
		return handleExceptionInternal(ex, bodyOfResponse, new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
	}

	@ExceptionHandler(value = { AddressException.class, MessagingException.class })
	protected ResponseEntity<Object> handleEmailException(RuntimeException ex, WebRequest request) {
		String bodyOfResponse = "Problem sending email";
		return handleExceptionInternal(ex, bodyOfResponse, new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
	}

}
