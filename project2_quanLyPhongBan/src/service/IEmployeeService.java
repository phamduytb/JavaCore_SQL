package service;

import java.util.List;

import model.Department;
import model.Employee;

public interface IEmployeeService {
	
	//Lựa chọn phòng ban cho nhân viên
	void choiceDepartment(Employee e);
	
	Employee input();
	
	void info(Employee e);
	
	List<Employee> readAll();
	
	List<Employee> searchByName(String name);
	
	
	Employee searchById(int id);
	
	void create(Employee e);
	
	boolean update(int id);
	
	boolean delete(int id);
}
