package com.trungtamjava.model;

import java.util.Scanner;

public class School {
	private String id, schoolName, address;
	
	public School() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void input() {
		
		System.out.println("id trường: ");
		id = new Scanner(System.in).nextLine();
		System.out.println("Tên trường: ");
		schoolName = new Scanner(System.in).nextLine();
		System.out.println("Địa chỉ trường: ");
		address = new Scanner(System.in).nextLine();
	}
	
	public void info() {
		System.out.println("id trường: " + id + " |Tên trường: " + schoolName + " |Địa chỉ: " + address);
	}
}
