package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Department;

public class DepartmentServiceImpl implements IDepartmentService{
	
	private IFileService fileService = new FileServiceImpl();

	private  List<Object> objects;
	
	// Bổ sung hàm khởi tạo ở đây để khi mới đầu chạy app, đọc luôn danh sách department từ file ra
//	public DepartmentServiceImpl() {
//		this.departments = FileService.readDepartmentList();
//	}
	
	// Nhập thông tin cho phòng ban
	@Override
	public Department input() {
		
		Department department = new Department();
		System.out.println("----Enter infomation of Department-----");
		// bổ sung bắt ngoại lệ nhập id chỉ được nhập số
		while (true) {
			try {
				System.out.println("Enter id: ");
				int id = new Scanner(System.in).nextInt();
				
				// Không cho phép nhạp id trùng với id đã tồn tại
				Department d = searchById(id);
				if (d == null) {
					department.setId(id);
					break;
					
				} else {
					System.out.println("The id already exists, please enter again!");
					continue;
				}
				
				
				
			} catch(Exception e) {
				System.out.println("Only numbers are allowed for id, please enter again!");
			}
		}
		
		System.out.println("Enter name: ");
		department.setName(new Scanner(System.in).nextLine().toUpperCase());
		return department;
	}

	// In thông tin phòng ban
	@Override
	public void info(Department department) {
		System.out.println("--------------");
		System.out.println(department);
	}

	// Tạo 1 phòng ban mới và lưu vào file
	@Override
	public void create(Department department) {
//		List<Object> objects = fileService.readToFile();
//		for (Object o : objects) {
//			if (o instanceof Department) {
//				departments.add(o);
//			}
//		}
//		
//		departments.add(department);
//		fileService.writeToFile(departments);
		
		objects = fileService.readToFile();
		objects.add(department);
		fileService.writeToFile(objects);
	}

	@Override
	public boolean update(int id) {
		Department d = searchById(id);
		if (d == null) {
			System.out.println("Does not exist the department with the id number: " + id);
			return false;
		} else {
			System.out.println("The department to be updated: ");
			System.out.println(d);
			System.out.println("Enter new name");
			String name = new Scanner(System.in).nextLine().toUpperCase();
			d.setName(name);
			fileService.writeToFile(objects);
			return true;
		}
		
		
	}

	@Override
	public boolean delete(int id) {
		Department d = searchById(id);
		if (d == null) {
			System.out.println("Does not exist the department with the id number: " + id);
			return false;
		} else {
			objects.remove(d);
			fileService.writeToFile(objects);
			return true;
		}
	}

	// Lọc danh sách phòng ban trong file danh sách các đối tượng
	@Override
	public List<Department> readAll() {
		objects = fileService.readToFile();
		List<Department> departments = new ArrayList<>();
		for (Object o : objects) {
			if (o instanceof Department) {
				departments.add((Department) o);
			}
		}
		return departments;
	}

	// Tìm kiếm phòng ban theo tên, phòng ban có thể có tên trùng nhau
	@Override
	public List<Department> searchByName(String name) {
		List<Department> departments = readAll();
		List<Department> departments2 = new ArrayList<>();
		for (Department d : departments) {
			if (name.equals(d.getName().toUpperCase())) {
				departments2.add(d);
			}
		}
		return departments2;
	}

	
	// Tìm kiếm phòng ban theo id, mỗi phingf ban có 1 id duy nhất
	@Override
	public Department searchById(int id) {
		List<Department> departments = readAll();
		for (Department d : departments) {
			if (id == d.getId()) {
				return d;
			}
		}
		return null;
	}
	
	
//	public List<Department> findDepartmentList() {
//		
//	}

}
