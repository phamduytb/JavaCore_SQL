package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Department;
import model.Employee;

public class EmployeeRepoImpl implements IEmployeeRepo{
	IDepartmentRepo departmentRepo = new DepartmentRepoImpl();

	@Override
	public List<Employee> readAll() throws SQLException {
		List<Employee> employees = new ArrayList<>();
		
		String sql = "SELECT e.*, d.name AS DeptName "
					+ "FROM employee e JOIN department d"
					+ " ON e.DeptId = d.id";
		
		Connection conn = JDBCConnection.getConnection();
		
		PreparedStatement statement = conn.prepareStatement(sql);
		
		ResultSet rs = statement.executeQuery();
		
		while (rs.next()) {
			
			employees.add(rowMapper(rs));
		}
		return employees;
	}

	@Override
	public List<Employee> searchByName(String name) throws SQLException {
		List<Employee> employees = new ArrayList<>();
		
		String sql = "SELECT e.*, d.name AS DeptName FROM employee e JOIN department d"
				+ " ON e.DeptId = d.id"
				+ " WHERE e.name LIKE ?";
		
		Connection conn = JDBCConnection.getConnection();
		
		PreparedStatement statement = conn.prepareStatement(sql);
		
		statement.setString(1, "%" + name + "%");
		
		ResultSet rs = statement.executeQuery();
		
		while (rs.next()) {

			employees.add(rowMapper(rs));
		}
		return employees;
	}

	@Override
	public Employee searchById(int id) throws SQLException {
		Employee employee = new Employee();
		
		String sql = "SELECT e.*, d.name AS DeptName FROM employee e JOIN department d"
				+ " ON e.DeptId = d.id"
				+ " WHERE e.id = ?";
		
		Connection conn = JDBCConnection.getConnection();
		
		PreparedStatement statement = conn.prepareStatement(sql);
		
		statement.setInt(1, id);
		
		ResultSet rs = statement.executeQuery();
		
		while (rs.next()) {
			
			rowMapper(rs);
		}
		
		return null;
	}

	@Override
	public void create(Employee e) throws SQLException {
		String sql = "INSERT INTO employee(name, age, DeptId) VALUES (?,?,?)";
		
		Connection conn = JDBCConnection.getConnection();
		
		PreparedStatement statement = conn.prepareStatement(sql);
		
		statement.setString(1, e.getName());
		statement.setInt(2, e.getAge());
		statement.setInt(3, e.getDepartment().getId());
		
		statement.executeUpdate();
		
	}

	@Override
	public boolean update(Employee employee) throws SQLException {
		String sql = "UPDATE employee SET name = ?, age = ?, DeptId = ? WHERE id = ?";
		Connection conn = JDBCConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(sql);
		
		statement.setString(1, employee.getName());
		statement.setInt(2, employee.getAge());
		statement.setInt(3, employee.getDepartment().getId());
		statement.setInt(4, employee.getId());
		
		int ex = statement.executeUpdate();

		return ex > 0;
	}

	@Override
	public boolean delete(int id) throws SQLException {
		String sql = "DELETE FROM employee WHERE id = ?";
		
		Connection conn = JDBCConnection.getConnection();
		
		PreparedStatement statement = conn.prepareStatement(sql);
		
		statement.setInt(1,id);
		
		return statement.executeUpdate() > 0;
	}

//	-----Hàm dùng chung để đọc employee từ bảng select ra-----
	private Employee rowMapper(ResultSet rs) throws SQLException {
		Employee employee = new Employee();
		employee.setId(rs.getInt("id"));
		employee.setName(rs.getString("name"));
		employee.setAge(rs.getInt("age"));
		
		//set department cho Employee
		Department department = new Department();
		department.setId(rs.getInt("DeptId"));
		department.setName(rs.getString("DeptName"));
		
		employee.setDepartment(department);
		return employee;
	}
	

}
