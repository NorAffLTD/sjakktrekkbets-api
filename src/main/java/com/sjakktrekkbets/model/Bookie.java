package com.sjakktrekkbets.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Bookie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookieId;

	public Bookie() {
		super();
	}

	public Bookie(String originalFilename, String name, String urlHome, String urlRegistration) {
		super();
		this.poster = originalFilename;
		this.name = name;
		this.urlHome = urlHome;
		this.urlRegistration = urlRegistration;
	}

	public Bookie(Integer bookieId, String name, String urlHome, String urlRegistration) {
		super();

		this.bookieId = bookieId;
		this.name = name;
		this.urlHome = urlHome;
		this.urlRegistration = urlRegistration;
	}

	public Bookie(Integer bookieId, String originalFilename, String name, String urlHome, String urlRegistration) {
		super();
		this.bookieId = bookieId;
		this.poster = originalFilename;
		this.name = name;
		this.urlHome = urlHome;
		this.urlRegistration = urlRegistration;
	}

	private String name;

	private String urlHome;

	private String urlRegistration;

	private String poster;

	public int getBookieId() {
		return bookieId;
	}

	public void setBookieId(int bookieId) {
		this.bookieId = bookieId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrlHome() {
		return urlHome;
	}

	public void setUrlHome(String urlHome) {
		this.urlHome = urlHome;
	}

	public String getUrlRegistration() {
		return urlRegistration;
	}

	public void setUrlRegistration(String urlRegistration) {
		this.urlRegistration = urlRegistration;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

}
