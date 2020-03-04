package com.sjakktrekkbets.dto;

import org.springframework.web.multipart.MultipartFile;

public class BannerRequest {

	private MultipartFile file;
	private Integer bannerId;
	private Integer order;

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public Integer getBannerId() {
		return bannerId;
	}

	public void setBannerId(Integer bannerId) {
		this.bannerId = bannerId;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "BannerRequest [file=" + file.getName() + ", bannerId=" + bannerId + ", order=" + order + "]";
	}

}
