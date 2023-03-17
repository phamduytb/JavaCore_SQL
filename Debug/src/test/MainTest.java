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
		Random random = new Random();
		
		for (int i = 0; i < 3; i++) {
			
			int num = random.nextInt(100);
			
			checkNumber(num);
		}
		System.out.println("The end!");
		
	}

	private static void checkNumber(int num) {
		if (num % 2 == 0) {
			System.out.printf("%d là số chẵn \n", num);
		} else {
			System.out.printf("%d là số lẻ \n", num);
		}
		
	}
}
