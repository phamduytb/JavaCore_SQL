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
		System.out.println("Enter the number x: ");
		x = inputNumber();
		System.out.println("Enter the number y: ");
		y = inputNumber();
	}

	private static int inputNumber() {
		while (true) {
			try {
				int a = new Scanner(System.in).nextInt();
				return a;
			} catch(Exception e) {
				System.out.println("Only numbers are allowed, please enter again!");
			}
		}
		
		
		
	}
}
