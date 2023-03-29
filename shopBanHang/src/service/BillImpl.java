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
	public void update(Bill bill) {
		
		try {
			billDao.update(bill);
			System.out.println("Update bill success!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Update bill faild!");
		}
	}

	@Override
	public void delete(int id) {
		
		try {
			billDao.delete(id);
			System.out.println("Delete bill success!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Delete bill faild!");
		}
	}
	
	@Override
	public Bill searchById(int id) {
		try {
			return billDao.searchById(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
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
