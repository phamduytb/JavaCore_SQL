package bai1.model;

import java.util.Scanner;

public class Car {
	private String carName;
	private int seatNumber;
	private Person person;
	
	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	public void input() {
		System.out.println("Enter the name of car: ");
		carName = new Scanner(System.in).nextLine();
		
		System.out.println("Enter the car seat number: ");
		seatNumber = new Scanner(System.in).nextInt();
	}
	
	public void info() {
		System.out.println("Infomation of the car: ");
		System.out.println("Name: " + carName +  " |Number of seat: " + seatNumber + " |ower: " + person.getName() + 
				" |Ower's address: " + person.getAddress());
	}
}
