package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Department;
import service.DepartmentServiceImpl;
import service.IDepartmentService;

public class DepartmentMain {
	static IDepartmentService departmentService = new DepartmentServiceImpl();
	public static void menu() {
		boolean exit = false;
		while(true) {
			System.out.println("-----------Menu Department--------");
			System.out.println("1. Create department");
			System.out.println("2. Read all department");
			System.out.println("3. Search department by id");
			System.out.println("4. Serach department by name");
			System.out.println("5. Update name department");
			System.out.println("6. Delete department by id");
			System.out.println("7.Exit");
			System.out.println("Your choice");
			
			int choice = new Scanner(System.in).nextInt();
			switch (choice) {
				case 1:
					//Create
					Department department = departmentService.input();
					departmentService.create(department);
					break;
				
				case 2:
					// readAll
					readAll();
					break;
					
				case 3:
					//Search By id
					searchById();
					break;
					
				case 4:
					//Search By name
					searchByName();
					break;
					
				case 5:
					//update 1 đối tượng với id truyền vào, sửa tên của department
					update();
					break;
					
				case 6:
					// Xóa theo id
					delete();
					break;
				case 7:
					// exit
					System.out.println("-----------Exit-------------");
					exit = true;
					break;
					
				default :
					System.out.println("only enter 1 - 7");
					
			}
			if (exit == true) {
				break;
			}
		}
	}
	private static void delete() {
		System.out.println("Enter the number id of department to be deleted");
		int id = new Scanner(System.in).nextInt();
		boolean de =  departmentService.delete(id);
		if (de) {
			System.out.println("Delete successful!!!");
		} else {
			System.out.println("Delete fail!!!");
		}
		
	}
	private static void update() {
		System.out.println("--Enter the number id of department to be updated---");
		int id = new Scanner(System.in).nextInt();
		boolean ud = departmentService.update(id);
		
		if (ud == false) {
			System.out.println("Update fail!!!");
		} else {
			
			System.out.println("Update successful!!!");
		}
	}
	private static void searchByName() {
		System.out.println("--Enter name of department---");
		String name = new Scanner(System.in).nextLine().toUpperCase();
		List<Department> departments = departmentService.searchByName(name);
		if (departments.size() == 0) {
			System.out.println("Does not exist the department with name: " + name);
		} else {
			System.out.println("List of departments with name " + name + " :");
			for (Department d : departments) {
				System.out.println(d);
			}
		}
		
	}
	private static void searchById() {
		System.out.println("--Enter the id number of department---");
		int id = new Scanner(System.in).nextInt();
		Department department = departmentService.searchById(id);
		if (department == null) {
			System.out.println("Does not exist the department with the id number: " + id);
		} else {
			System.out.println("The department with the id number " + id + " : ");
			System.out.println(department);
			
		}
		
	}
	private static void readAll() {
		List<Department> departments = new ArrayList<>();
		departments = departmentService.readAll();
		
		if (departments.size() > 0) {
			System.out.println("---List of department---");
			for (Department d : departments) {
				System.out.println(d);
			}
		} else {
			System.out.println("List of empty departments");
		}
	}
}
