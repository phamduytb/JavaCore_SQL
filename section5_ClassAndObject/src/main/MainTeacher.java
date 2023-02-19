package main;

import java.util.Scanner;

import model.Teacher;

public class MainTeacher {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		Teacher teacher = new Teacher();
//		teacher.input(teacher,sc);
		teacher.input();
		teacher.info();
	}
}
