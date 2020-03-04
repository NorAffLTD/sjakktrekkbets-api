package com.sjakktrekkbets.dto;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public class BetImageRequest {

	

	private MultipartFile file;

	private Integer betId;

	
	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public Integer getBetId() {
		return betId;
	}

	public void setBetId(Integer betId) {
		this.betId = betId;
	}

	@Override
	public String toString() {
		return "BetImageRequest [file=" + file + ", betId=" + betId + "]";
	}

}
