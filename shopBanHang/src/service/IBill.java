package service;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import model.Bill;
import model.ReportBill;

public interface IBill {
	
	void create(Bill bill);
	
	void update(Bill bill) ;
	
	void delete(int id) ;
	
	Bill searchById(int id);
	
	List<Bill> searchByDate(Date start, Date end);
	
	List<Bill> readAll();
	
	// Thống kê số lượng hóa đơn của của product
		List<ReportBill> reportBillByProduct() ;
		
		// Thống kê đơn hàng theo tháng
		List<ReportBill> reportBillByMonth() ;
		
		//Thống kê đơn hàng theo category
		List<ReportBill> reportBillByCategory() ;
		
		// Tổng tiền hóa đơn theo tháng
		List<ReportBill> reportMoneyByMonth() ;
		
		// Sản phẩm bán chạy theo tháng
		List<ReportBill> searchPopularProductByMonth(int month) ;
}
