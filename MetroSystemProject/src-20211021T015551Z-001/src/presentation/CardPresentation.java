package presentation;

import java.sql.SQLException;

public interface CardPresentation {
	public void showMenu();
	public void performMenu(int choice) throws ClassNotFoundException, SQLException;
}
