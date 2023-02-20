package com.trungtamjava.main;

import java.util.Scanner;

import com.trungtamjava.model.Person;
import com.trungtamjava.model.Student;
import com.trungtamjava.model.Teacher;

public class MainTeacher {
	public static void main(String[] args) {
		System.out.println("Nhập số lượng giáo viên: ");
		int s = new Scanner(System.in).nextInt();
		Person[] p1 = new Person[s];
		for (int i = 0; i < s; i++) {
			p1[i] = new Teacher();
			System.out.println("Nhập giáo viên thứ " + (i + 1));
			p1[i].input();
		}
		
		System.out.println("In thông tin các giáo viên: ");
		for (Person person : p1) {
			person.show();
		}
	}
}
