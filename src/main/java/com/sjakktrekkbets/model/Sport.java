package com.sjakktrekkbets.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Sport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sportId;

	public Sport() {
		super();
	}

	private String name;

	public int getSportId() {
		return sportId;
	}

	public void setSportId(int sportId) {
		this.sportId = sportId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
  

}
