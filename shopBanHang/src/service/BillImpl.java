package service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dao.BillDao;
import dao.BillDaoImpl;
import model.Bill;

public class BillImpl implements IBill{
	
	BillDao billDao = new BillDaoImpl();

	@Override
	public void create(Bill bill) {
		
		try {
			billDao.create(bill);
			System.out.println("Create bill success!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Create bill faild!");
		}
	}

	@Override
	public List<Bill> searchByDate(Date start, Date end) {
		
		try {
			return billDao.searchByDate(start, end);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new ArrayList<>();
	}

	@Override
	public List<Bill> readAll() {
		// TODO Auto-generated method stub
		try {
			return billDao.readAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new ArrayList<>();
	}

}
