package com.trungtamjava.main;

import java.util.Scanner;

import com.trungtamjava.model.School;

public class MainSchool {
	public static void main(String[] args) {
		System.out.println("Nhập số lượng trường học: ");
		int n = new Scanner(System.in).nextInt();
		School[] s = new School[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập thông tin trường học thứ " + (i + 1) + ":");
			s[i] = new School();
			s[i].input();
		}
		
		System.out.println("----------In thông tin các trường hoc---------------");
		for (int i = 0; i < n; i++) {
			System.out.println("Thông tin trường học thứ " + (i + 1) + ":");
			s[i].info();
		}
		
		// Nhập tên trường để tìm kiếm trong danh sách
		System.out.println("------------Tìm kiếm trường học theo tên nhập vào---------");
		System.out.println("Mời bạn nhập tên trường: ");
		String schoolName = new Scanner(System.in).nextLine();
		int dem = 0;
		for (int i = 0; i < n; i++) {
			if (s[i].getSchoolName().equalsIgnoreCase(schoolName)) {
				s[i].info();
				dem++;
			}
		}
		if (dem == 0) {
			System.out.println("Không tìm được trường có tên " + schoolName);
		}
		
	}
}
