package service;

import java.sql.SQLException;

import bean.Card;
import dao.CardDao;
import dao.CardDaoImpl;


public class CardServiceImpl implements CardService {

	@Override
	public boolean addCard(Card card) throws ClassNotFoundException, SQLException {
		
		CardDao cardDao = new CardDaoImpl();
		return cardDao.addCard(card);
	}

	@Override
	public int viewBalance(int cId) throws ClassNotFoundException, SQLException {
		CardDao cardDao = new CardDaoImpl();	
		return cardDao.viewBalance(cId);
	}

	@Override
	public boolean addBalance(int cId, int amount) throws ClassNotFoundException, SQLException {
		int currBalance = viewBalance(cId);
		int amountToUpdate = currBalance+amount;
		CardDao cardDao = new CardDaoImpl();		
		return cardDao.addBalance(cId, amountToUpdate);
	}

	@Override
	public boolean isCardPresent(int cId) throws ClassNotFoundException, SQLException {
		CardDao cardDao = new CardDaoImpl();
		return cardDao.isCardPresent(cId);
	}

	@Override
	public int viewCardId() throws ClassNotFoundException, SQLException {
		CardDao cardDao = new CardDaoImpl();
		return cardDao.viewCardId();
	}

}
