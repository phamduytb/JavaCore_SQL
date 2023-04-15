package service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import model.Person;
import service.ListExam;
import service.PersonService;
public class ListExamImpl implements ListExam{

	PersonService personService = new PersonServiceImpl();
	@Override
	public List<Person> input() {
		return personService.input();
	}

	@Override
	public void info(List<Person> list) {
		personService.info(list);
		
	}

	@Override
	public void filter(List<Person> list) {
		System.out.println("----List of person under the age of 20---");
		for (Person person : list) {
			if (person.getAge() < 20) {
				System.out.println(person);
			}
		}
		
	}

	@Override
	public void delete(List<Person> list) {
		Iterator<Person> ite = list.iterator();
		
		while (ite.hasNext()) {
			Person person =  ite.next();
			if (person.getName().contains("A")) {
				ite.remove();;
			}
		}
		
		System.out.println("--------List of person after deleting person whose names have the letter A------");
		
		if (list.size() > 0) {
			for (Person person : list) {
				System.out.println(person);
			}
		} else {
			System.out.println("List is empty!");
		}
		
	}

	@Override
	public void sortPerson(List<Person> list) {
		// Sắp xếp theo tuổi tăng dần
		
		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				if (o1.getAge() > o2.getAge()) {
					return 1;
				}
				return -1;
			}
		});
		
		System.out.println("------After sorting ascending----");
		info(list);
		
		// Sắp xếp theo tuổi giảm dần
		
				Collections.sort(list, new Comparator<Person>() {

					@Override
					public int compare(Person o1, Person o2) {
						if (o1.getAge() < o2.getAge()) {
							return 1;
						}
						return -1;
					}
				});
				
				System.out.println("------After sorting descending----");
				info(list);
		
		
	}
	
}
