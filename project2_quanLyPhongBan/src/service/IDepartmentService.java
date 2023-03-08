package service;

import java.util.List;

import model.Department;

// CRUD : Create, Read, Update, Delete
public interface IDepartmentService {
	
	Department input();
	
	void info(Department department);
	
	void create(Department department);
	
	List<Department> readAll();
	
	List<Department> searchByName(String name);
	
	
	Department searchById(int id);
	
	boolean update(int id);
	
	boolean delete(int id);
}
