package com.sjakktrekkbets.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Entity
@Data
public class Bet {

	public Bet() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long betId;

	//@JsonFormat(pattern = "MM-dd-yyyy")
	@Column(columnDefinition = "DATE")
	@Temporal(TemporalType.DATE)
	private Date kickOffDate;

	@JsonFormat(pattern = "HH:mm")
	@Column(columnDefinition = "TIME")
	@Temporal(TemporalType.TIME)
	private Date kickOffTime;

	private String matchDesc;
	private String betDesc;
	private String betType;

	private String description;
	private String status;

	private BigDecimal odds;
	private Integer stake;

	private Boolean isPremium;

	private String image;
	


	public Bet( Date kickOffDate, Date kickOffTime, String matchDesc, String betDesc, String betType,
			String description, String status, BigDecimal odds, Integer stake, Boolean isPremium, Bookie bookie,
			League league, Sport sport) {
		super();
		
		this.kickOffDate = kickOffDate;
		this.kickOffTime = kickOffTime;
		this.matchDesc = matchDesc;
		this.betDesc = betDesc;
		this.betType = betType;
		this.description = description;
		this.status = status;
		this.odds = odds;
		this.stake = stake;
		this.isPremium = isPremium;
		this.bookie = bookie;
		this.league = league;
		this.sport = sport;
		
	}

	public Bet(Long betId, Date kickOffDate, Date kickOffTime, String matchDesc, String betDesc, String betType,
			String description, String status, BigDecimal odds, Integer stake, Boolean isPremium, String image,
			Bookie bookie, League league, Sport sport) {
		super();
		this.betId = betId;
		this.kickOffDate = kickOffDate;
		this.kickOffTime = kickOffTime;
		this.matchDesc = matchDesc;
		this.betDesc = betDesc;
		this.betType = betType;
		this.description = description;
		this.status = status;
		this.odds = odds;
		this.stake = stake;
		this.isPremium = isPremium;
		this.image = image;
		this.bookie = bookie;
		this.league = league;
		this.sport = sport;
	}

	

	

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
	@JoinColumn(name = "bookie")
	private Bookie bookie;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
	@JoinColumn(name = "league")
	private League league;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
	@JoinColumn(name = "sport")
	private Sport sport;

	public Integer getStake() {
		return stake;
	}

	public void setStake(Integer stake) {
		this.stake = stake;
	}

	public Boolean getIsPremium() {
		return isPremium;
	}

	public void setIsPremium(Boolean isPremium) {
		this.isPremium = isPremium;
	}

	public Long getBetId() {
		return betId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setBetId(Long betId) {
		this.betId = betId;
	}

	public String getMatchDesc() {
		return matchDesc;
	}

	public void setMatchDesc(String matchDesc) {
		this.matchDesc = matchDesc;
	}

	public String getBetDesc() {
		return betDesc;
	}

	public void setBetDesc(String betDesc) {
		this.betDesc = betDesc;
	}

	public BigDecimal getOdds() {
		return odds;
	}

	public void setOdds(BigDecimal odds) {
		this.odds = odds;
	}

	public Date getKickOffDate() {
		return kickOffDate;
	}

	public void setKickOffDate(Date kickOffDate) {
		this.kickOffDate = kickOffDate;
	}

	public Date getKickOffTime() {
		return kickOffTime;
	}

	public void setKickOffTime(Date kickOffTime) {
		this.kickOffTime = kickOffTime;
	}

	public String getBetType() {
		return betType;
	}

	public void setBetType(String betType) {
		this.betType = betType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Bookie getBookie() {
		return bookie;
	}

	public void setBookie(Bookie bookie) {
		this.bookie = bookie;
	}

	public League getLeague() {
		return league;
	}

	public void setLeague(League league) {
		this.league = league;
	}

	public Sport getSport() {
		return sport;
	}

	public void setSport(Sport sport) {
		this.sport = sport;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
