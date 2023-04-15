package service;

import java.sql.SQLException;
import java.util.List;

import model.Department;
import model.Employee;

public interface IEmployeeService {
	
	//Lựa chọn phòng ban cho nhân viên
	void choiceDepartment(Employee e) throws SQLException;
	
	Employee input() throws SQLException;
	
	void info(Employee e);
	
	List<Employee> readAll() throws SQLException;
	
	List<Employee> searchByName(String name) throws SQLException;
	
	
	Employee searchById(int id) throws SQLException;
	
	void create(Employee e) throws SQLException;
	
	boolean update(int id) throws SQLException;
	
	boolean delete(int id) throws SQLException;
	
	
}
