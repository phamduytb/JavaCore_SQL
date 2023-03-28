package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Category;

public class CategoryDaoImpl implements CategoryDao {

	@Override
	public void create(Category category) throws SQLException {

		String sql = "INSERT INTO category(categoryName) VALUES (?)";

		Connection connection = JDBCConection.getConnection();

		PreparedStatement statement = connection.prepareStatement(sql);

		statement.setString(1, category.getCategoryName());

		statement.executeUpdate();
	}

	@Override
	public void update(Category category) throws SQLException {

		String sql = "UPDATE category SET categoryName = ? WHERE categoryId = ?";

		Connection connection = JDBCConection.getConnection();

		PreparedStatement statement = connection.prepareStatement(sql);

		statement.setString(1, category.getCategoryName());

		statement.setInt(2, category.getCategoryId());

		statement.executeUpdate();

	}

	@Override
	public void delete(int id) throws SQLException {

		String sql = "DELETE FROM category WHERE categoryId = ?";

		Connection connection = JDBCConection.getConnection();

		PreparedStatement statement = connection.prepareStatement(sql);

		statement.setInt(1, id);

		statement.executeUpdate();
	}

	@Override
	public List<Category> readAll() throws SQLException {

		List<Category> categories = new ArrayList<>();

		String sql = "SELECT * FROM category";

		Connection connection = JDBCConection.getConnection();

		PreparedStatement statement = connection.prepareStatement(sql);

		ResultSet rs = statement.executeQuery();

		while (rs.next()) {
			categories.add(readCategoryFromDB(rs));
		}

		return categories;
	}

	@Override
	public List<Category> searchByName(String name) throws SQLException {

		List<Category> categories = new ArrayList<>();

		String sql = "SELECT * FROM category WHERE categoryName LIKE ?";

		Connection connection = JDBCConection.getConnection();

		PreparedStatement statement = connection.prepareStatement(sql);

		statement.setString(1, "%" + name + "%");

		ResultSet rs = statement.executeQuery();

		while (rs.next()) {
			categories.add(readCategoryFromDB(rs));
		}
		return categories;
	}

	@Override
	public Category searchById(int id) throws SQLException {
		
		String sql = "SELECT * FROM category WHERE categoryId = ?";

		Connection connection = JDBCConection.getConnection();

		PreparedStatement statement = connection.prepareStatement(sql);
		
		statement.setInt(1, id);

		ResultSet rs = statement.executeQuery();
		
		while (rs.next()) {
			return readCategoryFromDB(rs);
		}
		
		return null;
	}

	private Category readCategoryFromDB(ResultSet rs) throws SQLException {

		Category category = new Category();

		category.setCategoryId(rs.getInt("categoryId"));

		category.setCategoryName(rs.getString("categoryName"));

		return category;
	}

}
