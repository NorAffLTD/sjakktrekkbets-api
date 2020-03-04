package com.sjakktrekkbets.model;

import java.util.List;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "inlineData", types = Bookie.class)
public interface BookieProjection {

	public int getBookieId();

	public String getName();

	public String getWebLink();

	public String getPoster();

	public List<Bet> getBets();

}
