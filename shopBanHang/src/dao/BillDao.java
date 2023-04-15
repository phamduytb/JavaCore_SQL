package dao;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import model.Bill;
import model.ReportBill;

public interface BillDao {

	void create(Bill bill) throws SQLException;
	
	void update(Bill bill) throws SQLException;
	
	void delete(int id) throws SQLException;
	
	Bill searchById(int id) throws SQLException;
	
	List<Bill> searchByDate(Date start, Date end) throws SQLException;
	
	List<Bill> readAll() throws SQLException;
	
	List<Bill> searchByProduct(int id) throws SQLException;
	
	// Thống kê số lượng hóa đơn của của product
	List<ReportBill> reportBillByProduct() throws SQLException;
	
	// Thống kê đơn hàng theo tháng
	List<ReportBill> reportBillByMonth() throws SQLException;
	
	//Thống kê đơn hàng theo category
	List<ReportBill> reportBillByCategory() throws SQLException;
	
	// Tổng tiền hóa đơn theo tháng
	List<ReportBill> reportMoneyByMonth() throws SQLException;
	
	// Sản phẩm bán chạy theo tháng
	List<ReportBill> searchPopularProductByMonth(int month) throws SQLException;
	
}
