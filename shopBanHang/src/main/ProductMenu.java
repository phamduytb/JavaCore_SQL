package main;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Category;
import model.Product;
import service.CategoryImpl;
import service.ICategory;
import service.IProduct;
import service.ProductImpl;
import validate.ValidateData;

public class ProductMenu {
	
	static IProduct iProduct = new ProductImpl();
	static ICategory iCategory = new CategoryImpl();
	
	public static void menu() {
	
	boolean exit = false;
	
	while(true) {
		
		System.out.println("-------------------------------------");
		System.out.println("---Product Menu---");
		System.out.println("1. Create Product");
		System.out.println("2. Update Product");
		System.out.println("3. Delete Product");
		System.out.println("4. Search All Product");
		System.out.println("5. Search Product by name");
		System.out.println("6. Search Product by id");
		System.out.println("7. Search Product by price");
		System.out.println("8. Search  list product of category");
		System.out.println("9. Exit");
		
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
				searchByPrice();
				break;
				
			case 8:
				searchListProductOfCategory();
				break;
				
			case 9:
				exit = true;
				break;
				
			default:
				System.out.println("Only enter the number from 1 to 9, please re-enter!");
		}
		
		if (exit) {
			System.out.println("Exit the category management");
			break;
		}
	}
	
}
	
	private static void choiceCategoryForProduct(Product product) {
		System.out.println("List of category");
		List<Category> categories = iCategory.readAll();
		for (Category c : categories) {
			c.info();
		}
		System.out.println("Choice category for product, please enter the id number of category:");
		while (true) {
			int id = ValidateData.validateInteger();
			Category category = iCategory.searchById(id);
			if (category == null) {
				System.out.println("No exits category with the id number: " + id + " please re-enter");
			} else {
				product.setCategory(category);
				break;
			}
		}
		
	}

	private static void create() {
		
		Product product = new Product();
		System.out.println("---create product----");
		product.input();
		List<Category> categories = iCategory.readAll();
		
		
		choiceCategoryForProduct(product);
		
		iProduct.create(product);
	}

	

	private static void update() {
		
		Product product = new Product();
		System.out.println("---Update product---");
		System.out.println("Enter the id number of product to updated");
		int id = ValidateData.validateInteger();
		product = iProduct.searchById(id);
		if (product == null) {
			System.out.println("No exits product with the id number: " + id );
		} else {
			System.out.println("The infomation of product to updated: ");
			product.info();
			System.out.println("Enter new information for product");
			product.input();
			choiceCategoryForProduct(product);
			iProduct.update(product);
		}
		
	}

	private static void delete() {
		
		 System.out.println("---Delete product---");
		 System.out.println("Enter the id number of product to deleted");
		 int id = ValidateData.validateInteger();
		 Product product = iProduct.searchById(id);
		 if (product == null) {
			System.out.println("No exits product with the id number: " + id );
		} else {
			System.out.println("The infomation of product to deleted: ");
			product.info();
			
			iProduct.delete(id);
		}
		
	}

	private static void readAll() {
		System.out.println("---Read all Products---");
		
		List<Product> products = iProduct.readAll();
		
		printListProduct(products);
	}

	private static void searchByName() {
		System.out.println("Search products by name: "); 
		System.out.println("Enter product's name you want to search: ");
		String name = new Scanner(System.in).nextLine();
		List<Product> products = iProduct.searchByName(name);
		
		printListProduct(products);
	}

	private static void searchById() {
		
		System.out.println("Search products by id: "); 
		System.out.println("Enter product's id you want to search: ");
		int id = ValidateData.validateInteger();
		Product product = iProduct.searchById(id);
		
		if (product == null) {
			System.out.println("No exist product with id: " + id);
		} else {
			System.out.println("product with id: " + id);
			product.info();
		}
		
	}

	private static void searchByPrice() {
		System.out.println("---- Search lists of product by price ----");
		System.out.println("Enter the price range of products you want to search: ");
		double min, max;
		System.out.println("Enter min price: ");
		min = ValidateData.validateDouble();
		System.out.println("Enter max price: ");
		max = ValidateData.validateDouble();
		
		List<Product> products = iProduct.searchByPrice(min, max);
		
		printListProduct(products);
	}

	private static void searchListProductOfCategory() {
		System.out.println("----Search list product of category---");
		List<Category> categories = iCategory.readAll();
		System.out.println("List of categorys: ");
		for (Category c : categories) {
			c.info();
		}
		
		System.out.println("Enter the id number of category you want to search products: ");
		int id = ValidateData.validateInteger();
		List<Product> products = iProduct.searchByCategory(id);
		
		printListProduct(products);
		
	}
	
	private static void printListProduct(List<Product> products) {
		if (products.size() == 0) {
			System.out.println("List of products empty");
		} else {
			System.out.println("List of products: ");
			for (Product product : products) {
				product.info();
			}
		}
	}
}
