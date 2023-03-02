package bai2.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import bai2.model.Product;

public class Main {
	public static void main(String[] args) {
		
		writeToFile();
		
		readFromFile();
		
		writeListProduct();
		
		readProductList();
		
		updateFile();
	}

	// Đọc 1 đối tượng từ file
	private static void readFromFile() {
		
		try {
			FileInputStream inputStream = new FileInputStream("Product.txt");
			
			ObjectInputStream obj = new ObjectInputStream(inputStream);
			
			Product product = (Product) obj.readObject();
			
			product.info();
			
			obj.close();
			
			inputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	// Ghi một đối tượng vào file
	private static void writeToFile() {
		
		Product product = new Product();
		product.input();
		try {
			FileOutputStream outputStream = new FileOutputStream("Product.txt");
			
			ObjectOutputStream obj = new ObjectOutputStream(outputStream);
			
			obj.writeObject(product);
			
			obj.close();
			
			outputStream.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Ghi 1 danh sách đối tượng vào File
	
	public static void writeListProduct() {
		ArrayList<Product> products = new ArrayList<>();
		System.out.println("-----------Enter list of products-----------");
		while(true) {
			Product product = new Product();
			product.input();
			products.add(product);
			System.out.println("Do you want add product: y/n?");
			String s = new Scanner(System.in).nextLine();
			if (s.equalsIgnoreCase("n")) {
				break;
			}
		}
		try {
			FileOutputStream outputStream = new FileOutputStream("ListProduct.txt");
			
			ObjectOutputStream obj = new ObjectOutputStream(outputStream);
			
			obj.writeObject(products);
			
			obj.close();
			
			outputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	// Đọc 1 danh sách các đối tượng từ file
	
	public static ArrayList<Product> readProductList() {
		ArrayList<Product> products = new ArrayList<>();
		try {
			FileInputStream fileInputStream = new FileInputStream("ListProduct.txt");
			
			ObjectInputStream obj = new ObjectInputStream(fileInputStream);
			
			products = (ArrayList<Product>) obj.readObject();
			
			System.out.println("-------------List of products-----------: ");
			for (Product product : products) {
				product.info();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return products;
		
	}
	
	// Đọc danh sách đối tượng từ file, thêm 1 đối tượng và cập nhật vào file
	public static void updateFile() {
		
		System.out.println("----------List of products before update------------");
		
		ArrayList<Product> products = readProductList();
		
		System.out.println("Add product to product list");
		
		Product product = new Product();
		
		product.input();
		
		products.add(product);
		
		// Ghi danh sách product sau khi đã cập nhật vào file
		try {
			FileOutputStream outputStream = new FileOutputStream("ListProduct.txt");
			
			ObjectOutputStream obj = new ObjectOutputStream(outputStream);
			
			obj.writeObject(products);
			
			obj.close();
			
			outputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Đọc danh sách Product sau khi đã cập nhật
		
		
		
		System.out.println("--------------List of products after being update-------------");
		
		products = readProductList();
	}
}
