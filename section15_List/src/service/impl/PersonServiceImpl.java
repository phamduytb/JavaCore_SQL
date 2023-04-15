package service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import model.Person;
import service.PersonService;

public class PersonServiceImpl implements PersonService{

	@Override
	public List<Person> input() {
		List<Person> persons = new ArrayList<>();
		System.out.println("------------Enter list of persons---------");
		while(true) {
			Person person = new Person();
			System.out.println("----Enter information of person---");
			System.out.println("Enter id");
			person.setId(new Scanner(System.in).nextInt());
			System.out.println("Enter name");
			person.setName(new Scanner(System.in).nextLine());
			System.out.println("Enter age");
			person.setAge(new Scanner(System.in).nextInt());
			persons.add(person);
			System.out.println("Do you want to add more person: Y or N ?");
			String choice = new Scanner(System.in).nextLine();
			if (choice.equalsIgnoreCase("n")) {
				break;
			}
		}
		return persons;
	}
	
	@Override
	public void info(List<Person> list) {
		System.out.println("-------List of persons---------");
		for (Person person : list) {
			System.out.println(person);
		}
		
	}

	

	

}
