package repository;/*
java by nsotien tv .......
Name : nsotien
Time : 16:07
Date : 21/11/2022
*/

import entity.Bill;
import entity.Category;
import entity.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BillRepository {


    public void createBill(Bill bill) throws SQLException {
        String sql = "INSERT INTO bill( quantity,price,buydate,product_id ) VALUES (?,?,?,?)";
        Connection connection = JDBC.getConnect();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, bill.getQuantity());
        preparedStatement.setDouble(2, bill.getPrice());
        preparedStatement.setDate(2, new Date(bill.getBuyDate().getTime())); // xem lại chỗ này
        preparedStatement.setInt(4, bill.getProduct().getId());
        preparedStatement.executeUpdate();

        //sau khi create bill load lai so luong product
        int loadProduct = bill.getProduct().getQuantity() - bill.getQuantity();
        ProductRepository productRepository = new ProductRepository();
        productRepository.updateQuantity(bill.getProduct().getId(), loadProduct);
    }

    public List<Bill> findBuyDate(Date fromDate, Date toDate) throws SQLException {
        String sql = "SELECT bill.*, product.name FROM bill INNER JOIN product ON bill.product_id = product.id WHERE buyDate >= ? AND buyDate <= ? ORDER BY buyDate ASC";
        Connection connection = JDBC.getConnect();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setDate(1, new Date(fromDate.getTime()));
        preparedStatement.setDate(2, new Date(toDate.getTime()));
        ResultSet rs = preparedStatement.executeQuery();
        List<Bill> billList = new ArrayList<Bill>();
        while (rs.next()) {
            Bill bill = new Bill();
            bill.setId(rs.getInt("id"));
            bill.setQuantity(rs.getInt("quantity"));
            bill.setPrice(rs.getDouble("price"));
            bill.setBuyDate(rs.getDate("buydate"));

            Product product = new Product();
            product.setId(rs.getInt("id"));
            product.setName(rs.getString("name"));

            bill.setProduct(product);

            billList.add(bill);
        }
        return billList;
    }

    public Product getIdProduct(int id) throws SQLException {
        String sql = "SELECT * FROM product WHERE id = ?";
        Connection connection = JDBC.getConnect();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Category category = new Category();
            category.setId(resultSet.getInt("category_id"));
            Product product = new Product();
            product.setId(resultSet.getInt("id"));
            product.setName(resultSet.getString("name"));
            product.setQuantity(resultSet.getInt("quantity"));
            product.setPrice(resultSet.getDouble("price"));
            product.setCategory(category);
            return product;
        }
        return null;
    }
}
