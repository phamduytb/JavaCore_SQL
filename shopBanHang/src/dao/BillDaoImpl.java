package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Bill;
import model.Product;

public class BillDaoImpl implements BillDao{
	ProductDao productDao = new ProductDaoImpl();

	@Override
	public void create(Bill bill) throws SQLException {
		
		String sql = "INSERT INTO bill(productId, productPrice, productQuantity, buyDate)"
				+ " VALUES (?, ?, ?, ?)";

		Connection connection = JDBCConection.getConnection();

		PreparedStatement statement = connection.prepareStatement(sql);

		statement.setInt(1, bill.getProduct().getProductId());
		
		statement.setDouble(2, bill.getProduct().getProductPrice());
		
		statement.setInt(3, bill.getProductQuantity());
		
		statement.setDate(4,new  java.sql.Date(bill.getBuyDate().getTime()));

		statement.executeUpdate();
	}
	
	@Override
	public void update(Bill bill) throws SQLException {
		
		String sql = " UPDATE bill SET productId = ?, productPrice = ?, "
				+ " productQuantity = ?, buyDate = ?"
				+ " WHERE billId = ?";
				

		Connection connection = JDBCConection.getConnection();

		PreparedStatement statement = connection.prepareStatement(sql);

		statement.setInt(1, bill.getProduct().getProductId());
		
		statement.setDouble(2, bill.getProduct().getProductPrice());
		
		statement.setInt(3, bill.getProductQuantity());
		
		statement.setDate(4,new  java.sql.Date(bill.getBuyDate().getTime()));
		
		statement.setInt(5, bill.getBillId());

		statement.executeUpdate();
	}

	@Override
	public void delete(int id) throws SQLException {
		String sql = "DELETE FROM bill WHERE billId = ?";

		Connection connection = JDBCConection.getConnection();

		PreparedStatement statement = connection.prepareStatement(sql);

		statement.setInt(1, id);

		statement.executeUpdate();
		
	}
	
	@Override
	public Bill searchById(int id) throws SQLException {
		String sql = "SELECT b.*, p.productName FROM  bill b JOIN product p"
				+ " ON b.productId = p.productId"
				+ " WHERE billId = ?";
	
		Connection connection = JDBCConection.getConnection();

		PreparedStatement statement = connection.prepareStatement(sql);
	
		statement.setInt(1, id);
		
		ResultSet rs = statement.executeQuery();
	
		while (rs.next()) {
			return readBillFromDB(rs);
		}
	
		return null;
	}

	@Override
	public List<Bill> searchByDate(Date start, Date end) throws SQLException {
		
		List<Bill> bills = new ArrayList<>();
		
		String sql = "SELECT b.*, p.productName FROM  bill b JOIN product p"
				+ " ON b.productId = p.productId "
				+ " WHERE buyDate >= ? AND buyDate <= ?"
				+ " ORDER BY buyDate DESC";
		
		Connection connection = JDBCConection.getConnection();

		PreparedStatement statement = connection.prepareStatement(sql);
		
		statement.setDate(1, new  java.sql.Date (start.getTime()));
		
		statement.setDate(2, new  java.sql.Date(end.getTime()));
		
		ResultSet rs = statement.executeQuery();
		
		while (rs.next()) {
			bills.add(readBillFromDB(rs));
		}
		
		return bills;
	}

	@Override
	public List<Bill> readAll() throws SQLException {
		
		List<Bill> bills = new ArrayList<>();
		
		String sql = "SELECT b.*, p.productName FROM  bill b JOIN product p"
					+ " ON b.productId = p.productId"
					+ " ORDER BY buyDate DESC";
		
		Connection connection = JDBCConection.getConnection();

		PreparedStatement statement = connection.prepareStatement(sql);
		
		
		ResultSet rs = statement.executeQuery();
		
		while (rs.next()) {
			bills.add(readBillFromDB(rs));
		}
		
		return bills;
	}
	
	private Bill readBillFromDB(ResultSet rs) throws SQLException {
		Bill bill = new Bill();
		
		bill.setBillId(rs.getInt("billId"));
		bill.setProductPrice(rs.getDouble("productPrice"));
		bill.setProductQuantity(rs.getInt("productQuantity"));
		bill.setBuyDate(rs.getDate("buyDate"));
		
		Product product = new Product();
		product.setProductId(rs.getInt("productId"));
		product.setProductName(rs.getString("productName"));
		
		bill.setProduct(product);
		
		return bill;
	}

	@Override
	public List<Bill> searchByProduct(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	

	

}
