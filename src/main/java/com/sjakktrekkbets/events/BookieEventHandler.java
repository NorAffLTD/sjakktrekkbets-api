package com.sjakktrekkbets.events;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.rest.core.annotation.HandleAfterDelete;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

import com.sjakktrekkbets.model.Bookie;
import com.sjakktrekkbets.util.Constants;

@RepositoryEventHandler(Bookie.class)
public class BookieEventHandler {

	Logger logger = LoggerFactory.getLogger(BookieEventHandler.class);

	@HandleAfterDelete
	public void handleBookieAfterDelete(Bookie bookie) {

		File file = new File(Constants.IMAGE_UPLOAD_DIRECTORY + bookie.getPoster());

		if (file.exists()) {
			file.delete();
			logger.info("Image deleted for Bookie ID [{}]", bookie.getPoster());
		} else {
			logger.info("No image deleted as it does not exists for Bookie ID  [{}]", bookie.getPoster());
		}

	}

}
