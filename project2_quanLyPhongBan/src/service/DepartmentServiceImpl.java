package service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Department;
import model.Employee;
import repository.DepartmentRepoImpl;
import repository.IDepartmentRepo;

public class DepartmentServiceImpl implements IDepartmentService{
	
	IDepartmentRepo departmentRepo = new DepartmentRepoImpl();
	
	// Nhập thông tin cho phòng ban
	@Override
	public Department input() {
		
		Department department = new Department();
		System.out.println("----Enter infomation of Department-----");
		
		// Nhập d khi database trường id không để tự tăng
		// bổ sung bắt ngoại lệ nhập id chỉ được nhập số
//		while (true) {
//			try {
//				System.out.println("Enter id: ");
//				int id = new Scanner(System.in).nextInt();
//				
//				
//				Department d = searchById(id);
//				if (d == null) {
//					department.setId(id);
//					break;
//					
//				} else {
//					System.out.println("The id already exists, please enter again!");
//					continue;
//				}
//				
//				
//				
//			} catch(Exception e) {
//				System.out.println("Only numbers are allowed for id, please enter again!");
//			}
//		}
		
		System.out.println("Enter name: ");
		department.setName(new Scanner(System.in).nextLine().toUpperCase());
		return department;
	}

	// In thông tin phòng ban
	@Override
	public void info(Department department) {
		System.out.println("--------------");
		System.out.println(department);
	}

	
	@Override
	public void create(Department department) {
		try {
			departmentRepo.create(department);
			System.out.println("Create Success!");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public boolean  update(int id) throws SQLException {
		Department d = searchById(id);
		if (d == null) {
			System.out.println("Does not exist the department with the id number: " + id);
			return false;
		} else {
			System.out.println("The department to be updated: ");
			System.out.println(d);
			System.out.println("Enter new name");
			String name = new Scanner(System.in).nextLine().toUpperCase();
			d.setName(name);
			
			return departmentRepo.update(d);
		}
		
		
	}

	@Override
	public boolean delete(int id) throws SQLException {
		
		return departmentRepo.delete(id);
	}

	
	@Override
	public List<Department> readAll() throws SQLException {
		
		return departmentRepo.readAll();
	}

	// Tìm kiếm phòng ban theo tên, phòng ban có thể có tên trùng nhau
	@Override
	public List<Department> searchByName(String name) throws SQLException {
		
		return departmentRepo.searchByName(name);
	}

	
	// Tìm kiếm phòng ban theo id, mỗi phingf ban có 1 id duy nhất
	@Override
	public Department searchById(int id) throws SQLException {
		
		return departmentRepo.searchById(id);
	}
	
	@Override
	public List<Employee> searchEmployeeOfDepartment(int DeptId) throws SQLException {
		
		return departmentRepo.searchEmployeeOfDepartment(DeptId);
	}

}
