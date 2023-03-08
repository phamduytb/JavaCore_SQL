package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		boolean exit = false;
		while (true) {
			System.out.println("------------------Menu---------------");
			System.out.println("1. Department manager");
			System.out.println("2. Employee manager");
			System.out.println("3. Exit");
			System.out.println("Your choice");
			int choice = new Scanner(System.in).nextInt();
			switch(choice) {
				case 1: 
					DepartmentMain.menu();
					break;
				case 2: 
					EmployeeMain.menu();
					break;
				case 3:
					System.out.println("The end!");
					exit = true;
					break;
				default:
					System.out.println("Only choice from 1 to 3, please choice again!");
			}
			if (exit) {
				break;
			}
			
		}
		
	}
}
