package com.sjakktrekkbets.model;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class VerificationToken {
	private static final int EXPIRATION_IN_MINUTES = 60 * 24;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long verificationTokenId;

	private String token;

	@OneToOne(targetEntity = User.class, fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
	@JoinColumn(nullable = false, name = "user_id")
	private User user;

	private Date expiryDate;
	
	public VerificationToken() {
		super();
	}

	public VerificationToken(String token, User user) {
		super();
		this.user = user;
		this.token = token;
		this.setExpiryDate();
	}

	private Date calculateExpiryDate(int expiryTimeInMinutes) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Timestamp(cal.getTime().getTime()));
		cal.add(Calendar.MINUTE, expiryTimeInMinutes);
		return new Date(cal.getTime().getTime());
	}

	public Long getVerificationTokenId() {
		return verificationTokenId;
	}

	public void setVerificationTokenId(Long verficationTokenId) {
		this.verificationTokenId = verficationTokenId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate() {
		this.expiryDate = calculateExpiryDate(EXPIRATION_IN_MINUTES);
	}

}
