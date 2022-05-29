package com.gyan.service;

import java.sql.SQLException;

import com.gyan.beans.Card;

public interface CardService {
	boolean registerUser(double balance) throws ClassNotFoundException, SQLException;
	boolean isCardPresent(int cardId);
	boolean addCardBalance(int cardId, double balance);
	double viewBalance(int cardId);
	int viewCardId();
	
}
