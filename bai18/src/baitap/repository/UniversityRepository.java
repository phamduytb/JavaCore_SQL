package baitap.repository;/*
java by nsotien tv .......
Name : nsotien
Time : 08:48
Date : 07/11/2022
*/

import baitap.entity.University;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// thêm vào bảng
public class UniversityRepository {
    public void createU(University u) throws SQLException {
        String sql = "INSERT INTO university (id,name,address) VALUES (?,?,?)";
        Connection connection = JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, u.getId());
        ps.setString(2, u.getName());
        ps.setString(3, u.getAddress());
        ps.executeUpdate();
    }

    // sửa bảng
    public void updateU(University u) throws SQLException {
        String sql = "UPDATE university SET name = ? , address = ? WHERE id = ?";
        Connection connection = JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, u.getName());
        ps.setString(2, u.getAddress());
        ps.setInt(3, u.getId());
    }

    // xoá bảng theo id
    public void deleteU(int id) throws SQLException {
        String sql = "DELETE FROM university WHERE id = ?";
        Connection connection = JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    // tìm bảng theo name
    public List<University> searchU(String name) throws SQLException {
        String sql = "SELECT * FROM university WHERE name LIKE ?";
        Connection connection = JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, "%" + name + "%");

        // xuất thông tin bảng ra ngoài
        ResultSet rs = ps.executeQuery();
        // cponverd bảng thành danh sách
        List<University> universityList = new ArrayList<>();
        while (rs.next()) {
            University u = new University();
            u.setId(rs.getInt("id"));
            u.setName(rs.getString("name"));
            u.setAddress(rs.getString("address"));
            universityList.add(u);
        }
        return universityList;
    }

    // hàm bổ trợ quan hệ has - a
    public University getIdUniversity(int id) throws SQLException {
        String sql = "SELECT * FROM university WHERE id = ?";
        Connection connection = JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            University u = rowMapper(rs);
            return u;
        }

        return null;
    }

    // hàm bổ trợ quan hệ has - a
    private University rowMapper(ResultSet rs) throws SQLException {
        University u = new University();
        u.setId(rs.getInt("id"));
        u.setName(rs.getString("name"));
        u.setAddress(rs.getString("address"));

        return u;
    }

}
