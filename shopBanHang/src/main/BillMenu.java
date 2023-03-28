package main;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import model.Bill;
import model.Product;
import service.BillImpl;
import service.IBill;
import service.IProduct;
import service.ProductImpl;
import validate.ValidateData;

public class BillMenu {
	
	static IProduct iProduct = new ProductImpl();
	
	static IBill iBill = new BillImpl();
	
	public static void menu() throws ParseException {

		boolean exit = false;
		
		while(true) {
			
			System.out.println("-------------------------------------");
			System.out.println("---Bill Menu---");
			System.out.println("1. Create bill");
			System.out.println("2. Search All Bill");
			System.out.println("3. Search Bill by buy date");
			System.out.println("4. Exit");
			
			System.out.println("---Your choice---");
			int choice = ValidateData.validateInteger();
			
			switch (choice) {
				case 1: 
					create();
					break;
					
				case 2:
					readAll();
					break;
					
				case 3: 
					searchByDate();
					break;
					
				case 4:
					exit = true;
					break;
					
				default:
					System.out.println("Only enter the number from 1 to 4, please re-enter!");
			}
			
			if (exit) {
				System.out.println("Exit the bill management");
				break;
			}
		}
	}

	private static void searchByDate() throws ParseException {
		
		System.out.println("---Search list of bills by buy date");
		
		
		System.out.println("Enter start date");
		Date start = ValidateData.validateDate();
		
		System.out.println("Enter end date");
		Date end = ValidateData.validateDate();
		
		List<Bill> bills = iBill.searchByDate(start, end);
		
		if (bills.size() == 0) {
			System.out.println("List of bills empty!!!");
		}else {
			System.out.println("List of bill: ");
			for (Bill b : bills) {
				b.info();
			}
		}
	}

	private static void readAll() {
		System.out.println("---Read all bill---");
		List<Bill> bills = iBill.readAll();
		
		if (bills.size() == 0) {
			System.out.println("List of bills empty!!!");
		}else {
			System.out.println("List of bill: ");
			for (Bill b : bills) {
				b.info();
			}
		}
		
	}

	private static void create() throws ParseException {
		
		System.out.println("---Create Bill---");
		
		Bill bill = new Bill();
		
		bill.input();
		
		iBill.create(bill);
		
		Product product = bill.getProduct();
		
		product.setProductQuantity(product.getProductQuantity() - bill.getProductQuantity());
		
		System.out.println("Update product quantity after create bill");
		iProduct.update(product);
	}
}
