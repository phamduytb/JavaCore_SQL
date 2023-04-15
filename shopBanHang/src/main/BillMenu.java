package main;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import model.Bill;
import model.Category;
import model.Product;
import model.ReportBill;
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
			System.out.println("2. Update product quantity of bill");
			System.out.println("3. Delete bill");
			System.out.println("4. Search All Bill");
			System.out.println("5. Search Bill by buy date");
			System.out.println("6. Search Bill by id");
			System.out.println("7. Report bill by product");
			System.out.println("8. Report bill by month");
			System.out.println("9. Report bill by category");
			System.out.println("10. Report money by month");
			System.out.println("11. Search popular product by month");
			System.out.println("12. Exit");
			
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
					searchByDate();
					break;
					
				case 6:
					searchById();
					break;
					
				case 7:
					reportBillByProduct();
					break;
					
				case 8:
					reportBillByMonth();
					break;
					
				case 9:
					reportBillByCategory();
					break;
					
				case 10:
					reportMoneyByMonth();
					break;
					
				case 11:
					searchPopularProductByMonth();
					break;
					
				case 12:
					exit = true;
					break;
					
				default:
					System.out.println("Only enter the number from 1 to 12, please re-enter!");
			}
			
			if (exit) {
				System.out.println("Exit the bill management");
				break;
			}
		}
	}

	

	private static void searchPopularProductByMonth() {
		System.out.println("Search popular product by month: ");
		System.out.println("Enter the month");
		int month = ValidateData.validateInteger();
		List<ReportBill> reportBills = iBill.searchPopularProductByMonth(month);
		
		if (reportBills.size() == 0) {
			System.out.println("List empty!!!");
		} else {
			for (ReportBill reportBill : reportBills) {
				System.out.println("month: " + reportBill.getMonth() + " |ProductId: " + reportBill.getProductId() + " |ProductName: " + reportBill.getProductName()
				+ " |total_product: " + reportBill.getTotal_product());
			}
		}
	}



	private static void reportMoneyByMonth() {
		System.out.println("Report money by month: ");
		List<ReportBill> reportBills = iBill.reportMoneyByMonth();
		
		if (reportBills.size() == 0) {
			System.out.println("List empty!!!");
		} else {
			for (ReportBill reportBill : reportBills) {
				System.out.println("month: " + reportBill.getMonth() + " |total_money: " + String.format("%.2f", reportBill.getTotal_money()));
			}
		}
		
	}



	private static void reportBillByCategory() {
		System.out.println("Report bill by category: ");
		List<ReportBill> reportBills = iBill.reportBillByCategory();
		
		if (reportBills.size() == 0) {
			System.out.println("List empty!!!");
		} else {
			for (ReportBill reportBill : reportBills) {
				System.out.println(" categoryId: " + reportBill.getCategoryId() +  " |categoryName: " + reportBill.getCategoryName() +  " |totalBill: " + reportBill.gettotalBill());
			}
		}
		
	}



	private static void reportBillByMonth() {
		System.out.println("Report bill by month: ");
		List<ReportBill> reportBills = iBill.reportBillByMonth();
		
		if (reportBills.size() == 0) {
			System.out.println("List empty!!!");
		} else {
			for (ReportBill reportBill : reportBills) {
				System.out.println(" Month: " + reportBill.getMonth() + " |totalBill: " + reportBill.gettotalBill());
			}
		}
		
	}



	private static void reportBillByProduct() {
		System.out.println("Report bill by product");
		List<ReportBill> reportBills = iBill.reportBillByProduct();
		
		if (reportBills.size() == 0) { 
			System.out.println("List empty!!!");
		} else {
			for (ReportBill reportBill : reportBills) {
				System.out.println("ProductId: " + reportBill.getProductId() + " |ProductName: " + reportBill.getProductName() + " |totalBill: " + reportBill.gettotalBill());
			}
		}
	}



	private static void searchById() {
		
		Bill bill = new Bill();
		
		System.out.println("Enter the id number of bill to find: ");
		
		int id = ValidateData.validateInteger();
		bill = iBill.searchById(id);
		if (bill == null) {
			System.out.println("No exist bill with the id number = " + id);
		} else {
			System.out.println("The infomation of bill with the id number: " + id);
			bill.info();
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
		
		//update số lương product sau khi tạo bill
		product.setProductQuantity(product.getProductQuantity() - bill.getProductQuantity());
		
		System.out.println("Update product quantity after create bill");
		iProduct.update(product);
	}
	
	private static void delete() {
		
		System.out.println("---Delete bill---");
		 System.out.println("Enter the id number of bill to deleted");
		 int id = ValidateData.validateInteger();
		 Bill bill = iBill.searchById(id);
		 if (bill == null) {
			System.out.println("No exits bill with the id number: " + id );
		} else {
			System.out.println("The infomation of bill to deleted: ");
			bill.info();
			
			iBill.delete(id);
		}
	}

	private static void update() throws ParseException {
		
		System.out.println("---Update Bill---");
		
		System.out.println("Enter the id number of bill to updated");
		
		int id = ValidateData.validateInteger();
		
		Bill bill = iBill.searchById(id);
		
		 if (bill == null) {
				System.out.println("No exits bill with the id number: " + id );
			} else {
				
				System.out.println("The infomation of bill to updated: ");
				
				bill.info();
				
				bill.inputUpdate();
				
				iBill.update(bill);
			}
		
		
	}
}
