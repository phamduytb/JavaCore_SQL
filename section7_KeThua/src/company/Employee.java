package company;

import java.util.Scanner;

public class Employee {
	private String id, name;
	private int age;
	
	public Employee() {
		
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void input() {
		System.out.println("Nhập id: ");
		id = new Scanner(System.in).nextLine();
		System.out.println("Nhập tên: ");
		name = new Scanner(System.in).nextLine();
		System.out.println("Nhập tuổi: ");
		age = new Scanner(System.in).nextInt();
	}
	
	public void info() {
		System.out.print("id: " + " |name: " + name + " |age: " + age);
	}
}
