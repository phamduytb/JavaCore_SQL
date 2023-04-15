package demo.model;

public class Dog extends Animal{
	
	public Dog() {
		System.out.println("This is constructor of dog");
	}
	
	public Dog(String s) {
//		super(s);
		System.out.println("String: " + s);
	}
	
	public void speak() {
//		super.speak();
		System.out.println("Dog speak");
	}
	
	public void eat() {
		System.out.println("Dog eat shit!");
	}
}
