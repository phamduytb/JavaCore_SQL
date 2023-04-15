package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConection {
	public static Connection getConnection() {
		final String user = "root";
		final String password = "duy123";
		
		
		final String url = "jdbc:mysql://localhost:3306/shopbanhang";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
//	public static void main(String[] args) {
//		getConnection();
//	}
}
