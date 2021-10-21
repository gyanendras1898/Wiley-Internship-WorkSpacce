package com.gyan.service;

import com.gyan.beans.Card;

public interface MetroService {
	Card registerUser(double balance);
	boolean swipeIn();
	double swipeOut();
	void showOutput();
	
}
