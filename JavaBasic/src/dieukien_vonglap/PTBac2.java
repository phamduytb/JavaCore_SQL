package dieukien_vonglap;

import java.util.Scanner;

public class PTBac2 {
	// ax^2 +bx + c = 0
	/*
	 * 
	 * */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		System.out.print("Nhập a: ");
//		int a = Integer.parseInt(in.nextLine());
//		System.out.print("Nhập b: ");
//		int b = Integer.parseInt(in.nextLine());
//		System.out.print("Nhập c: ");
//		int c = Integer.parseInt(in.nextLine());
//		giaiPhuongTrinhBac2(a, b, c);
		
		menu();
		
//		Dựa vào điều kiện để gắn giá trị dùng ? :
		
	}
	
	public static void giaiPhuongTrinhBac2(int a, int b, int c) {
		// bậc 1
		if (a == 0) {	
			if (b == 0) {
				if (c == 0) {
					System.out.println("Phương trình vô số nghiệm");
				} else {
					System.out.println("Phương trình vô nghiệm");
				}
			} else {
				System.out.println("Dữ liệu hợp lệ");
			}
		} else { // bậc 2
			int detal = b*b - 4 * a * c;
			if(detal < 0 ) 
				System.out.println("Phuong trinh vo nghiem");
			else if(detal == 0)
				System.out.println("Nghiem kep: " + (-b / (2 * a)));
			else {
				double x1 = (-b + Math.sqrt(detal) / (2 * a));
				double x2 = (-b - Math.sqrt(detal) / (2 * a));
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		}
	}
	
	public static void checkNumber(int a) {
		if (a > 0) {
			System.out.println("a > 0");
		}
		else if (a < 0) {
			System.out.println("a < 0");
		}
		else  {
			System.out.println("a = 0");
		}
	}
	
	public static void menu() {
		System.out.println("---Menu---");
		System.out.println("1. Java");
		System.out.println("2. Javascript");
		System.out.println("3. SQL");
		
		Scanner in = new Scanner(System.in);
		System.out.println("Lua chon:");
		int a = in.nextInt();
		switch (a) {
		// trong Java sẽ chạy hết case bên dưới nên phải dùng break để thoát
		case 1: {
			System.out.println("Java");
			break;
		}
		
		case 2: {
			System.out.println("JS");
			break;
		}
		
		case 3: {
			System.out.println("SQL");
			break;
		}
		default:
			System.out.println("Chi chon 1, 2, 3");
		}
		
	}
}
