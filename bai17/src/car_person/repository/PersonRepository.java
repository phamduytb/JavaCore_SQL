package nsotien.car_person.repository;/*
java by nsotien tv .......
Name : nsotien
Time : 15:27
Date : 05/11/2022
*/

import nsotien.car_person.entity.Person;
import nsotien.car_person.repository.JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonRepository {
    // hàm tạo dữ liệu vào sql
    public void create(Person p) throws SQLException {
        String sql = "INSERT INTO person(id,name,age,country,birthdate) VALUES (?,?,?,?,?)";
        Connection connection = (Connection) nsotien_person.repository.JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, p.getId());
        ps.setString(2, p.getName());
        ps.setInt(3, p.getAge());
        ps.setString(4, p.getCountry());
        ps.setDate(5, new Date(p.getBirthdate().getTime()));
        ps.executeUpdate();
    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM person where id = ?";
        Connection connection = (Connection) nsotien_person.repository.JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    public void update(Person p) throws SQLException {
        String sql = "UPDATE person SET age = ? WHERE id = ?";
        Connection connection = (Connection) nsotien_person.repository.JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, p.getAge());
        ps.setInt(2, p.getId());
        ps.executeUpdate();
    }

    public List<Person> readAll() throws SQLException {
        String sql = "SELECT id,name,age,country,birthdate FROM person";
        Connection connection = (Connection) nsotien_person.repository.JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        // xuất thông tin bảng
        ResultSet rs = ps.executeQuery();
        // cponverd bảng thành danh sách trong java
        List<Person> personList = new ArrayList<>();
        while (rs.next()) {
            Person p = new Person();
            p.setId(rs.getInt("id"));
            p.setName(rs.getString("name"));
            p.setAge(rs.getInt("age"));
            p.setCountry(rs.getString("country"));
            p.setBirthdate(rs.getDate("birthdate"));

            personList.add(p);
        }
        return personList;
    }

    public List<Person> search(String s) throws SQLException {
        String sql = "SELECT id,name,age,country,birthdate FROM person WHERE name LIKE ?";
        Connection connection = (Connection) JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1,"%" + s + "%");
        // xuất thông tin bảng
        ResultSet rs = ps.executeQuery();
        // cponverd bảng thành danh sách trong java
        List<Person> personList = new ArrayList<>();
        while (rs.next()) {
            Person p = new Person();
            p.setId(rs.getInt("id"));
            p.setName(rs.getString("name"));
            p.setAge(rs.getInt("age"));
            p.setCountry(rs.getString("country"));
            p.setBirthdate(rs.getDate("birthdate"));

            personList.add(p);
        }
        return personList;
    }

    public Person getid(int id) throws SQLException {
        String sql = "SELECT * FROM person WHERE id = ?";
        Connection connection = (Connection) JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1,id);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Person p = new Person();
            p.setId(rs.getInt("id"));
            p.setName(rs.getString("name"));
            p.setAge(rs.getInt("age"));
            p.setCountry(rs.getString("country"));
            p.setBirthdate(rs.getDate("birthdate"));
            return p;
        }
        return null;
    }

}
