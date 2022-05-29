package com.piyush.persistence;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public interface EmployeeDao {
	public ObjectOutputStream getOos();
	public ObjectInputStream getOis();
	public ObjectOutputStream getToos();
	public ObjectInputStream getTois();
}
