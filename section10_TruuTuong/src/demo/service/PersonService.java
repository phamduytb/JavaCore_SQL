package demo.service;

import java.util.Scanner;

import demo.model.Person;
import demo.model.Student;
import demo.model.Teacher;



public class PersonService implements IPersonService{
	
	public void print(Person p) {
		// TODO Auto-generated method stub
		if (p instanceof Teacher) {
			Teacher t = (Teacher) p;	// downcasting
			System.out.println(t.getDepartment());
		}
		
		if (p instanceof Student) {
			Student s = (Student) p;
			System.out.println(s.getGrade());
		}
		
	}

	public void input(Person p) {
		// TODO Auto-generated method stub
		System.out.println("Mời bận nhập id: ");
		p.setId(new Scanner(System.in).nextLine()); 
		System.out.println("Mời bạn nhập tên: ");
		p.setName(new Scanner(System.in).nextLine());
		
		if (p instanceof Teacher) {
			Teacher t = (Teacher) p;	// downcasting
			System.out.println("Mời bạn nhập phòng ban của giáo viên: ");
			t.setDepartment(new  Scanner(System.in).nextLine()); 
		}
		
		if (p instanceof Student) {
			Student s = (Student) p;
			System.out.println("Nhập tên lớp: ");
			s.setGrade(new  Scanner(System.in).nextLine());
		}
		
	}

}
