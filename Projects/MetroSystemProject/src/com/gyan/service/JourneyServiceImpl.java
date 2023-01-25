package com.gyan.service;

import java.sql.SQLException;

public class JourneyServiceImpl implements JourneyService {

	@Override
	public boolean swipeIn(int cId, int sId) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean swipeOut(int cId, int dId) throws ClassNotFoundException, SQLException {
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
