package service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Department;
import model.Employee;
import repository.EmployeeRepoImpl;
import repository.IEmployeeRepo;

public class EmployeeServiceImpl implements IEmployeeService{
	
	IDepartmentService departmentService = new DepartmentServiceImpl();
	
	IEmployeeRepo employeeRepo = new EmployeeRepoImpl();
	
	// Lựa chọn phòng ban cho nhân viên
	@Override
	public void choiceDepartment(Employee employee) throws SQLException {
		while (true) {
			try {
				System.out.println("Enter department id: ");
				
				int id = new Scanner(System.in).nextInt();
				
				Department department = departmentService.searchById(id);
				
				if (department != null) {
					employee.setDepartment(department);
					break;
				} else {
					System.out.println("Not exist department with id = " + id);
				}
				
			} catch(Exception e) {
				System.out.println("Only numbers are allowed for id, please enter again!");
			}
			
		}
		
		
	}

	@Override
	public Employee input() throws SQLException {
		Employee employee = new Employee();
		System.out.println("----Enter infomation of Employee-----");
		
		System.out.println("Enter name: ");
		employee.setName(new Scanner(System.in).nextLine().toUpperCase());
		
		while (true) {
			try {
				System.out.println("Enter age: ");
				
				int age = new Scanner(System.in).nextInt();
				
				employee.setAge(new Scanner(System.in).nextInt());
				break;
				
			} catch(Exception e) {
				System.out.println("Only numbers are allowed for id, please enter again!");
			}
			
		}
		
		
		choiceDepartment(employee);
		
		return employee;
	}

	@Override
	public void info(Employee e) {
		System.out.println("id : " + e.getId() + " | name: " + e.getName() + " |age: " + e.getAge() + " | department's name: " + e.getDepartment().getName());
		
	}

	@Override
	public List<Employee> readAll() throws SQLException {
		
		return employeeRepo.readAll();
	}

	@Override
	public List<Employee> searchByName(String name) throws SQLException {
		
		return employeeRepo.searchByName(name);
	}

	@Override
	public Employee searchById(int id) throws SQLException {
		return employeeRepo.searchById(id);
	}

	@Override
	public void create(Employee e) throws SQLException {
		employeeRepo.create(e);
	}

	@Override
	public boolean update(int id) throws SQLException {
		Employee e = searchById(id);
		
		if (e == null) {
			System.out.println("Does not exist the employee with the id number: " + id);
			return false;
		} else {
			System.out.println("The employee to be updated: ");
			info(e);
			
			System.out.println("Enter new name");
			String name = new Scanner(System.in).nextLine().toUpperCase();
			e.setName(name);
			
			System.out.println("Enter new age");
			int age = new Scanner(System.in).nextInt();
			e.setAge(age);
			
			System.out.println("Choice department");
			choiceDepartment(e);
			
			return employeeRepo.update(e);
		}
	}

	@Override
	public boolean delete(int id) throws SQLException {
		Employee e = searchById(id);
		if (e == null) {
			System.out.println("Does not exist the employee with the id number: " + id);
			return false;
		} else {
			return employeeRepo.delete(id);
		}
	}

	

}
