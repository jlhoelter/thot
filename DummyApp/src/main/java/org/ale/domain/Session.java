package org.ale.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="session")
public class Session {

	@Id
	private long id;
	
	private String date;
	private String start;
	private String end;
	private String title;
	private String author;
	private String author2;
	private String description;
	private String location;
	private String type;
	private String authorInfo;
	private String author2Info;
	private String authorImgUrl;
	private String author2ImgUrl;
	

	public Session(String date, String start, String end, String title,
			String author, String author2, String description, String location,
			String type, String authorInfo, String author2Info,
			String authorImgUrl, String author2ImgUrl) {
		this.date = date;
		this.start = start;
		this.end = end;
		this.title = title;
		this.author = author;
		this.author2 = author2;
		this.description = description;
		this.location = location;
		this.type = type;
		this.authorInfo = authorInfo;
		this.author2Info = author2Info;
		this.authorImgUrl = authorImgUrl;
		this.author2ImgUrl = author2ImgUrl;
	}
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getDescription() {
		return description;
	}
	
	public String getDate() {
		return date;
	}

	public String getStart() {
		return start;
	}

	public String getEnd() {
		return end;
	}

	public String getAuthor2() {
		return author2;
	}

	public String getLocation() {
		return location;
	}

	public String getType() {
		return type;
	}

	public String getAuthorInfo() {
		return authorInfo;
	}

	public String getAuthor2Info() {
		return author2Info;
	}

	public String getAuthorImgUrl() {
		return authorImgUrl;
	}

	public String getAuthor2ImgUrl() {
		return author2ImgUrl;
	}
	
	


	@Override
	public String toString() {
		return "Session [title=" + title + ", author=" + author
				+ ", description=" + description + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Session other = (Session) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
}
