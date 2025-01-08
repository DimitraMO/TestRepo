package com.example.demo.Entities;

import java.util.ArrayList;

public class Book {
	private String id;
	private String title;
	private Author author;
	private String publisher;
	private int publisherYear;
	private String description;
	private ArrayList<Theme> themes = new ArrayList<>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPublisherYear() {
		return publisherYear;
	}

	public void setPublisherYear(int publisherYear) {
		this.publisherYear = publisherYear;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ArrayList<Theme> getThemes() {
		return themes;
	}

	public void setThemes(ArrayList<Theme> themes) {
		this.themes = themes;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", publisher=" + publisher
				+ ", publisherYear=" + publisherYear + ", description=" + description + ", themes=" + themes + "]";
	}

}
