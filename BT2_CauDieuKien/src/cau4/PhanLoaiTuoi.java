package cau4;

import java.util.Scanner;

public class PhanLoaiTuoi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Vui lòng nhập tuổi: ");
			int age = sc.nextInt();
			phanLoaiTuoi(age);
		}
		
	}

	private static void phanLoaiTuoi(int age) {
		if(age < 1)
			System.out.println("Trẻ sơ sinh");
		else if (age >= 1 && age <= 3) {
			System.out.println("Em bé");
		}
		else if (age > 3 && age <= 18) {
			System.out.println("Trẻ em");
		}
		else if (age > 18 && age <= 40) {
			System.out.println("Người lớn");
		}
		else if (age > 40 && age < 60) {
			System.out.println("Trung niên");
		}
		else
			System.out.println("Người già");
		
	}
}
