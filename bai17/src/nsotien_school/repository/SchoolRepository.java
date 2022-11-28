package nsotien_school.repository;/*
java by nsotien tv .......
Name : nsotien
Time : 10:05
Date : 08/11/2022
*/

import nsotien_school.entity.School;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SchoolRepository {
    public void create(School s) throws SQLException {
        String sql = "INSERT INTO school (id,name,address) VALUES (?,?,?)";
        Connection connection = JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, s.getId());
        ps.setString(2, s.getName());
        ps.setString(3, s.getAddress());
        ps.executeUpdate();
    }

    public void update(School s) throws SQLException {
        String sql = "UPDATE school SET name = ?,address = ? WHERE id = ?";
        Connection connection = JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, s.getName());
        ps.setString(2, s.getAddress());
        ps.setInt(3, s.getId());
        ps.executeUpdate();
    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM school WHERE id = ?";
        Connection connection = JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    public List<School> search(String name) throws SQLException {
        String sql = "SELECT * FROM school WHERE name LIKE ?";
        Connection connection = JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, "%" + name + "%");
        ResultSet rs = ps.executeQuery();
        List<School> schoolList = new ArrayList<>();
        while (rs.next()) {
            School s = new School();
            s.setId(rs.getInt("id"));
            s.setName(rs.getString("name"));
            s.setAddress(rs.getString("address"));
            schoolList.add(s);
        }
        return schoolList;
    }

    public List<School> read() throws SQLException {
        String sql = "SELECT * FROM school";
        Connection connection = JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<School> schoolList = new ArrayList<>();
        while (rs.next()) {
            School s = new School();
            s.setId(rs.getInt("id"));
            s.setName(rs.getString("name"));
            s.setAddress(rs.getString("address"));
            schoolList.add(s);
        }
        return schoolList;
    }
}
