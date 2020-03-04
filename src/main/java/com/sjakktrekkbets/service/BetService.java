package com.sjakktrekkbets.service;

import java.io.IOException;
import java.math.BigDecimal;

import org.springframework.web.multipart.MultipartFile;

public interface BetService {

	public String getHitRate();

	public BigDecimal getProfit();

	public String getROI();

	public Integer getUnitsOut();

	public Integer getCountWon();

	public Integer getCountLost();

	public BigDecimal getUnitsIn();

	public void saveImage(MultipartFile file, Integer betId) throws IOException;

}
