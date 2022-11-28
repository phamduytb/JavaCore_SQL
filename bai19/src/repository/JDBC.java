package repository;/*
java by nsotien tv .......
Name : nsotien
Time : 16:06
Date : 21/11/2022
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {


    public static Connection getConnect() throws SQLException {
        String username = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/nsotien";
        return DriverManager.getConnection(url, username, password);
    }

    public static void main(String[] args) {
        try {
            getConnect();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("hihi");
    }


}
