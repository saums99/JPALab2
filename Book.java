package com.abc.labEx;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="book1_tbl")
public class Book {
	@Id
	@Column(name="bookISBN")
	private int ISBN;
	@Column(name="book_title")
	private String title;
	@Column(name="book_price")
	private double price;
	@ManyToMany(mappedBy="book")
	private Set<Author> author=new HashSet<>();
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int ISBN) {
		this.ISBN = ISBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Set<Author> getAuthor() {
		return author;
	}
	public void setAuthor(Set<Author> author) {
		this.author = author;
	}
	
	
}
