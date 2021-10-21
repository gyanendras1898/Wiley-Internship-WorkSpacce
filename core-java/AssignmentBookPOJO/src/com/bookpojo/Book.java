package com.bookpojo;

public class Book {
	private int id;
	private String name;
	private String author;
	private double price;
	private int noOfPages;
	
	public Book(int id, String name, String author, double price, int noOfPages) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
		this.noOfPages = noOfPages;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + ", noOfPages="
				+ noOfPages + "]";
	}
	
}
