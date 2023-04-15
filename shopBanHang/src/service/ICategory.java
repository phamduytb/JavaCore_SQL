package service;

import java.sql.SQLException;
import java.util.List;

import model.Category;

public interface ICategory {
	
	void create (Category category) ;
	
	void update (Category category) ;
	
	void delete (int id) ;
	
	List<Category> readAll() ;
	
	List<Category> searchByName(String name) ;
	
	Category searchById(int id) ;
}
