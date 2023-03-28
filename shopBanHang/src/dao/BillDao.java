package dao;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import model.Bill;

public interface BillDao {

	void create(Bill bill) throws SQLException;
	
	List<Bill> searchByDate(Date start, Date end) throws SQLException;
	
	List<Bill> readAll() throws SQLException;
}
