package com.bookpojo;

public class BookList {
	
	private Book[] books;
	private int noOfBooks;

	public BookList(Book...args) {
		noOfBooks=args.length;
		books=new Book[noOfBooks];
		int idx=0;
		for(Book b: args) {
			books[idx++]=b;
		}
	}
	
	
	public void selectionSort() {
		
		for(int i=0; i<noOfBooks-1; i++) {
			int min=i;
			for(int j=min=i; j<noOfBooks; j++) {
				if(books[j].getNoOfPages() < books[min].getNoOfPages())
					min=j;
			}
			swap(i,min);	
		}
	}
	
	public void bubbleSort() {
		int flag;
		for(int i=0; i<noOfBooks-1; i++) {
			flag=0;
			for(int j=0; j<noOfBooks-1-i; j++) {
				if(books[j].getName().compareTo(books[j+1].getName())<0) {
					swap(j,j+1);
					flag=1;
				}
			}
			if(flag==0)	return;
		}
	}
	
	public void swap(int i, int j) {
		Book temp=books[i];
		books[i]=books[j];
		books[j]=temp;
	}

	public Book[] getBooks() {
		return books;
	}
	
	

}
