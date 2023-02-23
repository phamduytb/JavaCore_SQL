package bai1.model;

import java.util.Scanner;

public class House {
	private double area, price;
	private Person person;

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	public void input() {
		System.out.println("Enter the area of the house");
		area = new Scanner(System.in).nextDouble();
		
		System.out.println("Enter the price of the house");
		price = new Scanner(System.in).nextDouble();
	}
	
	public void info() {
		System.out.println("Infomation of the house: ");
		System.out.println("Area: " + area +  " |Price: " + price + " |ower: " + person.getName() + 
				" |Ower's address: " + person.getAddress());
	}
	
}
