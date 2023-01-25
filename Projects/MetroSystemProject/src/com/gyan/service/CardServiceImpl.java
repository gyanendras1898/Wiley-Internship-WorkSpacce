package com.gyan.service;

import java.sql.SQLException;

import com.gyan.beans.Card;
import com.gyan.persistence.CardDao;
import com.gyan.persistence.CardDaoImpl;

public class CardServiceImpl implements CardService {
	
	private CardDao cardDao=new CardDaoImpl();

	@Override
	public boolean registerUser(double balance) throws ClassNotFoundException, SQLException {
		int newId=cardDao.addCard(balance);
		if(newId!=-1) {
//			new Card(newId,balance);
			System.out.println("Card Id : "+newId);
			return true;
		}
		return false;
	}

	@Override
	public boolean isCardPresent(int cId) throws ClassNotFoundException, SQLException {
		return cardDao.isCardPresent(cId);
	}

	@Override
	public boolean addCardBalance(int cardId, double balance)throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double viewBalance(int cardId)throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int viewCardId()throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
