package com.trungtamjava.model;

import java.util.Scanner;

public class Teacher extends Person{
	private String department;

	public Teacher() {
		
	}
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void input() {
		super.input();
		System.out.println("Mời bạn nhập phòng ban của giáo viên: ");
		department = new  Scanner(System.in).nextLine();
		
	}
	
	public void show() {
		super.show();
		System.out.println(" |department: " + department);
	}
	
}
