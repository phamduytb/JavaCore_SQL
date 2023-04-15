package service;

import java.sql.SQLException;
import java.util.List;

import model.Department;
import model.Employee;

// CRUD : Create, Read, Update, Delete
public interface IDepartmentService {
	
	Department input();
	
	void info(Department department);
	
	void create(Department department);
	
	List<Department> readAll() throws SQLException;
	
	List<Department> searchByName(String name) throws SQLException;
	
	List<Employee> searchEmployeeOfDepartment(int DeptId) throws SQLException;
	
	
	Department searchById(int id) throws SQLException;
	
	boolean update(int id) throws SQLException;
	
	boolean delete(int id) throws SQLException;
	
	
}
