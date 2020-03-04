package com.sjakktrekkbets.events;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.rest.core.annotation.HandleAfterDelete;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

import com.sjakktrekkbets.model.Bet;
import com.sjakktrekkbets.util.Constants;

@RepositoryEventHandler(Bet.class)
public class BetEventHandler {

	Logger logger = LoggerFactory.getLogger(BetEventHandler.class);

	@HandleAfterDelete
	public void handleBetAfterDelete(Bet bet) {

		File file = new File(Constants.IMAGE_UPLOAD_DIRECTORY + bet.getImage());

		if (file.exists()) {
			file.delete();
			logger.info("Image deleted for Bet ID [{}]" ,bet.getBetId());
		} else {
			logger.info("No image deleted as it does not exists for Bet ID  [{}]" , bet.getBetId());
		}

	}

}
