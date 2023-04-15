package bt3;

import java.util.Scanner;

public class TracNghiem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		while(true) {
			System.out.println("------------Danh sách môn học----------");
			System.out.println("1.Java");
			System.out.println("2.Javascript");
			System.out.println("3.Python");
			System.out.println("4.C#");
			System.out.println("0.Exit");
			System.out.println("Vui lòng chọn môn học: ");
			int a = Integer.parseInt(sc.nextLine());
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
