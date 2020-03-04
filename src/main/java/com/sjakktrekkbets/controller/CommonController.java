package com.sjakktrekkbets.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sjakktrekkbets.util.Constants;

@RestController
@CrossOrigin
public class CommonController {

	Logger logger = LoggerFactory.getLogger(CommonController.class);

	@CrossOrigin(origins = "*")
	@GetMapping("/rest-api/images-src-path/")
	public ResponseEntity<?> getImagesPath() throws IOException {

		return new ResponseEntity(Constants.IMAGE_LOAD_PATH, HttpStatus.OK);
	}

}
