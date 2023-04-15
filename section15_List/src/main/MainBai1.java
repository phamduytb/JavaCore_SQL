package main;

import model.Person;

public class MainBai1 {
	public static void main(String[] args) {
		Person person = new Person(1, "Duy", 23);
		Person person1 = new Person(2, "Truong", 23);
		
		if (person.equals(person1)) {
			System.out.println("Two people of the same age");
		} else {
			System.out.println("Two people are not the same age");
		}
	}
}
