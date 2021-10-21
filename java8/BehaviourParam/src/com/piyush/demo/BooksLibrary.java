package com.piyush.demo;

import java.util.ArrayList;


import com.piyush.bean.Book;

public class BooksLibrary {

	private static ArrayList<Book> books=new ArrayList<Book>();
	static {
		books.add(new Book(101, "Book 1", "Mr. X", 890, 600));
		books.add(new Book(102, "Book 2", "Mr. Y", 750, 800));
		books.add(new Book(103, "Book 3", "Mr. X", 1800, 1600));
		books.add(new Book(104, "Book 4", "Mr. Z", 1200, 850));
		books.add(new Book(105, "Book 5", "Mr. M", 980, 700));
		books.add(new Book(106, "Book 6", "Mr. X", 1900, 1500));
	}
	public static ArrayList<Book> getBooks() {
		return books;
	}
	
	public ArrayList<Book> getBooksWrittenByAuthorX(){
		ArrayList<Book> bookList=new ArrayList<>();
		for(Book book:books) {
			if(book.getAuthorName().equals("Mr. X")) {
				bookList.add(book);
			}
		}
		return bookList;
	}
	
	public ArrayList<Book> getThickBooks(){
		ArrayList<Book> bookList=new ArrayList<>();
		for(Book book:books) {
			if(book.getNoOfPages()>1000) {
				bookList.add(book);
			}
		}
		return bookList;
	}
	
	public ArrayList<Book> searchBook(BookPredicate bookPredicate){
		ArrayList<Book> bookList=new ArrayList<>();
		for(Book book:books) {
			if(bookPredicate.test(book)) {
				bookList.add(book);
			}
		}
		return bookList;
	}
}
