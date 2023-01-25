package com.gyan.persistence;

import java.sql.SQLException;

public class JourneyDaoImpl implements JourneyDao {

	@Override
	public boolean swipeIn(int cId, int sId) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean swipeOut(int cId, int dId, int fare) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getSourceStation(int cId) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getFare(int cId) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isJourneyOngoing(int cId) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getDuration(int cId) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}
