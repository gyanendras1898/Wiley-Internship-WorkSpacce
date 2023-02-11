package client;

import java.sql.SQLException;
import java.util.Scanner;

import presentation.CardPresentation;
import presentation.CardPresentationImpl;


public class MetroStationMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
		CardPresentation cardPresentation = new CardPresentationImpl();
		
		while(true) {
			
			cardPresentation.showMenu();
			System.out.println("Enter Choice");
			int choice = sc.nextInt();
			cardPresentation.performMenu(choice);
			System.out.println("");
		}

	}

}
