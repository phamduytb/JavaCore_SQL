package bai2.service;

import java.util.Scanner;

import bai2.model.Laptop;

public class LaptopServiceImpl implements LaptopService{

	public void input(Laptop laptop) {
		System.out.println("-----------------------");
		System.out.println("Enter infomation of laptop");
		System.out.println("Enter id: ");
		laptop.setId(new Scanner(System.in).nextLine());
		System.out.println("Enter cpu");
		laptop.setCpu(new Scanner(System.in).nextLine());
		System.out.println("Enter ram");
		laptop.setRam(new Scanner(System.in).nextLine());
		System.out.println("Enter VGA");
		laptop.setVga(new Scanner(System.in).nextLine());
		
	}

	public void info(Laptop laptop) {
		System.out.println("-----------------------");
		System.out.println("Show infomation of laptop: ");
		System.out.println("id: " + laptop.getId());
		System.out.println("cpu: " + laptop.getCpu());
		System.out.println("ram: " + laptop.getRam());
		System.out.println("vga: " + laptop.getVga());
		
	}
	
}
