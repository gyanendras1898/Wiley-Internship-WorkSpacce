package com.piyush.demo;

import com.piyush.bean.Book;

public class CostlyBookPredicate implements BookPredicate{

	@Override
	public boolean test(Book book) {
		return(book.getPrice()>1500);
	}

}
