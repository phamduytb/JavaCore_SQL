package test;

import java.util.Random;

public class MainTest {
	
	/**
	 * f6 nhảy đến bước tiếp theo
	 * f5 nhảy vào hàm
	 * f7 thoát khỏi hàm
	 * f8 nhảy đến điểm breakpoints tiếp theo, hoặc thoát khỏi việc debug
	 * @param args
	 */
	
	public static void main(String[] args) {
		double a = 10000000;
		double b = 100;
		System.out.printf("a = %.2f\nb = %.1f\n", a, b);
		System.out.println("a = " + String.format("%.1f", a));
		System.out.println("b= " + b);
	}

	private static void checkNumber(int num) {
		if (num % 2 == 0) {
			System.out.printf("%d là số chẵn \n", num);
		} else {
			System.out.printf("%d là số lẻ \n", num);
		}
		
	}
}
