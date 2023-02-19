package main;

import java.util.Scanner;

import trungtamjava.model.CourseScore;

public class CourseScoreMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		CourseScore cs = new CourseScore();
		while(true) {
			System.out.println("----------------Lựa chọn của bạn là-----------");
			System.out.println("1.Nhập thông tin môn học");
			System.out.println("2.Thoát");
			int choice = sc.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Mời bạn nhập thông tin: ");
					cs.input();
					cs.info();
					break;
				case 2:
					System.out.println("Kết thúc chương trình");
					exit = true;
					break;
				default:
					System.out.println("Chỉ lựa chọn 1 và 2");
			}
			if (exit) {
				break;
			}
			
		}
		
	}
}
