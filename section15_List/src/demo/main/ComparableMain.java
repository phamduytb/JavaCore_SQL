package demo.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import demo.model.Person;

public class ComparableMain {
	public static void main(String[] args) {
		Person p = new Person(1, "a");
		Person p1 = new Person(10, "w");
		Person p2 = new Person(2, "k");
		Person p3 = new Person(4, "b");
		List<Person> persons = new ArrayList<>();
		persons.add(p);
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		
		System.out.println("List persons before sorting: ");
		for (Person person : persons) {
			System.out.println(person);
		}
		
		// Muốn sử dụng thì bên person implement Comparable.
		//Collections.sort(persons);
		System.out.println("List persons after sorting: ");
		for (Person person : persons) {
			System.out.println(person);
		}
	}
}
