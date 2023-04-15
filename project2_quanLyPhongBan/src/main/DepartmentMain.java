package main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Department;
import model.Employee;
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
			System.out.println("7. Search lists of employees of department");
			System.out.println("8.Exit");
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
					searchEmployeeOfDepartment();
					break;
					
				case 8:
					// exit
					System.out.println("-----------Exit-------------");
					exit = true;
					break;
					
				default :
					System.out.println("only enter 1 - 8");
					
			}
			if (exit == true) {
				break;
			}
		}
	}
	private static void searchEmployeeOfDepartment() {
		try {
			readAll();
			System.out.println("---Enter the number id of department to search list employees---");
			int id = new Scanner(System.in).nextInt();
			List<Employee> employees =  departmentService.searchEmployeeOfDepartment(id);
			String deptName = departmentService.searchById(id).getName();
			if (employees.size() > 0) {
				System.out.println("---Lists of employee of " + deptName + " department:");
				for (Employee e : employees) {
					System.out.println(e);
				}
			} else {
				System.out.println("The " + deptName + " department no has employee");
			}
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private static void delete() {
		System.out.println("Enter the number id of department to be deleted");
		int id = new Scanner(System.in).nextInt();
		try {
			boolean de =  departmentService.delete(id);
			if (de) {
				System.out.println("Delete successful!!!");
			} else {
				System.out.println("Delete fail!!!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	private static void update() {
		System.out.println("--Enter the number id of department to be updated---");
		int id = new Scanner(System.in).nextInt();
		boolean ud;
		try {
			ud = departmentService.update(id);
			if (ud == false) {
				System.out.println("Update fail!!!");
			} else {
				
				System.out.println("Update successful!!!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	private static void searchByName() {
		System.out.println("--Enter name of department---");
		String name = new Scanner(System.in).nextLine().toUpperCase();
		List<Department> departments;
		try {
			departments = departmentService.searchByName(name);
			if (departments.size() == 0) {
				System.out.println("Does not exist the department with name: " + name);
			} else {
				System.out.println("List of departments with name " + name + " :");
				for (Department d : departments) {
					System.out.println(d);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private static void searchById() {
		System.out.println("--Enter the id number of department---");
		int id = new Scanner(System.in).nextInt();
		Department department;
		try {
			department = departmentService.searchById(id);
			if (department == null) {
			System.out.println("Does not exist the department with the id number: " + id);
			} else {
				System.out.println("The department with the id number " + id + " : ");
				System.out.println(department);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private static void readAll() {
		List<Department> departments = new ArrayList<>();
		try {
			departments = departmentService.readAll();
			if (departments.size() > 0) {
				System.out.println("---List of department---");
				for (Department d : departments) {
					System.out.println(d);
				}
			} else {
				System.out.println("List of empty departments");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
