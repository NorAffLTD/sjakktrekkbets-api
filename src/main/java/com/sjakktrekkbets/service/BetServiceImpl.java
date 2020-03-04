package com.sjakktrekkbets.service;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.sjakktrekkbets.repository.BetsRepository;
import com.sjakktrekkbets.repository.BookieRepository;
import com.sjakktrekkbets.repository.LeagueRepository;
import com.sjakktrekkbets.repository.SportRepository;
import com.sjakktrekkbets.util.Constants;

@Service
public class BetServiceImpl implements BetService {

	@Autowired
	private BetsRepository betsRepository;

	@Autowired
	private BookieRepository bookieRepository;

	@Autowired
	private SportRepository sportRepository;

	@Autowired
	private LeagueRepository leagueRepository;

	@Override
	public String getHitRate() {

		float result = ((float) betsRepository.getCountWon() / betsRepository.getCountLostAndWon());

		result = result * 100;
		BigDecimal bd = new BigDecimal(Float.toString(result));
		bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
		return bd + " %";
	}

	@Override
	public BigDecimal getProfit() {
		BigDecimal val;

		if (betsRepository.getTotalEarning() != null) {
			if (betsRepository.getTotalLoss() != null) {
				val =  betsRepository.getTotalEarning().subtract(betsRepository.getTotalLoss());
			} else {
				val = betsRepository.getTotalEarning();
			}
		} else {
			val = betsRepository.getTotalLoss().negate();
		}
		val = val.setScale(2, BigDecimal.ROUND_HALF_EVEN);
		return val;

	}

	@Override
	public String getROI() {
		
		double value = this.getUnitsIn().doubleValue() / this.getUnitsOut().doubleValue() * 100;
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		decimalFormat.setRoundingMode(RoundingMode.UP);
		
		return  decimalFormat.format(value) +" %";
		 

	}

	@Override
	public Integer getUnitsOut() {
		return (betsRepository.getUnitsOut() != null) ? betsRepository.getUnitsOut() : 0;
	}

	@Override
	public BigDecimal getUnitsIn() {
		BigDecimal val = (betsRepository.getUnitsIn() != null) ? betsRepository.getUnitsIn() : new BigDecimal(0);
		val = val.setScale(2, BigDecimal.ROUND_HALF_EVEN);
		return val;
	}

	@Transactional
	@Override
	public void saveImage(MultipartFile file, Integer betId) throws IOException {
		String imageName = "";
		if (!file.isEmpty()) {
			byte[] bytes = file.getBytes();
			String extension = file.getOriginalFilename().substring(file.getOriginalFilename().indexOf("."));
			imageName = "bet-" + betId + extension;
			Path path = Paths.get(Constants.IMAGE_UPLOAD_DIRECTORY + imageName);
			Files.write(path, bytes);
		}

		betsRepository.updateImage(Long.valueOf(betId), imageName);
	}

	@Override
	public Integer getCountWon() {
		return betsRepository.getCountWon();
	}

	@Override
	public Integer getCountLost() {
		return betsRepository.getCountLost();
	}

//	@Override
//	public Bet save(BetImageRequest betRequest) {
//		
//		Bet bet = new Bet(betRequest.getKickOffDate(), betRequest.getKickOffTime(),
//				betRequest.getMatchDesc(), betRequest.getBetDesc(), betRequest.getBetType(),
//				betRequest.getDescription(), betRequest.getStatus(), betRequest.getOdds(), betRequest.getStake(),
//				betRequest.getIsPremium(), bookieRepository.findById(betRequest.getBookieId()).get(),
//				leagueRepository.findById(betRequest.getLeagueId()).get(),
//				sportRepository.findById(betRequest.getSportId()).get());
//		
//		bet = betsRepository.save(bet);
//
//		return bet;
//	}

}
