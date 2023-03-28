package service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.ProductDao;
import dao.ProductDaoImpl;
import model.Product;

public class ProductImpl implements IProduct{

	ProductDao productDao = new ProductDaoImpl();
	@Override
	public void create(Product product) {
		
		try {
			productDao.create(product);
			System.out.println("Create success!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Create faild!");
		}
	}

	
	@Override
	public void update(Product product) {
		
		try {
			productDao.update(product);
			System.out.println("Update success!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Update faild!");
		}
	}

	@Override
	public void delete(int id) {
		Product product = searchById(id);
		
		if (product == null) {
			System.out.println("No exist product with the id number " + id);
		} else {
			try {
				productDao.delete(id);
				System.out.println("Delete success!");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Delete faild!");
			}
		}
		
	}

	@Override
	public List<Product> readAll() {
		
		try {
			return productDao.readAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ArrayList<>();
	}

	@Override
	public List<Product> searchByName(String name) {

		try {
			return productDao.searchByName(name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ArrayList<>();
	}

	@Override
	public Product searchById(int id) {
		
		try {
			return productDao.searchById(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Product> searchByPrice(double min, double max) {
		// TODO Auto-generated method stub
		try {
			return productDao.searchByPrice(min, max);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new ArrayList<>();
	}

	@Override
	public List<Product> searchByCategory(int id) {
		// TODO Auto-generated method stub
		try {
			return productDao.searchByCategory(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new ArrayList<>();
	}

}
