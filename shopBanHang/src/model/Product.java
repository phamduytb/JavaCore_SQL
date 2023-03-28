package model;

import java.util.Scanner;

import validate.ValidateData;

public class Product {
	
	private int productId;
	
	private String productName;
	
	private int productQuantity;
	
	private double productPrice;
	
	private Category category;

	public Product() {
		
	}

	public Product(int productId, String productName, int productQuantity, double productPrice, Category category) {
		
		this.productId = productId;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
		this.category = category;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	public void input() {
		System.out.println("---Enter infomation of product---");
		
		System.out.println("Enter name: ");
		productName = new Scanner(System.in).nextLine();
		
		System.out.println("Enter quantity: ");
		productQuantity = ValidateData.validateInteger();
		
		System.out.println("Enter price: ");
		productPrice = ValidateData.validateDouble();
		
		
		
	}
	
	public void info() {
		System.out.println("productId: " + productId + " |productName: " + productName + " |productPrice: "+ String.format("%.2f", productPrice) + " |productQuantity: " + productQuantity  );
	}
}
