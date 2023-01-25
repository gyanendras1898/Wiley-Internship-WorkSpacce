package com.gyan.service;

import java.sql.SQLException;

import com.gyan.beans.Card;

public interface CardService {
	boolean registerUser(double balance) throws ClassNotFoundException, SQLException;
	boolean isCardPresent(int cardId) throws ClassNotFoundException, SQLException;
	boolean addCardBalance(int cardId, double balance)throws ClassNotFoundException, SQLException;
	double viewBalance(int cardId)throws ClassNotFoundException, SQLException;
	int viewCardId()throws ClassNotFoundException, SQLException;
	
}
