package service;

import java.util.Scanner;

import model.Category;

public class CategoryServiceImpl implements ICategoryService{

	public Category input() {
		Category c = new Category();
		System.out.println("Enter id: ");
		c.setId(new Scanner(System.in).nextInt());
		System.out.println("Enter name:");
		c.setName(new Scanner(System.in).nextLine());
		
		return c;
	}

	public void info(Category c) {
		System.out.println("Category: " + " |id: " + c.getId() + " |name: " + c.getName());
		
	}

}
