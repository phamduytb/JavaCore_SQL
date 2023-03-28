package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestDate {
	public static void main(String[] args) throws ParseException {
		
		String s = new Scanner(System.in).nextLine();
		
		Date d = new SimpleDateFormat("yyyy/MM/dd").parse(s);
		
		System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(d));
	}
}
