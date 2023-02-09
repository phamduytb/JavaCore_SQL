package assignment;

import java.util.Scanner;

public class Caculate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tính toán với hai số nguyên: ");
		System.out.print("Nhập số thứ nhất: ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.print("Nhập số thứ hai: ");
		int b = Integer.parseInt(sc.nextLine());
		System.out.println("Tổng hai số là: " + findTotal(a, b));
		
		System.out.println("Hiệu hai số là: " + findSub(a, b));
		
		System.out.println("Tích hai số là: " + findMutiple(a, b));
		
		System.out.println("Thương hai số là: " + findDevide(a, b));
		
		System.out.println("Tính toán với hai số thực: ");
		System.out.print("Nhập số thứ nhất: ");
		double c = Double.parseDouble(sc.nextLine());
		System.out.print("Nhập số thứ hai: ");
		double d = Double.parseDouble(sc.nextLine());
		System.out.println("Tổng hai số là: " + findTotal(c, d));
		
		System.out.println("Hiệu hai số là: " + findSub(c, d));
		
		System.out.println("Tích hai số là: " + findMutiple(c, d));
		
		System.out.println("Thương hai số là: " + findDevide(c, d));
	}
	
	public static int findTotal(int a, int b) {
		return a + b;
	}
	
	public static double findTotal(double a, double b) {
		return a + b;
	}
	
	public static int findSub(int a, int b) {
		return a - b;
	}
	
	public static double findSub(double a, double b) {
		return a - b;
	}
	
	public static int findMutiple(int a, int b) {
		return a * b;
	}
	
	public static double findMutiple(double a, double b) {
		return a * b;
	}
	
	public static int findDevide(int a, int b) {
		return a / b;
	}
	
	public static double findDevide(double a, double b) {
		return a / b;
	}
}
