package bai3.service.impl;

import java.util.Scanner;

import bai3.service.AddressService;

import bai3.model.Address;


public class AddressServiceImpl implements AddressService{

	

	public void input(Address address) {
		System.out.println("--------------------");
		System.out.println("Enter infomation of address:");
		System.out.println("Enter id:");
		address.setId(new Scanner(System.in).nextLine());
		System.out.println("Enter street:");
		address.setStreet(new Scanner(System.in).nextLine());
		System.out.println("Enter city:");
		address.setCity(new Scanner(System.in).nextLine());
		
		
	}

	public void info(Address address) {
		System.out.println("--------------------");
		System.out.println("show infomation of address:");
		System.out.println(address.getId());
		System.out.println(address.getStreet());
		System.out.println(address.getCity());
		
	}

	
	

	
	
}
