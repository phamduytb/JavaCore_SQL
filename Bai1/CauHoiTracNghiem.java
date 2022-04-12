package Bai1;

import java.util.Scanner;

public class CauHoiTracNghiem {
	public static void main(String[] args) {
		System.out.println("Tra loi cau hoi sau:");
		System.out.println("Viet Nam co bao nhieu tinh thanh? ");
		System.out.println("1. 61");
		System.out.println("2. 62");
		System.out.println("3. 63");
		System.out.println("4. 64");
		System.out.println("Chon dap an cua ban:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a == 1) {
			System.out.println("Dap an " +a+ " khong chinh xac");
		} else if(a == 2) {
			System.out.println("Dap an " +a+ " khong chinh xac");
		} else if(a == 3) {
			System.out.println("Dap an " +a+ " la dap an chinh xac");
		} else if(a == 4) {
			System.out.println("Dap an " +a+ " khong chinh xac");
		} else System.out.println("Vui long chon 1,2,3,4 ");
	}
}
