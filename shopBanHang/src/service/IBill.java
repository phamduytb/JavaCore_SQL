package service;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import model.Bill;

public interface IBill {
	
	void create(Bill bill);
	
	void update(Bill bill) ;
	
	void delete(int id) ;
	
	Bill searchById(int id);
	
	List<Bill> searchByDate(Date start, Date end);
	
	List<Bill> readAll();
}
