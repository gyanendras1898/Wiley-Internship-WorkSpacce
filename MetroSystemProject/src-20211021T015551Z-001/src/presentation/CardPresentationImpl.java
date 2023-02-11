package presentation;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import bean.Card;
import bean.Stations;
import exception.MinimumBalanceException;
import service.CardService;
import service.CardServiceImpl;
import service.JourneyService;
import service.JourneyServiceImpl;
import service.StationsService;
import service.StationsServiceImpl;



public class CardPresentationImpl implements CardPresentation {
	
	private CardService cardService = new CardServiceImpl();
	private JourneyService journeyService = new JourneyServiceImpl();
	private StationsService stationsService = new StationsServiceImpl();
	
	
	Scanner sc = new Scanner(System.in);

	
	@Override
	public void showMenu() {
		System.out.println("1. Register");
		System.out.println("2. Login");
		System.out.println("3. Exit");
	}

	
	
	@Override
	public void performMenu(int choice) throws ClassNotFoundException, SQLException, MinimumBalanceException {
		try {
			switch(choice) {
			
			
			case 1:
				try {
					
					System.out.println("Deposit Initial Balance of minimum 25");
					int balance= sc.nextInt();
				//	try {
						if(balance<25) {
							System.out.println("Minimum balance should be 25");
							//throw new MinimumBalanceException();
						
					
					
						System.out.println("Enter valid amount");
						balance = sc.nextInt();
						
						if(balance>=25) {
							Card card = new Card(balance);
							boolean inserted = cardService.addCard(card);
							int cId = cardService.viewCardId();
							if(inserted) {
								System.out.println("Card registered successfully");
								System.out.println("Your card ID is "+cId);
							}
							else {
								System.out.println("Card not inserted");
							}
						}
						
						else {
							System.out.println("Thank you for using the system. Try again");
							break;
						}
					}
						
					
						else {
							Card card = new Card(balance);
							boolean inserted = cardService.addCard(card);
							int cId = cardService.viewCardId();
							if(inserted) {
								System.out.println("Card registered successfully");
								System.out.println("Your card ID is "+cId);
							}
							else {
								System.out.println("Card not inserted");
							}	
						}
//					}
//					
//					catch(MinimumBalanceException e) {
//						e.printStackTrace();
//					}
				}
				
					
//				Card card = new Card(cId, balance);
//				boolean inserted = cardService.addCard(card);
//				if(inserted) {
//					System.out.println("Card registered successfully");
//				}
//				else {
//					System.out.println("Card not inserted");
//				}
//				}
//			}
				catch (ClassNotFoundException | SQLException e){
					e.printStackTrace();
				}
				break;
				
				
			case 2:
				
				
				System.out.println("Enter your ID ");
				int cId = sc.nextInt();
				
				boolean cardPresent = cardService.isCardPresent(cId);
				
				if(cardPresent==false) {
					System.out.println("Card not registered or invalid card ID");
					break;
				}
				
				else {
					while(true) {
					System.out.println("1. View Balance");
					System.out.println("2. Add Balance");
					boolean isJourneyOngoing = journeyService.isJourneyOngoing(cId);
					if(isJourneyOngoing==false) {
						System.out.println("3. Swipe In");
					}
					else if(isJourneyOngoing==true){
						System.out.println("3. Swipe Out");
					}
					System.out.println("4. Exit");
					
					System.out.println("Enter choice ");
					int ch=sc.nextInt();
					
					switch(ch) {
					
					
					case 1:
						try {
							int currBalance = cardService.viewBalance(cId);
							System.out.println("Your current balance is "+currBalance);
							
						}
						catch (ClassNotFoundException | SQLException e){
							e.printStackTrace();
						}
						break;
					
						
						
					case 2:
						try {
							
							System.out.println("Enter the amount");
							int amount = sc.nextInt();
							
							if(amount<=0) {
								System.out.println("Enter valid amount");
								break;
							}
							
							else {
								boolean amountUpdated = cardService.addBalance(cId, amount);
								
								if(amountUpdated) { System.out.println("Amount added successfully");
								int currBalance = cardService.viewBalance(cId);
								System.out.println("Your current balance is "+currBalance);}
								else { System.out.println("Amount not added"); }
							}								
						}
						catch (ClassNotFoundException | SQLException e){
							e.printStackTrace();
						}
						break;
						
						
					
					
					
					case 3:
						try {
							
							if(isJourneyOngoing==false) {
								
								
								
								int currBalance = cardService.viewBalance(cId);
								if(currBalance<25) {
									System.out.println("Your current balance is "+currBalance);
									System.out.println("Please maintain min balance of 25 and try again");
									break;
								}
								
								else {
									
									ArrayList<Stations> stations=stationsService.getStations();
									for(Stations s :stations) {
										System.out.print(s + "\t");
									}
									System.out.println("");
									
							//	System.out.println("1. Virar \t 2. Borivali \t 3. Andheri \t 4. Dadar \t 5. Bandra");
								System.out.println("Enter Source Station Number From Above Stations");
								int sId = sc.nextInt();
								
								if(sId<=0||sId>5) {
									System.out.println("Enter valid station number");
									sId = sc.nextInt();
								}
								
								else {
									boolean swipedIn = journeyService.swipeIn(cId, sId);
									
									if(swipedIn) {
										System.out.println("Boarded successfully");
										
										
										
									}
									else {
										System.out.println("Not Boarded");
										}
								}
								
							}
							}
								
							
						if(isJourneyOngoing==true) {
							
							
							ArrayList<Stations> stations=stationsService.getStations();
							for(Stations s :stations) {
								System.out.print(s + "\t");
							}
							System.out.println("");
							
							System.out.println("Enter Destination Station Number From Above Stations");
							int dId = sc.nextInt();
							
							if(dId<=0||dId>5) {
								System.out.println("Enter valid station number");
								dId = sc.nextInt();
							}
							
							else {
								boolean swipedOut = journeyService.swipeOut(cId, dId);
								
								
								if(swipedOut) {
									int fareValue = journeyService.getFare(cId);
									int currBalance = cardService.viewBalance(cId);
									System.out.println("");
									System.out.println("Your fare is " +fareValue+ " and remaining balance is "+currBalance);
									
									boolean late = journeyService.getDuration(cId);
									
									//System.out.println("Are you late ==== "+late);
									
									if(late==true) {
										
										System.out.println("You are late and will be fined 100");
										
										
										if(currBalance<100) {
											System.out.println("Your current balance is "+currBalance+". Please add atleast "+(100-currBalance)+" rupees");
											System.out.println("");
										
											
												int amount = sc.nextInt();
												while(amount<100-currBalance) {
													System.out.println("Enter valid amount");
													amount = sc.nextInt();
												}
													boolean balanceUpdated = cardService.addBalance(cId, amount);
													boolean fine = cardService.addBalance(cId, -100);
													
													if(fine) { 
													int currtBalance = cardService.viewBalance(cId);
													System.out.println("You are fined 100");
													System.out.println("Your current balance is "+currtBalance);}
													else { System.out.println("Amount not added"); }
												
												break;
												
											}
										
										else if(currBalance>=100) {
											boolean fine = cardService.addBalance(cId, -100);
											
											if(fine) { 
											int currtBalance = cardService.viewBalance(cId);
											System.out.println("You are fined 100");
											System.out.println("Your current balance is "+currtBalance);}
											else { System.out.println("Amount not added"); }
										}
									
									
								}
								else {
									System.out.println("Not swiped out");
									}
								}
							}
						}
						}
						
						
						catch (ClassNotFoundException | SQLException e){
							e.printStackTrace();
						}
						break;
						
						
						
					case 4:
						System.out.println("Thanks for using Metro Service");
						System.exit(0);
						
						
					default:
						break;
						
					}
				}
				}
				
				
			case 3:
			{
				System.out.println("Thanks for using Metro Service");
				System.exit(0);
			}
				
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
						
				
						
						
						
						
						
						
/*						
					case 3:
						try {
							
							boolean isJourneyOngoing = journeyService.isJourneyOngoing(cId);
							if(isJourneyOngoing==true) {
								System.out.println("Please swipe out the ongoing journey before swiping in");
								break;
							}
							
							else {
								
								int currBalance = cardService.viewBalance(cId);
								if(currBalance<25) {
									System.out.println("Your current balance is "+currBalance);
									System.out.println("Please maintain min balance of 25 and try again");
									break;
								}
								
								else {
								System.out.println("1. Virar \t 2. Borivali \t 3. Andheri \t 4. Dadar \t 5. Bandra");
								System.out.println("Enter Source Station Number From Above Stations");
								int sId = sc.nextInt();
								
								if(sId<=0||sId>5) {
									System.out.println("Enter valid station number");
									sId = sc.nextInt();
								}
								
								else {
									boolean swipedIn = journeyService.swipeIn(cId, sId);
									
									if(swipedIn) {
										System.out.println("Boarded successfully");
										
										
										
									}
									else {
										System.out.println("Not Boarded");
										}
								}
								}
								
							}
							
						}
						catch (ClassNotFoundException | SQLException e){
							e.printStackTrace();
						}
						break;
					
					
						
					case 4:
						try {
							
							
							boolean isJourneyOngoing = journeyService.isJourneyOngoing(cId);
							if(isJourneyOngoing==false) {
								System.out.println("Please swipe in before swiping out");
								System.out.println();
								break;
								}
							
							else {
									System.out.println("1. Virar \t 2. Borivali \t 3. Andheri \t 4. Dadar \t 5. Bandra");
									System.out.println("Enter Destination Station Number From Above Stations");
									int dId = sc.nextInt();
									
									if(dId<=0||dId>5) {
										System.out.println("Enter valid station number");
										dId = sc.nextInt();
									}
									
									else {
										boolean swipedOut = journeyService.swipeOut(cId, dId);
										
										
										if(swipedOut) {
											System.out.println("Swiped out successfully");
											int fareValue = journeyService.getFare(cId);
											System.out.println("Your fare is "+fareValue);
											int currBalance = cardService.viewBalance(cId);
											System.out.println("Your remaining balance is "+currBalance);
										}
										else {
											System.out.println("Not swiped out");
											}
										}
								}
						}
						catch (ClassNotFoundException | SQLException e){
							e.printStackTrace();
						}
					break;
						
						
					case 5:
						System.out.println("Thanks for using Metro Service");
						System.exit(0);
						
						
					default:
						break;
						
					}
				}
				}
				
				
			case 3:
			{
				System.out.println("Thanks for using Metro Service");
				System.exit(0);
			}
				
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
			
*/
	
		
		
		
		
		
/*		
		
			System.out.println("Enter choice ");
			int ch=sc.nextInt();
			
			switch(ch) {
			
			case 1:
				
			}
			
		case 2:
			try {
				System.out.println("Enter your ID ");
				int cId = sc.nextInt();
				
				boolean cardPresent = cardService.isCardPresent(cId);
				
				if(cardPresent==true) {
					int currBalance = cardService.viewBalance(cId);
					
					System.out.println("Your current balance is "+currBalance);
				}
				
				else {
					System.out.println("Enter valid card ID");
					break;
				}
				}
			
			catch (ClassNotFoundException | SQLException e){
				e.printStackTrace();
			}
			break;
		
			
			
		case 3:
			try {
				System.out.println("Enter your ID");
				int cId = sc.nextInt();
				
				boolean cardPresent = cardService.isCardPresent(cId);
				
				if(cardPresent==false) {
					System.out.println("Enter valid card ID");
					break;
				}
				else {
				
				System.out.println("Enter the amount");
				int amount = sc.nextInt();
				
				
				boolean amountUpdated = cardService.addBalance(cId, amount);
				
				if(amountUpdated) {
					System.out.println("Amount added successfully");
				}
				else {
					System.out.println("Amount not added");
					}
				}
			}
			catch(ClassNotFoundException | SQLException e){
				e.printStackTrace();
				
			}
			break;
			
			
			
		case 4:
			try {
				System.out.println("Enter your ID");
				int cId = sc.nextInt();
				
				boolean cardPresent = cardService.isCardPresent(cId);
				
				if(cardPresent==false) {
					System.out.println("Enter valid card ID");
					break;
				}
				
				else {
				
				System.out.println("1. Virar \t 2. Borivali \t 3. Andheri \t 4. Dadar \t 5. Bandra");
				System.out.println("Enter Source Station Number From Above Stations");
				int sId = sc.nextInt();
				
				boolean swipedIn = journeyService.swipeIn(cId, sId);
				
				if(swipedIn) {
					System.out.println("Boarded successfully");
				}
				else {
					System.out.println("Not Boarded");
					}
				}
			}
			catch(ClassNotFoundException | SQLException e){
				e.printStackTrace();
				
			}
			break;
			
			
		case 5:
			try {
				System.out.println("Enter your ID");
				int cId = sc.nextInt();
				
				boolean cardPresent = cardService.isCardPresent(cId);
				
				if(cardPresent==false) {
					System.out.println("Enter valid card ID");
					break;
				}
				
				else {
				System.out.println("1. Virar \t 2. Borivali \t 3. Andheri \t 4. Dadar \t 5. Bandra");
				System.out.println("Enter Destination Station Number From Above Stations");
				int dId = sc.nextInt();
				
				boolean swipedOut = journeyService.swipeOut(cId, dId);
				
				
				if(swipedOut) {
					System.out.println("Swiped out successfully");
					int fareValue = journeyService.getFare(cId);
					System.out.println("Your fare is "+fareValue);
					int currBalance = cardService.viewBalance(cId);
					System.out.println("Your remaining balance is "+currBalance);
				}
				else {
					System.out.println("Not swiped out");
					}
				}
			}
			catch(ClassNotFoundException | SQLException e){
				e.printStackTrace();
				
			}
			break;
		default:
			break;
		}
		
		

	}

}

*/
