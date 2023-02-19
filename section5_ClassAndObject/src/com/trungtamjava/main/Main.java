package com.trungtamjava.main;

import com.trungtamjava.model.Person;

public class Main {
	public static void main(String[] args) {
		Person person = new Person();
		Person person2 = new Person("Pham dinh Duy", "Thai Binh", 23);
		System.out.println(person2.getName() + " " + person2.getAge() + " " + person2.getAddress());
	}
}
