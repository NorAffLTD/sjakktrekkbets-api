package com.sjakktrekkbets.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sjakktrekkbets.model.User;
import com.sjakktrekkbets.service.UserService;

@RestController
public class UserController {

	Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@CrossOrigin(origins = "*")
	@GetMapping("/rest-api/getActiveUsers")
	public ResponseEntity<List<User>> getActiveUsers() {

		return new ResponseEntity(userService.findActiveUsers(), HttpStatus.OK);

	}

}
