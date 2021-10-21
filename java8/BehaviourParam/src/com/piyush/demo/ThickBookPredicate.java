package com.piyush.demo;

import com.piyush.bean.Book;

public class ThickBookPredicate implements BookPredicate {

	@Override
	public boolean test(Book book) {
		return book.getNoOfPages()>1500;
	}

}
