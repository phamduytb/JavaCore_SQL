package repository;

import java.sql.SQLException;
import java.util.List;

import model.Department;
import model.Employee;

public interface IDepartmentRepo {
//	Department input();
//	
//	void info(Department department);
	
	void create(Department department) throws SQLException;
	
	List<Department> readAll() throws SQLException;
	
	List<Department> searchByName(String name) throws SQLException;
	
	List<Employee> searchEmployeeOfDepartment(int DeptId) throws SQLException;
	
	Department searchById(int id) throws SQLException;
	
	boolean update(Department department) throws SQLException;
	
	boolean delete(int id) throws SQLException;
	
	
}
