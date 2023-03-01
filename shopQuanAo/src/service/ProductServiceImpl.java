package service;

import java.util.Scanner;


import model.Product;

public class ProductServiceImpl implements IProductService{

	public Product input() {
		Product p = new Product();
		System.out.println("Enter id: ");
		p.setId(new Scanner(System.in).nextInt());
		
		System.out.println("Enter title: ");
		p.setTitle(new Scanner(System.in).nextLine());
		
		System.out.println("Enter desciption: ");
		p.setDescription(new Scanner(System.in).nextLine());
		
		System.out.println("Enter price: ");
		p.setPrice(new Scanner(System.in).nextDouble());
		return p;
	}

	public void info(Product p) {
		System.out.println(p.getId());
		System.out.println(p.getTitle());
		System.out.println(p.getDescription());
		System.out.println(p.getPrice());
		
	}

}
