package com.sjakktrekkbets.dto;

import org.springframework.web.multipart.MultipartFile;

public class ArticleRequest {

	private MultipartFile file;
	private Integer articleId;
	private String title;
	private String heading;
	private String leagueName;
	private String oddsText;

	private String category;

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
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

	public Integer getArticleId() {
		return articleId;
	}

	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}

	public String getHeading() {
		return heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

	@Override
	public String toString() {
		return "ArticleRequest [file=" + file.getOriginalFilename() + ", articleId=" + articleId + ", title=" + title
				+ ", heading=" + heading + ", leagueName=" + leagueName + ", oddsText=" + oddsText + ", category="
				+ category + "]";
	}

}
