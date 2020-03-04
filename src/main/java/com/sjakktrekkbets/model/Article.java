package com.sjakktrekkbets.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Article {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int articleId;

	public Article() {
		super();
	}

	public Article(String originalFilename, String title, String heading,  String leagueName, String oddsText, String category) {
		super();
		this.imageName = originalFilename;
		this.title = title;
		this.heading = heading;
		this.leagueName = leagueName;
		this.oddsText = oddsText;
		this.category = category;
	}

	public Article(Integer articleId, String originalFilename, String title, String heading, String leagueName, String oddsText,
			String category) {
		super();
		this.articleId = articleId;
		this.imageName = originalFilename;
		this.title = title;
		this.heading = heading;
		this.leagueName = leagueName;
		this.oddsText = oddsText;
		this.category = category;
		
	}

	private String title;
	private String heading;
	private String category;
	private String imageName;
	private String leagueName;
	private String oddsText;

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public int getArticleId() {
		return articleId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	public String getOddsText() {
		return oddsText;
	}

	public void setOddsText(String oddsText) {
		this.oddsText = oddsText;
	}

	public String getHeading() {
		return heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

}
