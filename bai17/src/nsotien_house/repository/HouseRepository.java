package nsotien_house.repository;/*
java by nsotien tv .......
Name : nsotien
Time : 09:05
Date : 08/11/2022
*/

import nsotien_car.repository.JDBC;
import nsotien_house.entity.House;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HouseRepository {
    public void create(House h) throws SQLException {
        String sql = "INSERT INTO house (id,name,color,address) VALUES (?,?,?,?)";
        Connection connection = JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, h.getId());
        ps.setString(2, h.getName());
        ps.setString(3, h.getColor());
        ps.setString(4, h.getAddress());
        ps.executeUpdate();
    }

    public void update(House h) throws SQLException {
        String sql = "UPDATE house SET name = ?,color = ?,address = ? WHERE id = ? ";
        Connection connection = JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, h.getName());
        ps.setString(2, h.getColor());
        ps.setString(3, h.getAddress());
        ps.setInt(4, h.getId());
        ps.executeUpdate();
    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM house WHERE id = ?";
        Connection connection = JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    public List<House> search(String address) throws SQLException {
        String sql = "SELECT * FROM house WHERE address LIKE ?";
        Connection connection = JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, "%" + address + "%");
        ResultSet rs = ps.executeQuery();
        List<House> houseList = new ArrayList<>();
        while (rs.next()) {
            House h = new House();
            h.setId(rs.getInt("id"));
            h.setName(rs.getString("name"));
            h.setColor(rs.getString("color"));
            h.setAddress(rs.getString("address"));
            houseList.add(h);
        }
        return houseList;
    }

    public List<House> read() throws SQLException {
        String sql = "SELECT * FROM house";
        Connection connection = JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<House> houseList = new ArrayList<>();
        while (rs.next()) {
            House h = new House();
            h.setId(rs.getInt("id"));
            h.setName(rs.getString("name"));
            h.setColor(rs.getString("color"));
            h.setAddress(rs.getString("address"));
            houseList.add(h);
        }
        return houseList;
    }
}
