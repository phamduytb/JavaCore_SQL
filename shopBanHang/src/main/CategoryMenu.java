package main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Category;
import service.CategoryImpl;
import service.ICategory;
import validate.ValidateData;

public class CategoryMenu {
	
		static ICategory iCategory = new CategoryImpl();
		
		public static void menu() {
		
		boolean exit = false;
		
		while(true) {
			
			System.out.println("-------------------------------------");
			System.out.println("---Category Menu---");
			System.out.println("1. Create Category");
			System.out.println("2. Update Category");
			System.out.println("3. Delete Category");
			System.out.println("4. Search All Category");
			System.out.println("5. Search Category by name");
			System.out.println("6. Search Category by id");
			System.out.println("7. Exit");
			
			System.out.println("---Your choice---");
			int choice = ValidateData.validateInteger();
			
			switch (choice) {
				case 1: 
					create();
					break;
					
				case 2:
					update();
					break;
					
				case 3: 
					delete();
					break;
					
				case 4: 
					readAll();
					break;
					
				case 5:
					searchByName();
					break;
					
				case 6: 
					searchById();
					break;
					
				case 7:
					exit = true;
					break;
					
				default:
					System.out.println("Only enter the number from 1 to 7, please re-enter!");
			}
			
			if (exit) {
				System.out.println("Exit the category management");
				break;
			}
		}
		
	}

	private static void searchById() {
		
		Category category = new Category();
		
		System.out.println("Enter the id number of category to find: ");
		
		int id = ValidateData.validateInteger();
		category =  iCategory.searchById(id);
		if (category == null) {
			System.out.println("No exist category with the id number = " + id);
		} else {
			System.out.println("The infomation of category with the id number: " + id);
			category.info();
		}
		
	}

	private static void searchByName() {
		
		List<Category> categories = new ArrayList<>();
		
		System.out.println("Enter the name of category to find: ");
		
		String name = new Scanner(System.in).nextLine();
		
		categories = iCategory.searchByName(name);
		
		if (categories.size() == 0) {
			System.out.println("List of category empty!");
		} else {
			System.out.println("---List of category--- ");
			for (Category c : categories) {
				c.info();
			}
		}
	}

	private static void readAll() {
		
		List<Category> categories = new ArrayList<>();
		
		categories =  iCategory.readAll();
		
		if (categories.size() == 0) {
			System.out.println("List of category empty!");
		} else {
			System.out.println("---List of category--- ");
			for (Category c : categories) {
				c.info();
			}
		}
	}

	private static void delete() {
		System.out.println("Enter the id number of category to deleted: ");
		int id = ValidateData.validateInteger();
		iCategory.delete(id);
		
	}

	private static void update() {
		Category category = new Category();
		System.out.println("---Update category---");
		System.out.println("Enter the id number of category to updated: ");
		int id = ValidateData.validateInteger();
		category =  iCategory.searchById(id);
		if (category == null) {
			System.out.println("No exist category with the id number = " + id);
		} else {
			System.out.println("The infomation of category to updated: ");
			category.info();
			iCategory.update(category);
		}
	}

	private static void create() {
		System.out.println("---Create Category---");
		Category category = new Category();
		category.input();
		iCategory.create(category);
		
	}
}
