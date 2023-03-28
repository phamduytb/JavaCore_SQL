package demo.model;


import java.util.Scanner;

public class Product {
	private String id, name;
	private double price;
	
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void input() {
		System.out.println("Enter infomation of product");
		System.out.println("Enter id: ");
		id = new Scanner(System.in).nextLine();
		
		System.out.println("Enter name: ");
		name = new Scanner(System.in).nextLine();
		
		System.out.println("Enter price: ");
		price = new Scanner(System.in).nextDouble();
	}
	
	public void info() {
		System.out.println("Show infomation of product");
		System.out.println("id: " + id + " | name: " + name + " | price: " + price);
	}
	
	
}
