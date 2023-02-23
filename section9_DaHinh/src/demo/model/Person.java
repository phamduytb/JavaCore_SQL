package demo.model;

import java.util.Scanner;

public class Person {
	private String id, name;
	
	
	public Person() {
		

	}
	
	public void getDemo() {
		System.out.println("Student");
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
	
	public void input() {
		System.out.println("Mời bận nhập id: ");
		id = new Scanner(System.in).nextLine();
		System.out.println("Mời bạn nhập tên: ");
		name = new Scanner(System.in).nextLine();
	}
	
	public void show() {
		System.out.print("id: " + id + " " + " |name: " + name);
	}
}
