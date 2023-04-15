package bai2.main;

import bai2.model.Laptop;
import bai2.service.LaptopService;
import bai2.service.LaptopServiceImpl;

public class MainLaptop {
	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		
		LaptopService laptopService = new LaptopServiceImpl();
		
		laptopService.input(laptop);
		
		laptopService.info(laptop);
	}
}
