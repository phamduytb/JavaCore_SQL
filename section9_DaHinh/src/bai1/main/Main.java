package bai1.main;

import java.util.Scanner;

import bai1.model.Animal;
import bai1.model.Chicken;
import bai1.model.Dog;

public class Main {
	public static void main(String[] args) {
		
		boolean exit = false;
		
		while(true) {
			System.out.println("------Menu------");
			System.out.println("1. Nhập và xem thông tin những chú chó");
			System.out.println("2. Nhập và xem thông tin những con gà");
			System.out.println("3. Dừng chương trình");
			System.out.println("Lựa chọn của bạn là: ");
			int choice = new Scanner(System.in).nextInt();
			switch(choice) {
				case 1: 
					menuDog();
					break;
				case 2:
					menuChicken();
					break;
				case 3:
					System.out.println("Dừng chương trình");
					exit = true;
					break;
				default:
					System.out.println("Chỉ nhập từ 1 đến 3");
			}
			if (exit == true) {
				break;
			}
		}
		
		
		
	}


	private static void menuChicken() {
		System.out.println("-----Số con gà bạn muốn nhập-----:");
		int n = new Scanner(System.in).nextInt();
		Animal[] d = new Animal[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập thông tin con gà thứ " + (i + 1));
			d[i] = new Chicken();
			input(d[i]);
		}
		 System.out.println("-----In thông tin các con gà-----");
		for (int i = 0; i < n; i++) {
			System.out.println("In thông tin con gà thứ " + (i + 1));
			info(d[i]);
		}
		
	}


	private static void menuDog() {
		System.out.println("-----Số chú chó bạn muốn nhập-----:");
		int n = new Scanner(System.in).nextInt();
		Animal[] d = new Animal[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập thông tin chú chó thứ " + (i + 1));
			d[i] = new Dog();
			input(d[i]);
		}
		
		System.out.println("-----In thông tin các chú chó-------");
		for (int i = 0; i < n; i++) {
			System.out.println("In thông tin chú chó thứ " + (i + 1));
			info(d[i]);
		}
	}


	// nhập thông tin
	private static void input(Animal d) {
		// TODO Auto-generated method stub
		System.out.println("Nhập tên con vật: ");
		d.setName(new Scanner(System.in).nextLine());
		System.out.println("Nhập tuổi con vật: ");
		d.setAge(new Scanner(System.in).nextInt());
		
		if(d instanceof Dog) {
			System.out.println("Nhập màu lông của chú chó này: ");
			((Dog) d).setHairColor(new Scanner(System.in).nextLine());
		}
		if(d instanceof Chicken) {
			System.out.println("Nhập cân nặng cho con gà này: ");
			((Chicken) d).setWeight(new Scanner(System.in).nextDouble());
		}
	}
	
	// in thông tin
	private static void info(Animal d) {
		// TODO Auto-generated method stub
		System.out.println("Tên con vật: ");
		System.out.println(d.getName());
		System.out.println("Tuổi con vật: ");
		System.out.println(d.getAge());
		if(d instanceof Dog) {
			System.out.println("Màu lông của chú chó này: ");
			System.out.println(((Dog) d).getHairColor());
		}
		if(d instanceof Chicken) {
			System.out.println("Cân nặng của con gà này: ");
			System.out.println(((Chicken) d).getWeight());
		}
	}
}
