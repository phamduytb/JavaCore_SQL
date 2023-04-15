package repository;

import java.sql.SQLException;
import java.util.List;

import model.Employee;

public interface IEmployeeRepo {
	
	List<Employee> readAll() throws SQLException;
	
	List<Employee> searchByName(String name) throws SQLException;
	
	
	Employee searchById(int id) throws SQLException;
	
	
	
	void create(Employee e) throws SQLException;
	
	boolean update(Employee employee) throws SQLException;
	
	boolean delete(int id) throws SQLException;
}
