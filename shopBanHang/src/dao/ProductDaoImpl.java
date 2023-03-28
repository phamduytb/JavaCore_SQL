package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Category;
import model.Product;

public class ProductDaoImpl implements ProductDao{
	
	CategoryDao categoryDao = new CategoryDaoImpl();

	@Override
	public void create(Product product) throws SQLException {
		
		String sql = "INSERT INTO product(productName, productQuantity, productPrice, categoryId) "
				+ "VALUES(?, ?, ?, ?)";
		
		Connection connection = JDBCConection.getConnection();
		
		PreparedStatement statement = connection.prepareStatement(sql);
		
		statement.setString(1, product.getProductName());
		
		statement.setInt(2, product.getProductQuantity());
		
		statement.setDouble(3, product.getProductPrice());
		
		statement.setInt(4, product.getCategory().getCategoryId());
		
		statement.executeUpdate();
	}

	@Override
	public void update(Product product) throws SQLException {
		
		String sql = "UPDATE product SET productName = ?, productQuantity = ?, productPrice = ?, categoryId = ? WHERE productId = ?";
				
		
		Connection connection = JDBCConection.getConnection();
		
		PreparedStatement statement = connection.prepareStatement(sql);
		
		statement.setString(1, product.getProductName());
		
		statement.setInt(2, product.getProductQuantity());
		
		statement.setDouble(3, product.getProductPrice());
		
		statement.setInt(4, product.getCategory().getCategoryId());
		
		statement.setInt(5, product.getProductId());
		
		statement.executeUpdate();
	}

	@Override
	public void delete(int id) throws SQLException {
		
		String sql = "DELETE FROM product WHERE productId = ?";
				
		
		Connection connection = JDBCConection.getConnection();
		
		PreparedStatement statement = connection.prepareStatement(sql);
		
		
		statement.setInt(1, id);
		
		statement.executeUpdate();
	}

	@Override
	public List<Product> readAll() throws SQLException {
		
		List<Product> products = new ArrayList<>();
		
		String sql = "SELECT p.*  FROM product p ";
		
		Connection connection = JDBCConection.getConnection();
		
		PreparedStatement statement = connection.prepareStatement(sql);
		
		ResultSet rs = statement.executeQuery();
		
		while (rs.next()) {
			
			Product product = getProductFromDB(rs);
			
			products.add(product);
		}
		
		return products;
	}

	

	@Override
	public List<Product> searchByName(String name) throws SQLException {
		
		List<Product> products = new ArrayList<>();
		
		String sql = "SELECT *  FROM product WHERE productName LIKE ? ";
		
		Connection connection = JDBCConection.getConnection();
		
		PreparedStatement statement = connection.prepareStatement(sql);
		
		statement.setString(1, "%" + name + "%");
		
		ResultSet rs = statement.executeQuery();
		
		while (rs.next()) {
			
			Product product = getProductFromDB(rs);
			
			products.add(product);
		}
		
		return products;
	}

	@Override
	public Product searchById(int id) throws SQLException {

		List<Product> products = new ArrayList<>();
		
		String sql = "SELECT *  FROM product WHERE productId = ? ";
		
		Connection connection = JDBCConection.getConnection();
		
		PreparedStatement statement = connection.prepareStatement(sql);
		
		statement.setInt(1, id);
		
		ResultSet rs = statement.executeQuery();
		
		while (rs.next()) {
			
			Product product = getProductFromDB(rs);
			
			return product;
		}
		return null;
	}

	@Override
	public List<Product> searchByPrice(double min, double max) throws SQLException {

		List<Product> products = new ArrayList<>();
		
		String sql = "SELECT *  FROM product WHERE productPrice >= ? AND  productPrice <= ?";
		
		Connection connection = JDBCConection.getConnection();
		
		PreparedStatement statement = connection.prepareStatement(sql);
		
		statement.setDouble(1,min);
		
		statement.setDouble(2,max);
		
		ResultSet rs = statement.executeQuery();
		
		while (rs.next()) {
			
			Product product = getProductFromDB(rs);
			
			products.add(product);
		}
		
		return products;
	}

	@Override
	public List<Product> searchByCategory(int id) throws SQLException {

		List<Product> products = new ArrayList<>();
		
		String sql = "SELECT p.* "
				+ " FROM product p JOIN category c"
				+ " ON p.categoryId = c.categoryId"
				+ " WHERE c.categoryId = ?";
		
		Connection connection = JDBCConection.getConnection();
		
		PreparedStatement statement = connection.prepareStatement(sql);
		
		statement.setInt(1, id);
		
		ResultSet rs = statement.executeQuery();
		
		while (rs.next()) {
			
			Product product = getProductFromDB(rs);
			
			products.add(product);
		}
		
		return products;
	}
	
	private Product getProductFromDB(ResultSet rs) throws SQLException {
		
		Product product = new Product();
		
		product.setProductId(rs.getInt("productId"));
		
		product.setProductName(rs.getString("productName"));
		
		product.setProductPrice(rs.getDouble("productPrice"));
		
		product.setProductQuantity(rs.getInt("productQuantity"));
		
		Category category = new Category();
		
		category = categoryDao.searchById(rs.getInt("categoryId"));
		product.setCategory(category);
		
		return product;
	}
	
}
