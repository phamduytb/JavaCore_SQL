package nsotien_dog.repository;/*
java by nsotien tv .......
Name : nsotien
Time : 09:05
Date : 08/11/2022
*/

import nsotien_car.entity.Car;
import nsotien_car.repository.JDBC;
import nsotien_dog.entity.Dog;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DogRepository {
    public void create(Dog d) throws SQLException {
        String sql = "INSERT INTO dog (id,name,weight,age) VALUES (?,?,?,?)";
        Connection connection = JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, d.getId());
        ps.setString(2, d.getName());
        ps.setFloat(3, d.getWeight());
        ps.setInt(4, d.getAge());
        ps.executeUpdate();
    }

    public void update(Dog d) throws SQLException {
        String sql = "UPDATE dog SET name = ?,weight = ?,age = ? WHERE id = ? ";
        Connection connection = JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, d.getName());
        ps.setFloat(2, d.getWeight());
        ps.setInt(3, d.getAge());
        ps.setInt(4, d.getId());
        ps.executeUpdate();
    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM dog WHERE id = ?";
        Connection connection = JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    public List<Dog> search(int id) throws SQLException {
        String sql = "SELECT * FROM dog WHERE id = ?";
        Connection connection = JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        List<Dog> dogList = new ArrayList<>();
        while (rs.next()) {
            Dog d = new Dog();
            d.setId(rs.getInt("id"));
            d.setName(rs.getString("name"));
            d.setWeight(rs.getFloat("weight"));
            d.setAge(rs.getInt("age"));
            dogList.add(d);
        }
        return dogList;
    }

    public List<Dog> read() throws SQLException {
        String sql = "SELECT * FROM dog";
        Connection connection = JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<Dog> dogList = new ArrayList<>();
        while (rs.next()) {
            Dog d = new Dog();
            d.setId(rs.getInt("id"));
            d.setName(rs.getString("name"));
            d.setWeight(rs.getFloat("weight"));
            d.setAge(rs.getInt("age"));
            dogList.add(d);
        }
        return dogList;
    }
}
