package com.sjakktrekkbets.dto;

import java.math.BigDecimal;

public class StatsResponse {

	private Integer bets;
	private BigDecimal profit;
	private BigDecimal unitsIn;
	private Integer unitsOut;
	private String hitRate;
	private String roi;
	private Integer won;
	private Integer lost;

	public StatsResponse(BigDecimal profit, BigDecimal unitsIn, Integer unitsOut, String hitRate, Integer bets,
			String roi, Integer won, Integer lost) {
		super();
		this.profit = profit;
		this.unitsIn = unitsIn;
		this.unitsOut = unitsOut;
		this.hitRate = hitRate;
		this.bets = bets;
		this.roi = roi;
		this.won = won;
		this.lost = lost;
	}

	public Integer getBets() {
		return bets;
	}

	public void setBets(Integer bets) {
		this.bets = bets;
	}

	public String getRoi() {
		return roi;
	}

	public void setRoi(String roi) {
		this.roi = roi;
	}

	public BigDecimal getProfit() {
		return profit;
	}

	public void setProfit(BigDecimal profit) {
		this.profit = profit;
	}

	public BigDecimal getUnitsIn() {
		return unitsIn;
	}

	public void setUnitsIn(BigDecimal unitsIn) {
		this.unitsIn = unitsIn;
	}

	public Integer getUnitsOut() {
		return unitsOut;
	}

	public void setUnitsOut(Integer unitsOut) {
		this.unitsOut = unitsOut;
	}

	public String getHitRate() {
		return hitRate;
	}

	public void setHitRate(String hitRate) {
		this.hitRate = hitRate;
	}

	public Integer getWon() {
		return won;
	}

	public void setWon(Integer won) {
		this.won = won;
	}

	public Integer getLost() {
		return lost;
	}

	public void setLost(Integer lost) {
		this.lost = lost;
	}

}
