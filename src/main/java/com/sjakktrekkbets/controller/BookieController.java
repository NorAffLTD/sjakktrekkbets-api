package com.sjakktrekkbets.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.sjakktrekkbets.dto.BookieRequest;
import com.sjakktrekkbets.model.Bookie;
import com.sjakktrekkbets.repository.BookieRepository;
import com.sjakktrekkbets.util.Constants;

@RestController
@CrossOrigin
public class BookieController {

	Logger logger = LoggerFactory.getLogger(BookieController.class);
	@Autowired
	private BookieRepository bookieRepository;

	@CrossOrigin(origins = "*")
	@PostMapping("/rest-api/save-bookie")
	public ResponseEntity<?> saveBookie(@ModelAttribute BookieRequest bookieRequest) throws IOException {

		MultipartFile file = bookieRequest.getFile();
		Bookie bookie = bookieRepository.save(new Bookie(file.getOriginalFilename(), bookieRequest.getName(),
				bookieRequest.getUrlHome(), bookieRequest.getUrlRegistration()));
		logger.info("BookieRequest : {}", bookieRequest);

		String imageName = "";
		if (!file.isEmpty()) {
			byte[] bytes = file.getBytes();
			String extension = file.getOriginalFilename().substring(file.getOriginalFilename().indexOf("."));
			imageName = "bookie-" + bookie.getBookieId() + extension;
			Path path = Paths.get(Constants.IMAGE_UPLOAD_DIRECTORY + imageName);
			Files.write(path, bytes);
		}

		bookie.setPoster(imageName);
		bookieRepository.save(bookie);

		return new ResponseEntity(bookie, HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@PostMapping("/rest-api/update-bookie")
	public ResponseEntity<?> updateArticle(@ModelAttribute BookieRequest bookieRequest) throws IOException {
		logger.info("BookieRequest : {}", bookieRequest);

		MultipartFile file = bookieRequest.getFile();
		Bookie bookie = null;
		if (file != null) {
			bookie = bookieRepository.save(new Bookie(bookieRequest.getBookieId(), file.getOriginalFilename(),
					bookieRequest.getName(), bookieRequest.getUrlHome(), bookieRequest.getUrlRegistration()));

			String imageName = "";
			if (!file.isEmpty()) {
				byte[] bytes = file.getBytes();
				String extension = file.getOriginalFilename().substring(file.getOriginalFilename().indexOf("."));
				imageName = "bookie-" + bookie.getBookieId() + extension;
				Path path = Paths.get(Constants.IMAGE_UPLOAD_DIRECTORY + imageName);
				Files.write(path, bytes);
			}

			bookie.setPoster(imageName);
			bookieRepository.save(bookie);

		} else {
			Optional<Bookie> bookieObj = bookieRepository.findById(bookieRequest.getBookieId());
			bookie = bookieRepository.save(new Bookie(bookieRequest.getBookieId(), bookieObj.get().getPoster(),
					bookieRequest.getName(), bookieRequest.getUrlHome(), bookieRequest.getUrlRegistration()));
		}

		return new ResponseEntity(bookie, HttpStatus.OK);
	}

}
