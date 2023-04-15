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
import model.ReportBill;

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

	@Override
	public List<ReportBill> reportBillByProduct() throws SQLException {
		
		

		List<ReportBill> reportBills = new ArrayList<>();
		
		String sql = "SELECT p.productId, p.productName, COUNT(billId) AS total_bill" +
				" FROM product p LEFT JOIN bill b" +
				" ON p.productId = b.productId" +
				" GROUP BY p.productId";
		
		Connection connection = JDBCConection.getConnection();

		PreparedStatement statement = connection.prepareStatement(sql);
		
		
		ResultSet rs = statement.executeQuery();
		
		while (rs.next()) {
			ReportBill reportBill = new ReportBill();
			reportBill.settotalBill(rs.getLong("total_bill"));
			reportBill.setProductId(rs.getInt("productId"));
			reportBill.setProductName(rs.getString("productName"));
			reportBills.add(reportBill);
		}
		
		return reportBills;
	}

	@Override
	public List<ReportBill> reportBillByMonth() throws SQLException {
		
		List<ReportBill> reportBills = new ArrayList<>();
		
		String sql = "SELECT MONTH(buyDate) AS 'Month', COUNT(billId) AS total_bill" +
						" FROM bill GROUP BY MONTH(buyDate)";
		
		Connection connection = JDBCConection.getConnection();

		PreparedStatement statement = connection.prepareStatement(sql);
		
		
		ResultSet rs = statement.executeQuery();
		
		while (rs.next()) {
			ReportBill reportBill = new ReportBill();
			reportBill.settotalBill(rs.getLong("total_bill"));
			reportBill.setMonth(rs.getInt("Month"));
			
			reportBills.add(reportBill);
		}
		
		return reportBills;
	}

	@Override
	public List<ReportBill> reportBillByCategory() throws SQLException {

		List<ReportBill> reportBills = new ArrayList<>();
		
		String sql = "SELECT c.categoryId, c.categoryName, COUNT(billId) AS total_bill"
				+ " FROM category c LEFT JOIN product p ON c.categoryId = p.categoryId"
				+ " LEFT JOIN bill b ON p.productId = b.productId"
				+ " GROUP BY c.categoryId";
						
		
		Connection connection = JDBCConection.getConnection();

		PreparedStatement statement = connection.prepareStatement(sql);
		
		
		ResultSet rs = statement.executeQuery();
		
		while (rs.next()) {
			ReportBill reportBill = new ReportBill();
			reportBill.setCategoryId(rs.getInt("categoryId"));
			reportBill.setCategoryName(rs.getString("categoryName"));
			reportBill.setTotalBill(rs.getLong("total_bill"));
			
			reportBills.add(reportBill);
		}
		
		return reportBills;
	}

	@Override
	public List<ReportBill> reportMoneyByMonth() throws SQLException {

		List<ReportBill> reportBills = new ArrayList<>();
		
		String sql = "SELECT MONTH(buyDate) AS month, SUM(productQuantity * productPrice) AS total_month_money"
					+ " FROM bill"
					+ " GROUP BY MONTH(buyDate)";
				
						
		
		Connection connection = JDBCConection.getConnection();

		PreparedStatement statement = connection.prepareStatement(sql);
		
		
		ResultSet rs = statement.executeQuery();
		
		while (rs.next()) {
			ReportBill reportBill = new ReportBill();
			reportBill.setMonth(rs.getInt("month"));
			reportBill.setTotal_money(rs.getDouble("total_month_money"));
			
			
			reportBills.add(reportBill);
		}
		
		return reportBills;
	}

	@Override
	public List<ReportBill> searchPopularProductByMonth(int month) throws SQLException {

		List<ReportBill> reportBills = new ArrayList<>();
		
		String sql = "SELECT  MONTH(buyDate) AS month, p.productId, p.productName,  SUM(b.productQuantity) AS total_productBuy"
				+ " FROM product p JOIN bill b ON p.productId = b.productId"
				+ " WHERE MONTH(buyDate) = ?"
				+ " GROUP BY p.productId, MONTH(buyDate)"
				+ " ORDER BY SUM(b.productQuantity) DESC";
					
				
						
		
		Connection connection = JDBCConection.getConnection();

		PreparedStatement statement = connection.prepareStatement(sql);
		
		statement.setInt(1, month);
		
		ResultSet rs = statement.executeQuery();
		
		while (rs.next()) {
			ReportBill reportBill = new ReportBill();
			reportBill.setMonth(rs.getInt("month"));
			reportBill.setProductId(rs.getInt("productId"));
			reportBill.setProductName(rs.getString("productName"));
			reportBill.setTotal_product(rs.getLong("total_productBuy"));
			
			
			reportBills.add(reportBill);
		}
		
		return reportBills;
	}

	

	

}
