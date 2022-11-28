package nsotien_car.repository;/*
java by nsotien tv .......
Name : nsotien
Time : 07:53
Date : 08/11/2022
*/

import nsotien_car.entity.Car;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarRepository {
    public void create(Car c) throws SQLException {
        String sql = "INSERT INTO car (id,name,color,prince) VALUES (?,?,?,?)";
        Connection connection = JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, c.getId());
        ps.setString(2, c.getName());
        ps.setString(3, c.getColor());
        ps.setDouble(4, c.getPrince());
        ps.executeUpdate();
    }

    public void update(Car c) throws SQLException {
        String sql = "UPDATE car SET name = ?,color = ?,prince = ? WHERE id = ? ";
        Connection connection = JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, c.getName());
        ps.setString(2, c.getColor());
        ps.setDouble(3, c.getPrince());
        ps.setInt(4, c.getId());
        ps.executeUpdate();
    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM car WHERE id = ?";
        Connection connection = JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    public List<Car> search(String color) throws SQLException {
        String sql = "SELECT * FROM car WHERE color LIKE ?";
        Connection connection = JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, "%" + color + "%");
        ResultSet rs = ps.executeQuery();
        List<Car> carList = new ArrayList<>();
        while (rs.next()) {
            Car c = new Car();
            c.setId(rs.getInt("id"));
            c.setName(rs.getString("name"));
            c.setColor(rs.getString("color"));
            c.setPrince(rs.getDouble("prince"));
            carList.add(c);
        }
        return carList;
    }

    public List<Car> read() throws SQLException {
        String sql = "SELECT * FROM car";
        Connection connection = JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<Car> carList = new ArrayList<>();
        while (rs.next()) {
            Car c = new Car();
            c.setId(rs.getInt("id"));
            c.setName(rs.getString("name"));
            c.setColor(rs.getString("color"));
            c.setPrince(rs.getDouble("prince"));
            carList.add(c);
        }
        return carList;
    }
}
