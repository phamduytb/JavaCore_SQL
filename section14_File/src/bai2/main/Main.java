package bai2.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import bai2.model.Product;

public class Main {
	public static void main(String[] args) {
		
		writeToFile();
		
		readFromFile();
	}

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
}
