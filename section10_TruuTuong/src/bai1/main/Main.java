package bai1.main;

import bai1.model.Boss;
import bai1.model.Employee;
import bai1.model.Person;

public class Main {
	public static void main(String[] args) {
		Person p = new Employee();
		System.out.println("Salary of employee: ");
		p.salary();
		
		Person p1 = new Boss();
		System.out.println("Salary of boss: ");
		p1.salary();
	}
}
