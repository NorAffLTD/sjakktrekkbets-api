package com.sjakktrekkbets.events;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.rest.core.annotation.HandleAfterDelete;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

import com.sjakktrekkbets.model.Article;
import com.sjakktrekkbets.util.Constants;

@RepositoryEventHandler(Article.class)
public class ArticleEventHandler {

	Logger logger = LoggerFactory.getLogger(ArticleEventHandler.class);

	@HandleAfterDelete
	public void handleBetAfterDelete(Article article) {

		File file = new File(Constants.IMAGE_UPLOAD_DIRECTORY + article.getImageName());

		if (file.exists()) {
			file.delete();
			logger.info("Image deleted for Article ID [{}]", article.getArticleId());
		} else {
			logger.info("No image deleted as it does not exists for Article ID  [{}]", article.getArticleId());
		}

	}

}
