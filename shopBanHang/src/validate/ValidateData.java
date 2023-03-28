package validate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ValidateData {
	
	// Validate Int Number
	public static int validateInteger () {
		
		while (true) {
			try {
				int a = new Scanner(System.in).nextInt();
				return a;
			} catch(Exception e) {
				e.printStackTrace();
				System.out.println("Data invalid, please re-enter!");
			}
		}
		
	}
	
	//Vaidate double number
	public static double validateDouble() {
		while (true) {
			try {
				double a = Double.parseDouble(new Scanner(System.in).nextLine());
				return a;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Data invalid, please re-enter!");
			}
		}
	}
	
	// enter a string
	public static String validateString() {
		return new Scanner(System.in).nextLine();
	}
	
	// enter buy date
	public static Date validateDate() throws ParseException {
		
		System.out.println("Enter buy date with fomat (dd/MM/yyyy)");
		
		String date = ValidateData.validateString();
		
		return new SimpleDateFormat("dd/MM/yyyy").parse(date);
	}
}
