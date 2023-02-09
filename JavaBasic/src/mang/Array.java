package mang;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		
		// mangr có khởi tạo và gán giá trị
		int[] a = {1, 2, 3};
		
		//
		double[] a2 = new double[10];
		
		//in các phần tử của mảng
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		//Tính tổng mảng
		int tong = 0;
		for (int i : a) {
			tong += i;
		}
		System.out.println("Tổng mang a = " + tong);
		
		//Tìm min của mảng
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min > a[i])
				min = a[i];
		}
		System.out.println("Phần tử nhỏ nhất của mảng là: " + min);
		
		//in mảng theo thứ tự tăng dần
		
		
	}
	
	public static double input() {
		Scanner sc = new Scanner(System.in);
		return sc.nextDouble();
	}
}
