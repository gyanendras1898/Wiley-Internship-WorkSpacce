package com.gyan.persistence;

import java.sql.SQLException;

public interface CardDao {
	int addCard(double balance) throws ClassNotFoundException, SQLException;
	int viewBalance(int cardId);
	boolean addBalance(int cardId);
	boolean isCardPresent(int cardId);
	void allCard();
	int lastCardAdded() throws ClassNotFoundException, SQLException;
}
