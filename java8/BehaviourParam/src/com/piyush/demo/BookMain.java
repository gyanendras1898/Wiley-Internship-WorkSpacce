package com.piyush.demo;

import java.util.ArrayList;


import com.piyush.bean.Book;

public class BookMain {

	public static void main(String[] args) {
		
		ArrayList<Book> books=BooksLibrary.getBooks();
		System.out.println(books);
		
		BooksLibrary bookLibrary=new BooksLibrary();
		
		System.out.println(bookLibrary.getBooksWrittenByAuthorX());

		System.out.println("List of Thick Books");
		System.out.println(bookLibrary.searchBook(new ThickBookPredicate()));

		System.out.println("List of Books written by Author X");
		System.out.println(bookLibrary.searchBook(new ThickBookPredicate()));
		
	}

}
