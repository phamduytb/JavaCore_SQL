package model;

import java.util.Scanner;

public class Teacher {
	private String id, name, address, facility;
	
	public Teacher() {
		
	}

	public Teacher(String id, String name, String address, String facility) {
		
		this.id = id;
		this.name = name;
		this.address = address;
		this.facility = facility;
	}
	
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getFacility() {
		return facility;
	}

	public void setFacility(String facility) {
		this.facility = facility;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		id = sc.nextLine();
		name = sc.nextLine();
		address = sc.nextLine();
		facility = sc.nextLine();
	}
	
	
// cách khác để viết hàm input
//	public void input(Teacher teacher, Scanner sc) {
//		System.out.println("Nhập thông tin giáo viên: ");
//		teacher.setId(sc.nextLine());
//		teacher.setName(sc.nextLine());
//		teacher.setAddress(sc.nextLine());
//		teacher.setFacility(sc.nextLine());
//	}
	
	public void info() {
		System.out.println("In thông tin giáo viên: ");
		System.out.println("id: " + getId() + " | name: " + getName() + " | address: " + getAddress() + " | facility: " + getFacility());
	}
}
