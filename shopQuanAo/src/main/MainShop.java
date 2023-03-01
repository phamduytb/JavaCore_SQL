package main;

import java.util.Scanner;

import model.Category;
import model.Product;
import service.CategoryServiceImpl;
import service.ICategoryService;
import service.IProductService;
import service.ProductServiceImpl;

public class MainShop {
	public static void main(String[] args) {
		
		ICategoryService categoryService = new CategoryServiceImpl();
		
		IProductService productService  = new ProductServiceImpl();
		
		while(true) {
			System.out.println("Input CATEGORY: ");
			Category category = categoryService.input();
			
			System.out.println("Enter number of products:");
			int n = new Scanner(System.in).nextInt();
			
			 Product[] products = new Product[n];
			 for(int i = 0; i < n; i++) {
				 System.out.println("-----------------");
				 System.out.println("Enter product: " + (i + 1));
				 products[i] = productService.input();
				 //set category
				 products[i].setCategory(category);
				 System.out.println("-----------------");
			 }
			 
			 System.out.println("Info products: "); 
			 for (Product p : products) {
				 System.out.println("-----------------");
				 productService.info(p);
				 categoryService.info(p.getCategory());
				 System.out.println("-----------------");
			 }
			 
			 
			 System.out.println("Press y to continue");
			 String y = new Scanner(System.in).nextLine();
			 if(!y.equalsIgnoreCase("y")) {
				 break;
			 }
		}
		
	}
}
