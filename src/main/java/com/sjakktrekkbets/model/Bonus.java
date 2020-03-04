package com.sjakktrekkbets.model;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.Data;

@Entity
@Data
public class Bonus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bonusId;

	public Bonus() {
		super();
	}


	private String title;
	private String affiliateUrlHome;
	private String affiliateUrlReg;
	private String wagering;
	private BigDecimal odds;
	private String bonusText;
	private Integer rank;

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}


	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
	@JoinColumn(name = "bookie")
	private Bookie bookie;

	public Long getBonusId() {
		return bonusId;
	}

	public void setBonusId(Long bonusId) {
		this.bonusId = bonusId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAffiliateUrlHome() {
		return affiliateUrlHome;
	}

	public void setAffiliateUrlHome(String affiliateUrlHome) {
		this.affiliateUrlHome = affiliateUrlHome;
	}

	public String getAffiliateUrlReg() {
		return affiliateUrlReg;
	}

	public void setAffiliateUrlReg(String affiliateUrlReg) {
		this.affiliateUrlReg = affiliateUrlReg;
	}

	public String getWagering() {
		return wagering;
	}

	public void setWagering(String wagering) {
		this.wagering = wagering;
	}

	public BigDecimal getOdds() {
		return odds;
	}

	public void setOdds(BigDecimal odds) {
		this.odds = odds;
	}

	public Bookie getBookie() {
		return bookie;
	}

	public void setBookie(Bookie bookie) {
		this.bookie = bookie;
	}

	public String getBonusText() {
		return bonusText;
	}

	public void setBonusText(String bonusText) {
		this.bonusText = bonusText;
	}

}
