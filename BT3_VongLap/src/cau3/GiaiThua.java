package cau3;

import java.util.Scanner;

public class GiaiThua {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tính n!");
		System.out.println("Nhập n:");
		int n = sc.nextInt();
		System.out.println(n +"! = " + tinhGiaiThua(n));
	}

	private static int tinhGiaiThua(int n) {
		int kq = 1;
		for (int i = 1; i <= n; i++) {
			kq *= i;
		}
		return kq;
	}
}
