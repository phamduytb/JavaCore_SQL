package service;

import java.util.List;

import model.Product;

public interface IProduct {
	
	void create (Product product) ;
	
	void update (Product product) ;
	
	void delete (int id) ;
	
	List<Product> readAll() ;
	
	List<Product> searchByName(String name) ;
	
	Product searchById(int id) ;
	
	List<Product> searchByPrice(double min,double max);
	
	List<Product> searchByCategory(int id);
}
