package Bai1;

import java.util.Scanner;

public class TimMinMax {
	public static void main(String[] args) {
		sosanh();
	}
	
	public static void sosanh() {
		System.out.println("Nhap a:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Nhap b:");
		Scanner sc1 = new Scanner(System.in);
		int b = sc1.nextInt();
		System.out.println("Nhap c:");
		Scanner sc2 = new Scanner(System.in);
		int c = sc2.nextInt();
		//neu a nho nhat
		if(a <= b && a <= c) {
			System.out.println("so nho nhat la " +a);
			if (b <= c) {
				System.out.println("so lon nhat la " +c);
			} else System.out.println("so lon nhat la " +b);
			
		//neu b nho nhat
		} else if(b <= a && b <= c) {
			System.out.println("so nho nhat la " +b);
			if (a <= c) {
				System.out.println("so lon nhat la " +c);
			} else System.out.println("so lon nhat la " +a);
			
		//neu c nho nhat
		} else if(c <= a && c <= b) {
			System.out.println("so nho nhat la " +c);
			if (a <= b) {
				System.out.println("so lon nhat la " +b);
			} else System.out.println("so lon nhat la " +a);
		}
	}
}
