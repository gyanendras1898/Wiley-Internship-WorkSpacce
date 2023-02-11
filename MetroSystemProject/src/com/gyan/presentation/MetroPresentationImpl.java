package com.gyan.presentation;

public class MetroPresentationImpl implements MetroPresentation {

	@Override
	public void showMenu() {
		System.out.println("1. Register new User");
		System.out.println("2. Swipe in");
		System.out.println("3. Swipe out");
		System.out.println("4. Show output");
		System.out.println("5. Exit");

	}

	@Override
	public void performMenu(int choice) {
		switch(choice) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			System.out.println("Thanks for using our System, kindly visit us again!");
			System.exit(0);
		default:
			System.out.println("Enter Valid Choice!");
			
		}

	}

}
