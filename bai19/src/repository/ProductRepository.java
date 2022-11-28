package repository;/*
java by nsotien tv .......
Name : nsotien
Time : 16:06
Date : 21/11/2022
*/

import entity.Category;
import entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    public void createProduct() throws SQLException {
        String sql = "INSERT INTO product(name,quantity,price,category_id) VALUES (?,?,?,?)";
        Connection connection = JDBC.getConnect();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        Product product = new Product();
        preparedStatement.setString(1, product.getName());
        preparedStatement.setInt(2, product.getQuantity());
        preparedStatement.setDouble(3, product.getPrice());
        preparedStatement.setInt(4, product.getCategory().getId());
        preparedStatement.executeUpdate();
    }


    public void updateProduct() throws SQLException {
        String sql = "UPDATE product SET name = ?,quantity = ?,price = ?,category_id = ? WHERE id = ?";
        Connection connection = JDBC.getConnect();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        Product product = new Product();
        preparedStatement.setString(1, product.getName());
        preparedStatement.setInt(2, product.getQuantity());
        preparedStatement.setDouble(3, product.getPrice());
        preparedStatement.setInt(4, product.getCategory().getId());
        preparedStatement.setInt(5, product.getId());
        preparedStatement.executeUpdate();
    }


    public void deleteProduct(int id) throws SQLException {
        String sql = "DELETE FROM product WHERE id = ?";
        Connection connection = JDBC.getConnect();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        Product product = new Product();
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
    }

    public List<Product> searchProduct(String name) throws SQLException {
        String sql = "SELECT * FROM product WHERE name LIKE ?";
        Connection connection = JDBC.getConnect();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "%" + name + "%");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Product> productList = new ArrayList<>();
        while (resultSet.next()) {
            Category category = new Category();
            category.setId(resultSet.getInt("category_id"));
            Product product = new Product();
            product.setId(resultSet.getInt("id"));
            product.setName(resultSet.getString("name"));
            product.setQuantity(resultSet.getInt("quantity"));
            product.setPrice(resultSet.getDouble("price"));
            product.setCategory(category);

            productList.add(product);
        }
        return productList;
    }

    public void updateQuantity(int id, int quantity) throws SQLException {
        String sql = "UPDATE product SET quantity = ? WHERE id = ?";
        Connection connection = JDBC.getConnect();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, quantity);
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();
    }

    public Category getIdCategory(int id) throws SQLException {
        String sql = "SELECT * FROM category WHERE id = ?";
        Connection connection = JDBC.getConnect();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Category category = new Category();
            category.setId(resultSet.getInt("id"));
            category.setName(resultSet.getString("name"));
            return category;
        }
        return null;
    }
}
