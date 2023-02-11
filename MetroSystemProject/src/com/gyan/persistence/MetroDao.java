package com.gyan.persistence;

import com.gyan.beans.Card;

public interface MetroDao {
	
	boolean addUser(Card card);
	boolean checkIn();
	double checkOut();
	void getDetails();

}
