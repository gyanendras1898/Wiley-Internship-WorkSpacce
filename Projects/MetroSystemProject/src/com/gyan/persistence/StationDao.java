package com.gyan.persistence;

import java.sql.SQLException;
import java.util.ArrayList;

import com.gyan.beans.Station;

public interface StationDao {

	ArrayList<Station> getStations() throws ClassNotFoundException, SQLException;

}
