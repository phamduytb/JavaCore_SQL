package demo.model;

public class Animal {
	
	public Animal() {
		System.out.println("This is constructor of animal");
	}
	
	public Animal(String s) {
		System.out.println("This is constructor of animal with string: " + s);
	}
	
	public void speak() {
		System.out.println("Animal speak");
	}
}
