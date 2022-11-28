package nsotien_house.repository;/*
java by nsotien tv .......
Name : nsotien
Time : 09:05
Date : 08/11/2022
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {
    public static Connection getConnect() {
        String username = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/nsotien";
        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        getConnect();
        System.out.println("hi");
    }
}
