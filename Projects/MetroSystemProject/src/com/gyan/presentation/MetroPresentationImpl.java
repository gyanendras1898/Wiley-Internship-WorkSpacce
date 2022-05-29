package com.gyan.presentation;

import java.sql.SQLException;

import java.util.Scanner;

import com.gyan.beans.Card;
import com.gyan.service.CardService;
import com.gyan.service.CardServiceImpl;


public class MetroPresentationImpl implements MetroPresentation {
	Scanner sc=new Scanner(System.in);
	CardService cardService=new CardServiceImpl();

	@Override
	public void showMenu() {
		System.out.println("1. Register new User");
		System.out.println("2. Log in");
		System.out.println("3. Exit");

	}

	@Override
	public void performMenu(int choice) {
	try {
		switch(choice) {
		case 1:
			int chance=3;
			double balance;
			do {
				System.out.println("Enter Initail Balance");
				balance=sc.nextDouble();
				
				if(balance<100)
				System.out.println("Deposit Initial Balance of minimum 100 : "+(chance)+" remaining chance");
				
			}while(chance-->0 && balance<100);
			
			if(balance<100) {
				System.out.println("Thanks for using our System, kindly visit us again!");
				System.exit(0);
			}
			
			if(cardService.registerUser(balance))
				System.out.println("User get registered successfully");
			else
				System.out.println("Server Down");
				
			break;
			
			
		case 2:
			System.out.println("Enter Card Id");
			int cId = sc.nextInt();
			
			boolean cardPresent = cardService.isCardPresent(cId);
			
			if(cardPresent==false) {
				System.out.println("Card not registered or invalid card ID");
				break;
			}
			
			break;
		case 3:
			System.out.println("Thanks for using our System, kindly visit us again!");
			System.exit(0);
		default:
			System.out.println("Enter Valid Choice!");
			
		}
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}
	

}
