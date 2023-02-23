package bai2.main;

import java.awt.print.Printable;
import java.util.Scanner;

import bai2.model.Car;
import bai2.model.Train;
import bai2.model.Vehicles;

public class Main {
	public static void main(String[] args) {
		Vehicles c = new Car();
		
		Vehicles t = new Train();
		
		System.out.println("----Nhập thông tin ô tô----");
		input(c);
		
		System.out.println("----Nhập thông tin tàu----");
		input(t);
		
		System.out.println("----In thông tin ô tô----");
		print(c);
		
		System.out.println("----In thông tin tàu----");
		print(t);
	}

	private static void print(Vehicles c) {
		System.out.println("In giá vé");
		System.out.println(c.getGiaVe());
		
		System.out.println("In số ghế");
		System.out.println(c.getSoGhe());
		
		if (c instanceof Car) {
			System.out.println("In loại xe: ");
			System.out.println(((Car) c).getLoaiXe());
		}
		if (c instanceof Train) {
			System.out.println("In số toa: ");
			System.out.println(((Train) c).getSoToa());
		}
		
	}

	private static void input(Vehicles c) {
		System.out.println("Nhập giá vé");
		c.setGiaVe(new Scanner(System.in).nextDouble());
		
		System.out.println("Nhập số ghế");
		c.setSoGhe(new Scanner(System.in).nextInt());
		
		if (c instanceof Car) {
			System.out.println("Nhập loại xe: ");
			((Car) c).setLoaiXe(new Scanner(System.in).nextLine());
		}
		if (c instanceof Train) {
			System.out.println("Nhập số toa: ");
			((Train) c).setSoToa(new Scanner(System.in).nextInt());
		}
		
	}
}
