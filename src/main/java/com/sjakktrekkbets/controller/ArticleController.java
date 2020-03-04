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

import com.sjakktrekkbets.dto.ArticleRequest;
import com.sjakktrekkbets.model.Article;
import com.sjakktrekkbets.model.Bookie;
import com.sjakktrekkbets.repository.ArticleRepository;
import com.sjakktrekkbets.util.Constants;

@RestController
@CrossOrigin
public class ArticleController {

	Logger logger = LoggerFactory.getLogger(ArticleController.class);
	@Autowired
	private ArticleRepository articleRepository;

	@CrossOrigin(origins = "*")
	@PostMapping("/rest-api/save-article/")
	public ResponseEntity<?> saveArticle(@ModelAttribute ArticleRequest articleRequest) throws IOException {

		MultipartFile file = articleRequest.getFile();
		Article article = articleRepository
				.save(new Article(file.getOriginalFilename(), articleRequest.getTitle(),articleRequest.getHeading(),articleRequest.getLeagueName(),articleRequest.getOddsText(), articleRequest.getCategory()));
		logger.info("Request : {}", articleRequest);

		String imageName = "";
		if (!file.isEmpty()) {
			byte[] bytes = file.getBytes();
			String extension = file.getOriginalFilename().substring(file.getOriginalFilename().indexOf("."));
			imageName = "article-" + article.getArticleId() + extension;
			Path path = Paths.get(Constants.IMAGE_UPLOAD_DIRECTORY + imageName);
			Files.write(path, bytes);
		}

		article.setImageName(imageName);
		articleRepository.save(article);

		return new ResponseEntity(article, HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@PostMapping("/rest-api/update-article")
	public ResponseEntity<?> updateArticle(@ModelAttribute ArticleRequest articleRequest) throws IOException {
		
		logger.info("Request : {}", articleRequest);
		MultipartFile file = articleRequest.getFile();
		Article article = null;
		
		if(file != null) {
			 article = articleRepository.save(new Article(articleRequest.getArticleId(), file.getOriginalFilename(),
					articleRequest.getTitle(),articleRequest.getHeading(),articleRequest.getLeagueName(),articleRequest.getOddsText(), articleRequest.getCategory()));
			

			String imageName = "";
			if (!file.isEmpty()) {
				byte[] bytes = file.getBytes();
				String extension = file.getOriginalFilename().substring(file.getOriginalFilename().indexOf("."));
				imageName = "article-" + article.getArticleId() + extension;
				Path path = Paths.get(Constants.IMAGE_UPLOAD_DIRECTORY + imageName);
				Files.write(path, bytes);
			}

			article.setImageName(imageName);
			articleRepository.save(article);
		}else {
			Optional<Article> articleObj =  articleRepository.findById(articleRequest.getArticleId());
			article = articleRepository.save(new Article(articleRequest.getArticleId(), articleObj.get().getImageName(),
					articleRequest.getTitle(),articleRequest.getHeading(),articleRequest.getLeagueName(),articleRequest.getOddsText(), articleRequest.getCategory()));
		}
		
	

		return new ResponseEntity(article, HttpStatus.OK);
	}

}
