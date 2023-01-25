package com.gyan.persistence;

import java.sql.SQLException;

public interface CardDao {
	int addCard(double balance) throws ClassNotFoundException, SQLException;
	double viewBalance(int cardId) throws ClassNotFoundException, SQLException;
	boolean addBalance(int cardId)throws ClassNotFoundException, SQLException;
	boolean isCardPresent(int cardId) throws SQLException, ClassNotFoundException;
	void allCard()throws ClassNotFoundException, SQLException;
	int lastCardAdded() throws ClassNotFoundException, SQLException;
}
