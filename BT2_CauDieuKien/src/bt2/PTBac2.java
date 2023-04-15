package bt2;

import java.util.Scanner;

//----------------Giải phương trình ax^2 + bx + c = 0--------------------
public class PTBac2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		for (int i = 0; i < 5; i++) {
			System.out.print("Nhập a =  ");
			a = Integer.parseInt(sc.nextLine());
			System.out.print("Nhập b =  ");
			b = Integer.parseInt(sc.nextLine());
			System.out.print("Nhập c =  ");
			c = Integer.parseInt(sc.nextLine());
			
			giaiPhuongTrinh(a, b, c);
		}
		
	}

	private static void giaiPhuongTrinh(int a, int b, int c) {
		if (a == 0) {
			if (b == 0) {
				if (c == 0)
					System.out.println("Phương trình có vô số nghiệm");
				else
					System.out.println("Phương trình vô nghiệm");
			} else {
				System.out.println("Phương trình có 1 nghiêm: " + (double)(-c / b));
			}
		} else {
			int detal = b * b - 4 * a * c;
			if (detal > 0) {
				System.out.println("Phương trình có 2 nghiệm phân biệt:");
				System.out.println("x1 = " + ((-b + Math.sqrt(detal))/ (2 * a)));
				System.out.println("x2 = " + ((-b - Math.sqrt(detal))/ (2 * a)));
			} else if (detal == 0) {
				System.out.println("Phương trình có nghiệm kép x =  " + (-b / (2 * a)));
			} else {
				System.out.println("Phương trình vô nghiệm");
			}
		}
	}
}
