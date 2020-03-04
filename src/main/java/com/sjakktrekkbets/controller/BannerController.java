package com.sjakktrekkbets.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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

import com.sjakktrekkbets.dto.BannerRequest;
import com.sjakktrekkbets.model.Banner;
import com.sjakktrekkbets.repository.BannerRepository;
import com.sjakktrekkbets.util.Constants;

@RestController
@CrossOrigin
public class BannerController {

	Logger logger = LoggerFactory.getLogger(BannerController.class);
	@Autowired
	private BannerRepository bannerRepository;

	@CrossOrigin(origins = "*")
	@PostMapping("/rest-api/save-banner/")
	public ResponseEntity<?> saveArticle(@ModelAttribute BannerRequest bannerRequest) throws IOException {

		logger.info("Request : {}", bannerRequest);
		
		MultipartFile file = bannerRequest.getFile();
		Banner banner = bannerRepository.save(new Banner(file.getOriginalFilename()));
		

		String imageName = "";
		if (!file.isEmpty()) {
			byte[] bytes = file.getBytes();
			String extension = file.getOriginalFilename().substring(file.getOriginalFilename().indexOf("."));
			imageName = "banner-" + banner.getBannerId() + extension;
			Path path = Paths.get(Constants.IMAGE_UPLOAD_DIRECTORY + imageName);
			Files.write(path, bytes);
		}

		banner.setImageName(imageName);
		bannerRepository.save(banner);

		return new ResponseEntity(banner, HttpStatus.OK);
	}

}
