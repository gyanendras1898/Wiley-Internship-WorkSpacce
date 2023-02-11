package service;

import java.sql.SQLException;

import dao.JourneyDao;
import dao.JourneyDaoImpl;

public class JourneyServiceImpl implements JourneyService {

	@Override
	public boolean swipeIn(int cId, int sId) throws ClassNotFoundException, SQLException {
		JourneyDao journeyDao = new JourneyDaoImpl();		
		return journeyDao.swipeIn(cId, sId);
	}

	@Override
	public boolean swipeOut(int cId, int dId) throws ClassNotFoundException, SQLException {
		int currSourceStation = getSourceStation(cId);
		int fare = (Math.abs(currSourceStation - dId)) * 5;
		JourneyDao journeyDao = new JourneyDaoImpl();
		
		CardService cardService = new CardServiceImpl();
		cardService.addBalance(cId, -fare);
		
		return journeyDao.swipeOut(cId, dId, fare);
	}

	@Override
	public int getSourceStation(int cId) throws ClassNotFoundException, SQLException {
		JourneyDao journeyDao = new JourneyDaoImpl();	
		return journeyDao.getSourceStation(cId);
	}

	@Override
	public int getFare(int cId) throws ClassNotFoundException, SQLException {
		JourneyDao journeyDao = new JourneyDaoImpl();	
		return journeyDao.getFare(cId);
	}

	@Override
	public boolean isJourneyOngoing(int cId) throws ClassNotFoundException, SQLException {
		JourneyDao journeyDao = new JourneyDaoImpl();	
		return journeyDao.isJourneyOngoing(cId);
	}

	@Override
	public boolean getDuration(int cId) throws ClassNotFoundException, SQLException {
		JourneyDao journeyDao = new JourneyDaoImpl();	
		return journeyDao.getDuration(cId);
	}

}
