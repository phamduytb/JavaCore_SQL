package service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import model.Department;
import model.Employee;

public class FileService {
	
	// Ghi vào file danh sách Product
	public static void writeDepartmentList(List<Department> departments) {
		try {
			FileOutputStream outputStream = new FileOutputStream("DepartmentList.txt");
			ObjectOutputStream obj = new ObjectOutputStream(outputStream);
			obj.writeObject(departments);
			obj.flush();
			outputStream.flush();
			obj.close();
			outputStream.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Đọc danh sách Product từ file
	public static List<Department> readDepartmentList() {
		List<Department> departments = new ArrayList<>();
		File file = new File("DepartmentList.txt");
		if (file.exists()) {
			try {
				FileInputStream inputStream = new FileInputStream(file);
				ObjectInputStream obj = new ObjectInputStream(inputStream);
				departments = (List<Department>) obj.readObject();
				obj.close();
				inputStream.close();
				return departments;
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return new ArrayList<>();
	}
	
	// Ghi vào file danh sách Employee
		public static void writeEmployeeList(List<Employee> employees) {
			try {
				FileOutputStream outputStream = new FileOutputStream("EmployeeList.txt");
				ObjectOutputStream obj = new ObjectOutputStream(outputStream);
				obj.writeObject(employees);
				obj.flush();
				outputStream.flush();
				obj.close();
				outputStream.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// Đọc danh sách Employee từ file
		public static List<Employee> readEmployeetList() {
			List<Employee> employees = new ArrayList<>();
			File file = new File("EmployeeList.txt");
			if (file.exists()) {
				try {
					FileInputStream inputStream = new FileInputStream(file);
					ObjectInputStream obj = new ObjectInputStream(inputStream);
					employees = (List<Employee>) obj.readObject();
					obj.close();
					inputStream.close();
					return employees;
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			return new ArrayList<>();
		}
}
