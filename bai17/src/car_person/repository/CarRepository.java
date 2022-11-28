package nsotien.car_person.repository;/*
java by nsotien tv .......
Name : nsotien
Time : 19:30
Date : 10/11/2022
*/

import nsotien.car_person.entity.Car;
import nsotien.car_person.entity.Person;
import nsotien.car_person.repository.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CarRepository {
    public void create(Car c) throws SQLException {
        String sql = "INSERT INTO car (id,name,color,price,person_id) VALUES (?,?,?,?,?)";
        Connection connection = nsotien_car.repository.JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, c.getId());
        ps.setString(2, c.getName());
        ps.setString(3, c.getColor());
        ps.setDouble(4, c.getPrice());
        ps.setInt(5, c.getPersonOwner().getId());
        ps.executeUpdate();
    }

    public void update(Car c) throws SQLException {
        String sql = "UPDATE car SET name = ?,color = ?,price = ? WHERE id = ? ";
        Connection connection = nsotien_car.repository.JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, c.getName());
        ps.setString(2, c.getColor());
        ps.setDouble(3, c.getPrice());
        ps.setInt(4, c.getId());
        ps.executeUpdate();
    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM car WHERE id = ?";
        Connection connection = nsotien_car.repository.JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    public List<Car> search(String color) throws SQLException {
        String sql = "SELECT * FROM car WHERE color LIKE ?";
        Connection connection = nsotien_car.repository.JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, "%" + color + "%");
        ResultSet rs = ps.executeQuery();
        List<Car> carList = new ArrayList<>();
        while (rs.next()) {
            Car c = new Car();
            c.setId(rs.getInt("id"));
            c.setName(rs.getString("name"));
            c.setColor(rs.getString("color"));
            c.setPrice(rs.getDouble("prince"));
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
            c.setPrice(rs.getDouble("prince"));
            carList.add(c);
        }
        return carList;
    }

    public List<Car> readAll() throws SQLException {
        String sql = "SELECT c.id AS 'id_car',c.name AS 'name_car',c.color,c.price,p.id FROM car c INNER JOIN person p ON c.person_id = p.id;";
        Connection connection = JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<Car> carList = new ArrayList<>();
        while (rs.next()) {
            Person p = new Person();
            p.setId(rs.getInt("id"));
            p.setName(rs.getString("name"));
            p.setAge(rs.getInt("age"));
            p.setCountry(rs.getString("country"));
            p.setBirthdate(rs.getDate("birthdate"));


            Car c = new Car();
            c.setId(rs.getInt("id_car"));
            c.setName(rs.getString("name_car"));
            c.setColor(rs.getString("color"));
            c.setPrice(rs.getDouble("price"));
            c.setPersonOwner(p);
            carList.add(c);
        }
        return carList;
    }

    // chỉ xuất những price car  có id_person 
    public List<Car> searchPrice(double start, double end) throws SQLException {
        String sql = "SELECT c.id AS 'id_car',c.name AS 'name_car',c.color,c.price,p.* FROM car c INNER JOIN person p ON c.person_id = p.id WHERE c.price >= ? AND c.price <= ?";
        Connection connection = JDBC.getConnect();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setDouble(1, start);
        preparedStatement.setDouble(2, end);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Car> carList = new ArrayList<>();
        while (resultSet.next()) {

            Person p = new Person();
            p.setId(resultSet.getInt("id"));
            p.setName(resultSet.getString("name"));
            p.setAge(resultSet.getInt("age"));
            p.setCountry(resultSet.getString("country"));
            p.setBirthdate(resultSet.getDate("birthdate"));

            Car c = new Car();
            c.setId(resultSet.getInt("id_car"));
            c.setName(resultSet.getString("name_car"));
            c.setColor(resultSet.getString("color"));
            c.setPrice(resultSet.getDouble("price"));
            c.setPersonOwner(p);
            carList.add(c);
        }
        return carList;
    }
}


