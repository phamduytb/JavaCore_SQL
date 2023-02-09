package bt1;

import java.util.Scanner;

//-----------------Nhập vào 3 số a, b, c tìm min max-----------------
public class TimMinMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.print("Nhập số thứ nhất: ");
		a = Integer.parseInt(sc.nextLine());
		System.out.print("Nhập số thứ hai: ");
		b = Integer.parseInt(sc.nextLine());
		System.out.print("Nhập số thứ ba: ");
		c = Integer.parseInt(sc.nextLine());
		
		System.out.println("Số nhỏ nhất: " + findMin(a, b, c));
		System.out.println("Số lớn nhất: " + findMax(a,b,c));
	}

	private static int findMax(int a, int b, int c) {
		if (a > b) {
			if ( a > c) {
				return a;
			}
				
			else {
				return c;
			}
				
		} else {
			if (b > c) {
				return b;
			} else {
				return c;
			}
		}
		
	}

	private static int findMin(int a, int b, int c) {
		if (a > b) {
			if (b > c) {
				return c;
			} else {
				return b;
			}
		} else {
			if (a > c) {
				return c;
			} else {
				return a;
			}
		}
	}
}
