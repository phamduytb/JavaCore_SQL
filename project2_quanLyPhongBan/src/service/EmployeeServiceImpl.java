package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Department;
import model.Employee;

public class EmployeeServiceImpl implements IEmployeeService{
	IDepartmentService departmentService = new DepartmentServiceImpl();
	List<Object> objects;
	IFileService fileService = new FileServiceImpl();
	
	// Lựa chọn phòng ban cho nhân viên
	@Override
	public void choiceDepartment(Employee e) {
		System.out.println("---List of department name---");
		List<Department> departments = departmentService.readAll();
		for (Department d : departments) {
			System.out.println(d.getName());
		}
		boolean exit = false;
		while (true) {
			System.out.println("---Choice department---");
			String name = new Scanner(System.in).nextLine().toUpperCase();
			for (Department d : departments) {
				if (d.getName().equalsIgnoreCase(name)) {
					e.setDepartment(d);
					exit = true;
					break;
				}
			}
			if (!exit) {
				System.out.println("Department name does not exist, please choice department again!!!");
			} else {
				break;
			}
		}
		
		
	}

	@Override
	public Employee input() {
		Employee employee = new Employee();
		System.out.println("----Enter infomation of Employee-----");
		
		while (true) {
			try {
				System.out.println("Enter id: ");
				int id = new Scanner(System.in).nextInt();
				
				// Không cho phép nhạp id trùng với id đã tồn tại
				Employee em = searchById(id);
				if (em == null) {
					employee.setId(id);
					break;
					
				} else {
					System.out.println("The id already exists, please enter again!");
					continue;
				}
				
				
				
			} catch(Exception e) {
				System.out.println("Only numbers are allowed for id, please enter again!");
			}
		}
		
		System.out.println("Enter name: ");
		employee.setName(new Scanner(System.in).nextLine().toUpperCase());
		choiceDepartment(employee);
		return employee;
	}

	@Override
	public void info(Employee e) {
		System.out.println("id : " + e.getId() + " | name: " + e.getName() + " | department's name: " + e.getDepartment().getName());
		
	}

	@Override
	public List<Employee> readAll() {
		List<Employee> employees = new ArrayList<>();
		objects = fileService.readToFile();
		for (Object o : objects) {
			if (o instanceof Employee) {
				employees.add((Employee)o);
			}
		}
		return employees;
	}

	@Override
	public List<Employee> searchByName(String name) {
		List<Employee> employees = readAll();
		List<Employee> employees1 = new ArrayList<>();
		for (Employee e : employees) {
			if (e.getName().equalsIgnoreCase(name)) {
				employees1.add(e);
			}
		}
		return employees1;
	}

	@Override
	public Employee searchById(int id) {
		List<Employee> employees = readAll();
		
		for (Employee e : employees) {
			if (e.getId() == id) {
				return e;
			}
		}
		return null;
	}

	@Override
	public void create(Employee e) {
		objects = fileService.readToFile();
		objects.add(e);
		fileService.writeToFile(objects);
	}

	@Override
	public boolean update(int id) {
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
			System.out.println("Choice department's name");
			choiceDepartment(e);
			fileService.writeToFile(objects);
			return true;
		}
	}

	@Override
	public boolean delete(int id) {
		Employee e = searchById(id);
		if (e == null) {
			System.out.println("Does not exist the employee with the id number: " + id);
			return false;
		} else {
			objects.remove(e);
			fileService.writeToFile(objects);
			return true;
		}
	}

}
