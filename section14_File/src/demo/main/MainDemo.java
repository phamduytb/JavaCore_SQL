package demo.main;

import demo.model.Product;

public class MainDemo {
	public static void main(String[] args) {
		Product p1 = new Product("12", "duy");
		Product p2 = new Product("12", "duy");
		//Product p2 = p1;-    
		
		System.out.println(p1.equals(p2));
	}
}
