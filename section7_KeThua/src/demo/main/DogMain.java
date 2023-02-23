package demo.main;

import demo.model.Animal;
import demo.model.Dog;

public class DogMain {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Animal dog1 = new Dog();
//		Dog dog = new Dog("Dau");
		
		dog.speak();
		dog1.speak();
		dog.eat();
		
	}
}
