package dao;

import java.sql.SQLException;

import bean.Card;

public interface CardDao {

	boolean addCard(Card card) throws ClassNotFoundException, SQLException;
	
	int viewBalance(int cId) throws ClassNotFoundException, SQLException;
	
	boolean addBalance(int cId, int amount) throws ClassNotFoundException, SQLException;
	
	boolean isCardPresent(int cId) throws ClassNotFoundException, SQLException;
	
	int viewCardId() throws ClassNotFoundException, SQLException;
}
