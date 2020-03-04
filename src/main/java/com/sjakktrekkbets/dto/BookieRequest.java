package com.sjakktrekkbets.dto;

import org.springframework.web.multipart.MultipartFile;

public class BookieRequest {

	private MultipartFile file;
	private Integer bookieId;
	private String name;
	private String urlHome;
	private String urlRegistration;

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public Integer getBookieId() {
		return bookieId;
	}

	public void setBookieId(Integer bookieId) {
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

	@Override
	public String toString() {
		return "BookieRequest [BookieId=" + bookieId + ", name=" + name + ", urlHome="
				+ urlHome + ", urlRegistration=" + urlRegistration + "]";
	}

}
