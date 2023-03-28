package service;

import java.util.Date;
import java.util.List;

import model.Bill;

public interface IBill {
	
	void create(Bill bill);
	
	List<Bill> searchByDate(Date start, Date end);
	
	List<Bill> readAll();
}
