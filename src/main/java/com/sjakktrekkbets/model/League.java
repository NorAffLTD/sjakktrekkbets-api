package com.sjakktrekkbets.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class League {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int leagueId;

	public League() {
		super();
	}

	private String name;

	
	public int getLeagueId() {
		return leagueId;
	}

	public void setLeagueId(int leagueId) {
		this.leagueId = leagueId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
  

}
