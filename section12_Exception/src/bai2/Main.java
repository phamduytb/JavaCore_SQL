package bai2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a, b;
		System.out.println("Enter the number a");
		a = new Scanner(System.in).nextInt();
		System.out.println("Enter the number a");
		b = new Scanner(System.in).nextInt();
		try {
			System.out.println(divide(a,b));
		} catch (ZeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getErroMessage());
		}
		System.out.println("End");
	}

	private static double divide(int a, int b) throws ZeroException {
		if (b == 0) {
			ZeroException exception = new ZeroException();
			exception.setErroMessage("divide by 0!");
			throw exception;
		} 
//		else {
//			System.out.println(a + " divide " + b + " = " + ((double) a) / ((double) b));
//		}
		return (double) a / b;
	}
}
