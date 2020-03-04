package com.sjakktrekkbets.controller;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.sjakktrekkbets.dto.BetImageRequest;
import com.sjakktrekkbets.dto.StatsResponse;
import com.sjakktrekkbets.model.Bet;
import com.sjakktrekkbets.repository.BetsRepository;
import com.sjakktrekkbets.service.BetService;

@RestController
public class BetController {

	Logger logger = LoggerFactory.getLogger(BetController.class);

	@Autowired
	private BetsRepository betsRepository;

	@Autowired
	private BetService betService;

//	@CrossOrigin(origins = "*")
//	@PostMapping("/rest-api/save-bet")
//	public ResponseEntity<?> saveBet(@ModelAttribute BetRequest betRequest) throws IOException, ParseException {
//		logger.info("BetRequest : {}", betRequest);
//
//		MultipartFile file = betRequest.getFile();
//
//		Bet bet = betService.save(betRequest);
//
//		betService.saveImage(file, bet.getBetId().intValue());
//
//		return new ResponseEntity(bet, HttpStatus.OK);
//	}

	@CrossOrigin(origins = "*")
	@PostMapping("/rest-api/save-bet-image")
	public ResponseEntity<?> saveBet(@ModelAttribute BetImageRequest imageRequest) throws IOException {
		logger.info("BetImageRequest : {}", imageRequest);

		MultipartFile file = imageRequest.getFile();

		betService.saveImage(file, imageRequest.getBetId().intValue());

		return new ResponseEntity(HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@GetMapping("/rest-api/settled-bets/")
	public ResponseEntity<List<Bet>> getSettledBets() throws IOException {
		return new ResponseEntity(betsRepository.findSettledBets(), HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("/rest-api/new-bets/")
	public ResponseEntity<List<Bet>> getNewBets() throws IOException {
		return new ResponseEntity(betsRepository.findNewBets(new PageRequest(0,6)), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@GetMapping("/rest-api/stats")
	public ResponseEntity<?> getStats() throws IOException {

		return new ResponseEntity(new StatsResponse(betService.getProfit(), betService.getUnitsIn(),
				betService.getUnitsOut(), betService.getHitRate(), betsRepository.getCountAll(), betService.getROI(),
				betService.getCountWon(), betService.getCountLost()), HttpStatus.OK);
	}

}
