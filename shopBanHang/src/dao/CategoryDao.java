package dao;

import java.sql.SQLException;
import java.util.List;

import model.Category;

public interface CategoryDao {
	
	void create (Category category) throws SQLException;
	
	void update (Category category) throws SQLException;
	
	void delete (int id) throws SQLException;
	
	List<Category> readAll() throws SQLException;
	
	List<Category> searchByName(String name) throws SQLException;
	
	Category searchById(int id) throws SQLException;
}
