package demo.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import demo.model.Person;

public class ComparatorMain {
	public static void main(String[] args) {
		Person p = new Person(1, "a");
		Person p1 = new Person(10, "w");
		Person p2 = new Person(1, "k");
		Person p3 = new Person(4, "b");
		Person p4 = new Person(1, "b");
		List<Person> persons = new ArrayList<>();
		persons.add(p);
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		
		System.out.println("List persons before sorting: ");
		for (Person person : persons) {
			System.out.println(person);
		}
		
		Collections.sort(persons, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// Sắp xếp theo id giảm dần
				if (o1.getId() < o2.getId()) {
					return 1;
					// Nếu id bằng nhau sắp xếp theo tên giảm dần
				} else if (o1.getId() ==  o2.getId() && o1.getName().compareTo(o2.getName()) < 0) {
					return o2.getName().compareTo(o1.getName());
					// Chỗ này return -1 cũng được
				} else {
					return -1;
				}
			}
				
		});
		
		System.out.println("List persons after sorting: ");
		for (Person person : persons) {
			System.out.println(person);
		}
	}
}
