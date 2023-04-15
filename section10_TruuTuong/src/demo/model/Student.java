package demo.model;

import java.util.Scanner;



public class Student extends Person{
	private String grade;
	
	public Student() {
		
	}

	

	public String getGrade() {
		return grade;
	}



	public void setGrade(String grade) {
		this.grade = grade;
	}



	public void input() {
		super.input();
		System.out.println("Nhập tên lớp: ");
		grade = new Scanner(System.in).nextLine();
	}
	
	public void show() {
		super.show();
		System.out.println(" |grade: " + grade);
	}
	
}
