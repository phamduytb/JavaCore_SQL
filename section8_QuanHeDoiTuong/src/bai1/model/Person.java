package bai1.model;

import java.util.Scanner;

public class Person {
	private String name, address;
	
	private House[] houses;
	private Car[] cars;

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
	
	
	
	public House[] getHouses() {
		return houses;
	}

	public void setHouses(House[] houses) {
		this.houses = houses;
	}

	public Car[] getCars() {
		return cars;
	}

	public void setCars(Car[] cars) {
		this.cars = cars;
	}

	public void input() {
		System.out.println("Enter name of person: ");
		this.name = new Scanner(System.in).nextLine();
		System.out.println("Enter address of person: ");
		this.address = new Scanner(System.in).nextLine();
	}
	
	public void info() {
		System.out.println("Infomation of person| Name: " + name + " | Address: " + address);
	}
}
