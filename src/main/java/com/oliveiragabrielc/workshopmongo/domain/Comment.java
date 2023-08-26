package com.oliveiragabrielc.workshopmongo.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Comment implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String id;
	private String text;
	private LocalDate date;
	
	public Comment() {}

	public Comment(String id, String text, LocalDate date) {
		super();
		this.id = id;
		this.text = text;
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comment other = (Comment) obj;
		return Objects.equals(id, other.id);
	}
}
