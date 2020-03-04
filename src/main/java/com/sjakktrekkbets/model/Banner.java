package com.sjakktrekkbets.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Banner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bannerId;

	private String imageName;

	public Banner() {
		super();
	}

	public Banner(String originalFilename) {
		super();
		this.imageName = originalFilename;
	}

	public int getBannerId() {
		return bannerId;
	}

	public void setBannerId(int bannerId) {
		this.bannerId = bannerId;
	}



	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

}
