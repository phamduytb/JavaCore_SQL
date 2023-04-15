package trungtamjava.model;

import java.util.Scanner;

public class CourseScore {
	private String id;
	private double score;
	private String name;
	
	public CourseScore() {
		
	}
	
	public void input() {
		System.out.println("Nhập id: ");
		id = new Scanner(System.in).nextLine();
		System.out.println("Nhập điểm: ");
		score =  new Scanner(System.in).nextDouble();
		System.out.println("Nhập tên môn học: ");
		name =  new Scanner(System.in).nextLine();
	}
	
	public void info() {
		System.out.println("Thông tin môn học");
		System.out.print("id: " + id + " |score: " + score + " |name: " + name + " |rank: ");
		if(score < 5) 
			System.out.print("Yeu ");
		else if (score >= 5 && score < 7) {
			System.out.print("TB ");
		}
		else if (score >= 7 && score < 8) {
			System.out.print("Kha ");
		}
		else if (score >= 8 && score < 9) {
			System.out.print("Gioi ");
		}
		else {
			System.out.print("Xuat sac ");
		}
		System.out.println();
	}
}
