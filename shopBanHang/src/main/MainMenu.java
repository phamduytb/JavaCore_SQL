package main;

import java.text.ParseException;

import validate.ValidateData;

public class MainMenu {
	public static void main(String[] args) throws ParseException {
		
		boolean exit = false;
		
		while (true) {
			
			System.out.println("-------------------------------------");
			System.out.println("---Main menu---");
			System.out.println("1. Category management");
			System.out.println("2. Product management");
			System.out.println("3. Bill management");
			System.out.println("4. Exit");
			System.out.println("Your choice");
			
			int choice = ValidateData.validateInteger();
			
			switch (choice) {
				case 1: 
					CategoryMenu.menu();
					break;
					
				case 2:
					ProductMenu.menu();
					break;
					
				case 3:
					BillMenu.menu();
					break;
					
				case 4:
					exit = true;
					break;
					
				default:
					System.out.println("The only enter the number from 1 to 4, please re-enter");
			}
			
			if (exit) {
				System.out.println("The end!!!!!!");
				break;
			}
		}
	}
}
