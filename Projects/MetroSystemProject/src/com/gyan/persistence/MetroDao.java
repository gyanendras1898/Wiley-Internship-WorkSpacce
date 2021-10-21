package com.gyan.persistence;

import java.sql.SQLException;

import com.gyan.beans.Card;

public interface MetroDao {
	
	int addUser(double balance) throws ClassNotFoundException, SQLException;
	boolean checkIn();
	double checkOut();
	void getDetails();

}
