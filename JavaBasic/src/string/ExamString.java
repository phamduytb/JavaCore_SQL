package string;

import java.util.Scanner;

public class ExamString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter Email: ");
			String s = sc.nextLine();
			if(validateEmail(s)) {
				System.out.println("Email hop le");
			} else {
				System.out.println("Email khong hop le");
			}
		}
		
	}
	
	public static boolean validateEmail(String email) {
		
		/*
		 * kiem tr email chuan ( tu viet), sau nay ap dung thu vien co san
		 * vd email chuan: test@gmail.com
		 * co duy nhat @, chia lam 2 phan
		 * part 1: >= 6 ky tu, ([a-z0-9])
		 * part 2: phai co it nhat 1 dau cham
		 */
		if (email != null) {
			String[] parts = email.split("@");
			if (parts.length == 2) {
				if (parts[0].length() >= 6) {
					
					for (int i = 0; i < parts[0].length(); i++) {
						char x = parts[0].toLowerCase().charAt(i);
						
						if (x < 'a' || x > 'z' ) {
							return false;
						}
					}
					if (parts[1].contains(".")) {
						return true;
					}
				}
			}
		}
		
		
		return false;
	}
}
