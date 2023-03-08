package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Department;
import model.Employee;
import service.DepartmentServiceImpl;
import service.EmployeeServiceImpl;
import service.IDepartmentService;
import service.IEmployeeService;

public class EmployeeMain {
	static IEmployeeService employeeService = new EmployeeServiceImpl();
	public static void menu() {
		boolean exit = false;
		while(true) {
			System.out.println("-----------Menu Employee--------");
			System.out.println("1. Create employee");
			System.out.println("2. Read all employee");
			System.out.println("3. Serach employee by id");
			System.out.println("4. Serach employee by name");
			System.out.println("5. Update name employee");
			System.out.println("6. Delete employee by id");
			System.out.println("7.Exit");
			System.out.println("Your choice");
			
			int choice = new Scanner(System.in).nextInt();
			switch (choice) {
				case 1:
					//Create
					Employee employee = employeeService.input();
					employeeService.create(employee);
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
					//update 1 đối tượng với id truyền vào, sửa tên của employee
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
		System.out.println("Enter the number id of employee to be deleted");
		int id = new Scanner(System.in).nextInt();
		boolean de =  employeeService.delete(id);
		if (de) {
			System.out.println("Delete successful!!!");
		} else {
			System.out.println("Delete fail!!!");
		}
		
	}
	private static void update() {
		System.out.println("--Enter the number id of employee to be updated---");
		int id = new Scanner(System.in).nextInt();
		boolean ud = employeeService.update(id);
		
		if (ud == false) {
			System.out.println("Update fail!!!");
		} else {
			
			System.out.println("Update successful!!!");
		}
	}
	private static void searchByName() {
		System.out.println("--Enter name of employee---");
		String name = new Scanner(System.in).nextLine().toUpperCase();
		List<Employee> employees = employeeService.searchByName(name);
		if (employees.size() == 0) {
			System.out.println("Does not exist the employee with name: " + name);
		} else {
			System.out.println("List of employees with name " + name + " :");
			for (Employee e : employees) {
				employeeService.info(e);
			}
		}
		
	}
	private static void searchById() {
		System.out.println("--Enter the id number of employee---");
		int id = new Scanner(System.in).nextInt();
		Employee employee = employeeService.searchById(id);
		if (employee == null) {
			System.out.println("Does not exist the employee with the id number: " + id);
		} else {
			System.out.println("The employee with the id number " + id + " : ");
			employeeService.info(employee);
			
		}
		
	}
	private static void readAll() {
		List<Employee> employees = new ArrayList<>();
		employees = employeeService.readAll();
		
		if (employees.size() > 0) {
			System.out.println("---List of employee---");
			for (Employee d : employees) {
				employeeService.info(d);
			}
		} else {
			System.out.println("List of empty employees");
		}
	}
}
