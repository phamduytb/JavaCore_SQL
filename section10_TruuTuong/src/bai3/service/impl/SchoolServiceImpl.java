package bai3.service.impl;

import java.util.Scanner;

import bai3.service.SchoolService;

import bai3.model.School;


public class SchoolServiceImpl implements SchoolService{

	

	public void input(School school) {
		System.out.println("--------------------");
		System.out.println("Enter infomation of shool:");
		System.out.println("Enter id:");
		school.setId(new Scanner(System.in).nextLine());
		System.out.println("Enter name:");
		school.setName(new Scanner(System.in).nextLine());
		
	}

	public void info(School school) {
		
		System.out.println("Show infomation of school:");
		System.out.println(school.getId());
		System.out.println(school.getName());
		
		
	}

	
	

	
	
}
