package dao;

import java.sql.SQLException;
import java.util.List;

import model.Product;

public interface ProductDao {
	
	void create (Product product) throws SQLException ;
	
	void update (Product product) throws SQLException ;
	
	void delete (int id) throws SQLException ;
	
	List<Product> readAll() throws SQLException ;
	
	List<Product> searchByName(String name) throws SQLException ;
	
	Product searchById(int id) throws SQLException ;
	
	List<Product> searchByPrice(double min,double max) throws SQLException;
	
	List<Product> searchByCategory(int id) throws SQLException;
}
