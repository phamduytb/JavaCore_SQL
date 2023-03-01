package bai1;

import java.util.Scanner;

public class Main {
	static int x, y;
	public static void main(String[] args) {
		System.out.println("Enter two number:");
		input();
		System.out.println(x + " + " + y + " = " + sum(x,y));
		System.out.println("End!");
	}

	private static int sum(int x2, int y2) {
		return x + y;
		
	}

	private static void input() {
		while (true) {
			try {
				
				System.out.println("Enter the number x: ");
				x = new Scanner(System.in).nextInt();
				break;
			} catch(Exception e) {
				System.out.println("Only numbers are allowed, please enter again!");
			}
		}
		
		while (true) {
			try {
				System.out.println("Enter the number y: ");
				y = new Scanner(System.in).nextInt();
				break;
			} catch(Exception e) {
				System.out.println("Only numbers are allowed, please enter again!");
			}
		}
		
	}
}
