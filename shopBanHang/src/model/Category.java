package model;

import java.util.Scanner;

// categoryId, categoryName
public class Category {
	
	private int categoryId;
	
	private String categoryName;
	
	public Category() {
		
	}

	public Category(int categoryId, String categoryName) {
		
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	public void input() {
		System.out.println("---Enter infomation of category---");
		System.out.println("Enter name of category: ");
		categoryName = new Scanner(System.in).nextLine();
	}
	
	public void info() {
		System.out.println("categoryId: " + categoryId + " |categoryName: " + categoryName);
	}
}
