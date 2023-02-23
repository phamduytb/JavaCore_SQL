package demo.main;

import java.util.Scanner;

import demo.model.Person;
import demo.model.Student;
import demo.model.Teacher;
import demo.service.PersonService;

public class Main {
	public static void main(String[] args) {
		
		Person p = new Teacher();
		Person p1 = new Student();
		
		// Sử dụng interface
		PersonService personService = new PersonService();
		
		personService.input(p);
		personService.input(p1);
		
		personService.print(p);
		personService.print(p1);
	}
	
	
}
