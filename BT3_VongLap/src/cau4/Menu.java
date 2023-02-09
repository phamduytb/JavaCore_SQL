package cau4;

import java.util.Scanner;

public class Menu {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		menuWhile();
		menuDoWhile();
	}

	private static void menuDoWhile() {
		boolean check = true;
		do {
			System.out.println("-----------Menu sử dụng Do-While----------");
			System.out.println("1.Java");
			System.out.println("2.Javascript");
			System.out.println("3.Python");
			System.out.println("4.C#");
			System.out.println("0.Exit");
			System.out.println("Vui lòng chọn môn học: ");
			int a = sc.nextInt();
			switch (a) {
			case 0:
				System.out.println("---------Exit--------");
				check = false;
				break;
			case 1:
				System.out.println("Bạn đã chọn Java");
				break;
			case 2:
				System.out.println("Bạn đã chọn Javascript");
				break;
				
			case 3:
				System.out.println("Bạn đã chọn Python");
				break;
				
			case 4:
				System.out.println("Bạn đã chọn C#");
				break;

			default:
				System.out.println("Chỉ chọn từ 0 -> 4");
				break;
			}
			if (check == false)
				break;
		} while(check);
		
	}

	private static void menuWhile() {
		boolean check = true;
		while(check) {
			System.out.println("------------Menu sử dụng While----------");
			System.out.println("1.Java");
			System.out.println("2.Javascript");
			System.out.println("3.Python");
			System.out.println("4.C#");
			System.out.println("0.Exit");
			System.out.println("Vui lòng chọn môn học: ");
			int a = sc.nextInt();
			switch (a) {
			case 0:
				System.out.println("---------Exit--------");
				check = false;
				break;
			case 1:
				System.out.println("Bạn đã chọn Java");
				break;
			case 2:
				System.out.println("Bạn đã chọn Javascript");
				break;
				
			case 3:
				System.out.println("Bạn đã chọn Python");
				break;
				
			case 4:
				System.out.println("Bạn đã chọn C#");
				break;

			default:
				System.out.println("Chỉ chọn từ 0 -> 4");
				break;
			}
			if (check == false)
				break;
		}
		
	}

}
