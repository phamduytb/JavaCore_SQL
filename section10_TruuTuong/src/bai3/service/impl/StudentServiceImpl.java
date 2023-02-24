package bai3.service.impl;

import java.util.Scanner;

import bai3.service.StudentService;
import bai3.model.Student;

public class StudentServiceImpl implements StudentService{

	public void input(Student student) {
		System.out.println("--------------------");
		System.out.println("Enter infomation of student:");
		System.out.println("Enter id:");
		student.setId(new Scanner(System.in).nextLine());
		System.out.println("Enter name:");
		student.setName(new Scanner(System.in).nextLine());
		System.out.println("Enter age:");
		student.setAge(new Scanner(System.in).nextInt());
		
	}

	public void info(Student student) {
		System.out.println("--------------------");
		System.out.println("Show infomation of student:");
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getAge());
		
		
	}s
	
}
