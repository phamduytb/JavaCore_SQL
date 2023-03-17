package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Result;

import model.Department;
import model.Employee;

public class DepartmentRepoImpl implements IDepartmentRepo{
	
	 
	@Override
	public void create(Department department) throws SQLException {
		// Vì trong databasse để id tự tăng nên không cần truyền id vào
		String sql = "INSERT INTO department(name) VALUES (?)";
		
		Connection conn = JDBCConnection.getConnection();
		
		PreparedStatement statement = conn.prepareStatement(sql);
		
		//1 là số thứ tự dấu hỏi chấm
		statement.setString(1, department.getName());
		
		// statement.executeUpdate thực hiện câu truy vấn, trả về số lượng bản ghi bị tác động trong cơ sở dữ liệu
		statement.executeUpdate();
		
	}

	@Override
	public List<Department> readAll() throws SQLException {
		List<Department> departments = new ArrayList();
		
		String sql = "SELECT id, name FROM department";
		
		Connection conn = JDBCConnection.getConnection();
		
		PreparedStatement statement = conn.prepareStatement(sql);
		
		//ResultSet Trả về bảng trong CSDL
		ResultSet rs =statement.executeQuery();
		
		while (rs.next()) { // Đọc từng row trong bảng, mỗi row ứng 1 đối tượng trong java
			Department department = new Department();
			department.setId(rs.getInt("id")); // id là tên cột , thay id bằng 1 cũng được
			department.setName(rs.getString("name"));
			departments.add(department);
		}
		
		return departments;
	}

	@Override
	public List<Department> searchByName(String name) throws SQLException {
		List<Department> departments = new ArrayList();
		
		String sql = "SELECT id, name FROM department WHERE name LIKE ?";
		
		Connection conn = JDBCConnection.getConnection();
		
		PreparedStatement statement = conn.prepareStatement(sql);
		
		statement.setString(1,name);
		
		//ResultSet Trả về bảng trong CSDL
		ResultSet rs =statement.executeQuery();
		
		while (rs.next()) { // Đọc từng row trong bảng, mỗi row ứng 1 đối tượng trong java
			Department department = new Department();
			department.setId(rs.getInt("id")); // id là tên cột , thay id bằng 0 cũng được
			department.setName(rs.getString("name"));
			departments.add(department);
		}
		
		return departments;
	}

	@Override
	public Department searchById(int id) throws SQLException {
		
		
		String sql = "SELECT id, name FROM department WHERE id = ?";
		
		Connection conn = JDBCConnection.getConnection();
		
		PreparedStatement statement = conn.prepareStatement(sql);
		
		statement.setInt(1,id);
		
		//ResultSet trả về bảng trong CSDL
		ResultSet rs =statement.executeQuery();
		
		while (rs.next()) { // Đọc từng row trong bảng, mỗi row ứng 1 đối tượng trong java
			Department department = new Department();
			department.setId(rs.getInt("id")); // id là tên cột , thay id bằng 1 cũng được
			department.setName(rs.getString("name"));
			return department;
		}
		return null;
		
	}

	@Override
	public boolean update(Department department) throws SQLException {
		String sql = "UPDATE department SET name = ? WHERE id = ?";
		Connection conn = JDBCConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(sql);
		
		statement.setString(1, department.getName());
		statement.setInt(2, department.getId());
	
		int ex = statement.executeUpdate();
		
		
		
		// statement.executeUpdate() > 0 có bản ghi bị tác động trả về true, không có bản ghi bị tác động trả về false
		return ex > 0;
	}

	@Override
	public boolean delete(int id) throws SQLException {
		String sql = "DELETE FROM department WHERE id = ?";
		Connection conn = JDBCConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(sql);
		
		statement.setInt(1, id);
	
		int ex = statement.executeUpdate();
		
		return ex > 0;
		
	}
	
	@Override
	public List<Employee> searchEmployeeOfDepartment(int DeptId) throws SQLException {
		
		List<Employee> employees = new ArrayList<>();
		
		String sql = "SELECT  d.name AS DeptName, e.id, e.name, e.age"
				+ " FROM employee e JOIN department d ON e.DeptId = d.id"
				+ " WHERE e.DeptId = ?";
		
		Connection conn = JDBCConnection.getConnection();
		
		PreparedStatement statement = conn.prepareStatement(sql);
		
		statement.setInt(1, DeptId);
		
		ResultSet rs = statement.executeQuery();
		
		while (rs.next()) {
			Employee employee = new Employee();
			
			Department department = new Department();
			department.setId(DeptId);
			department.setName(rs.getString("DeptName"));
			employee.setDepartment(department);
			
			employee.setId(rs.getInt("id"));
			employee.setName(rs.getString("name"));
			employee.setAge(rs.getInt("age"));
			
			
			
			employees.add(employee);
			
		}
		return employees;
		
	}

}
