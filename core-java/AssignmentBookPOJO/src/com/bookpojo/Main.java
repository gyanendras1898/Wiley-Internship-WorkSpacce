package com.bookpojo;

public class Main {
	public static void main(String[] args) {
		Book b1=new Book(1,"book1","author1",250,300);
		Book b2=new Book(2,"aws","author2",150,870);
		Book b3=new Book(3,"java","author3",500,630);
		Book b4=new Book(4,"python","author4",100,710);
		
		BookList list=new BookList(b1,b2,b3,b4);
		
		list.selectionSort();
		
		for(Book b: list.getBooks()) {
			System.out.println(b.toString());
		}
		
		list.bubbleSort();
		
		System.out.println("=========================");
		
		for(Book b: list.getBooks()) {
			System.out.println(b.toString());
		}
		
	}

}
