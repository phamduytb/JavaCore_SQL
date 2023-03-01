package bai3.main;

import java.util.Scanner;

import bai3.model.Address;
import bai3.model.School;
import bai3.model.Student;
import bai3.service.AddressService;
import bai3.service.SchoolService;
import bai3.service.StudentService;
import bai3.service.impl.AddressServiceImpl;
import bai3.service.impl.SchoolServiceImpl;
import bai3.service.impl.StudentServiceImpl;


public class Main {
	public static void main(String[] args) {
		School school = new School();
		SchoolService schoolService = new SchoolServiceImpl();
		schoolService.input(school);
		
		AddressService addressService = new AddressServiceImpl();
		Address address = new Address();
		addressService.input(address);
		
		System.out.println("Enter the number of students: ");
		int n = new Scanner(System.in).nextInt();
		StudentService studentService = new StudentServiceImpl();
		Student[] students = new Student[n];
		for (int i = 0; i < n; i++) {
			students[i] = new Student();
			System.out.println("-----Enter the student: " + (i + 1));
			studentService.input(students[i]);
			students[i].setAddress(address);
			students[i].setSchool(school);
		}
		
		System.out.println("---------------------");
		System.out.println("Show infomation of students: ");
		for (int i = 0; i < n; i++) {
			
			System.out.println("-----Infomation of student: " + (i + 1));
			studentService.info(students[i]);
			schoolService.info(students[i].getSchool());
			addressService.info(students[i].getAddress());
			System.out.println("---------------------");
		}
		
		// In sinh viên có tuổi lớn nhất
		 int maxAge = 0, index = 0;
		 for (int i = 0; i < students.length; i++) {
			 if (students[i].getAge() > maxAge) {
				 maxAge = students[i].getAge();
				 index = i;
			 }
		 }
		 
		 System.out.println("The oldest student: ");
		 studentService.info(students[index]);
		 schoolService.info(students[index].getSchool());
		 addressService.info(students[index].getAddress());
	}
}
