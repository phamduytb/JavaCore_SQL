package bai1.main;

import java.util.ArrayList;
import java.util.Scanner;

import bai1.model.Car;
import bai1.model.House;
import bai1.model.Person;

public class MainPerson {
	static ArrayList<Person> persons = new ArrayList<>();
	static ArrayList<House> houses = new ArrayList<>();
	static ArrayList<Car> cars = new ArrayList<>();
	public static void main(String[] args) {
		
		
		boolean exit = false;
		
		while(true) {
			System.out.println("------------Menu---------");
			System.out.println("1. Enter infomation of person");
			System.out.println("2. Enter infomation of car");
			System.out.println("3. Enter infomation of house");
			System.out.println("4. Print infomation of person");
			System.out.println("5. Print infomation of car");
			System.out.println("6. Print infomation of house");
			System.out.println("7. Exit");
			System.out.println("-----Your's choice: ");
			int choice = new Scanner(System.in).nextInt();
			switch(choice) {
				case 1: 
					Person person = new Person();
					person.input();
					persons.add(person);
					break;
					
				case 2:
					inputCar();
					break;
					
				case 3:
					inputHouse();
					break;
					
				case 4:
					printPersons();
					break;
					
				case 5: 
					printCars();
					break;
				case 6:
					printHouses();
					break;
					
				case 7: 
					System.out.println("Exit!!!");
					break;
					
				default: 
					System.out.println("Only enter from 1 to 7");
			}
			
		}
	}

	private static void printCars() {
		for (Car car : cars) {
			car.info();
		}
		
	}

	private static void printPersons() {
		for (Person p : persons) {
			p.info();
			System.out.println("List cars of person: ");
			for (Car car : cars) {
				if (car.getPerson().equals(p)) {
					car.info();
				}
			}
			System.out.println("List houses of person: ");
			for (House house : houses) {
				if (house.getPerson().equals(p)) {
					house.info();
				}
			}
		}
	}

	private static void printHouses() {
		for (House house : houses) {
			house.info();
		}
		
	}

	private static void inputHouse() {
		House house = new House();
		house.input();
		
		//Thêm thông tin chủ của ngôi nhà
		System.out.println("Enter the ower's name of the house: ");
		String name = new Scanner(System.in).nextLine();
		
		// Tìm trong danh sách có người nào có tên này không, set thông tin chủ nhân cho ngôi nhà
		for (Person p : persons) {
			if (name.equalsIgnoreCase(p.getName())) {
				house.setPerson(p);
				break;
			}
		}
		
		houses.add(house);
		
	}

	private static void inputCar() {
		Car car = new Car();
		car.input();
		
		//Thêm thông tin chủ của chiếc ô tô
		System.out.println("Enter the ower's name of the car: ");
		String name = new Scanner(System.in).nextLine();
		for (Person p : persons) {
			if (name.equalsIgnoreCase(p.getName())) {
				car.setPerson(p);
				break;
			}
		}
		
		cars.add(car);
	}
}
