package com.trungtamjava.main;

import java.util.Scanner;

import com.trungtamjava.model.Person;
import com.trungtamjava.model.Student;

public class MainStudent {
	public static void main(String[] args) {
		System.out.println("Nhập số lượng học sinh: ");
		int s = new Scanner(System.in).nextInt();
		Person[] p1 = new Person[s];
		for (int i = 0; i < s; i++) {
			p1[i] = new Student();
			System.out.println("Nhập học sinh thứ " + (i + 1));
			p1[i].input();
		}
		
		System.out.println("In thông tin các học sinh: ");
		for (Person person : p1) {
			person.show();
		}
	}
}
