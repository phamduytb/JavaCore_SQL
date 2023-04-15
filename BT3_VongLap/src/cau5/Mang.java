package cau5;

import java.util.Iterator;
import java.util.Scanner;

public class Mang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập n = ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Nhập các phần tử trong mảng:");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		inMang(a);
		tinhTongMang(a);
		tinhTichMang(a);
		sapXepMang(a, n);
		System.out.println("Giá trị nhỏ nhất của mảng: " + a[0]);
		System.out.println("Giá trị lớn nhất của mảng: " + a[n-1]);
	}

//	--------------Sắp xếp mảng tăng dần-------------------
//	Thay đổi thứ tự mảng gốc
	private static void sapXepMang(int[] a, int n) {
		for (int i = 0; i < n -1; i++) {
			 for (int j = i + 1; j < n; j++) {
				 if (a[i] > a[j]) {
					 int tmp = a[i];
					 a[i] = a[j];
					 a[j] = tmp;
				 }
			 }
		}
		
	}

	private static void timMin(int[] a) {
		// TODO Auto-generated method stub
		
	}

	private static void tinhTichMang(int[] a) {
		int tich = 1;
		for (int i:a) {
			tich *= i;
		}
		System.out.println("Tích mảng a = " + tich);
		
	}

	private static void tinhTongMang(int[] a) {
		int tong = 0;
		for (int i:a) {
			tong += i;
		}
		System.out.println("Tổng mảng a = " + tong);
		
	}

	private static void inMang(int[] a) {
		// TODO Auto-generated method stub
		for (int i:a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
