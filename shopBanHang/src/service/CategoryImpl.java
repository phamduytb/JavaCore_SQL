package service;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.CategoryDao;
import dao.CategoryDaoImpl;
import model.Category;

public class CategoryImpl implements ICategory{
	
	CategoryDao categoryDao = new CategoryDaoImpl();

	@Override
	public void create(Category category)   {
		
		try {
			categoryDao.create(category);
			System.out.println("Create category success!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Create category faild!");
		}
	}

	@Override
	public void update(Category category)   {
		System.out.println("Enter new name of category");
		String name = new Scanner(System.in).nextLine();
		category.setCategoryName(name);
		try {
			categoryDao.update(category);
			System.out.println("Update category success!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Update category faild!");
		}
	}

	@Override
	public void delete(int id)   {
		
		try {
			categoryDao.delete(id);
			System.out.println("Delete category success!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Delete category faild!");
		}
	}

	@Override
	public List<Category> readAll()   {
		
		try {
			return categoryDao.readAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ArrayList<>();
	}

	@Override
	public List<Category> searchByName(String name)   {
		
		try {
			
			return categoryDao.searchByName(name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ArrayList<>();
	}

	@Override
	public Category searchById(int id)   {
		
		try {
			return categoryDao.searchById(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
}
