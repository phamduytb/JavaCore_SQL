package Bai1;

import java.lang.Math;
import java.util.Scanner;

public class GiaiPTBacHai {
	public static void main(String[] args) {
		giaiPTbac2();
	}
	public static void giaiPTbac2() {
		System.out.println("Giai PT bac 2: ax^2 + bx + c = 0");
		System.out.println("Nhap a:");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		System.out.println("Nhap b:");
		Scanner sc1 = new Scanner(System.in);
		double b = sc1.nextDouble();
		System.out.println("Nhap c:");
		Scanner sc2 = new Scanner(System.in);
		double c = sc2.nextDouble();
		double delta = Math.pow(b,2) - 4*a*c ;
		if(delta > 0) {
			double x1 = (-b + Math.sqrt(delta))/(2*a);
			double x2 = (-b - Math.sqrt(delta))/(2*a);
			System.out.println("PT co 2 nghiem: ");
			System.out.println("x1 = " +x1);
			System.out.println("x2 = " +x2);
		} else if(delta == 0) {
			double x = -b/(2*a);
			System.out.println("PT co nghiem kep x1 = x2 = " +x);
		} else System.out.println("PT vo nghiem");
	}
}