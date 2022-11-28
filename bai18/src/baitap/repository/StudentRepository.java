package baitap.repository;/*
java by nsotien tv .......
Name : nsotien
Time : 14:44
Date : 07/11/2022
*/

import baitap.entity.Student;
import baitap.entity.University;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    // thêm
    public void createS(Student s) throws SQLException {
        String sql = "INSERT INTO student (id,name,age,university_id) VALUES (?,?,?,?)";
        Connection connection = JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, s.getId());
        ps.setString(2, s.getName());
        ps.setInt(3, s.getAge());
        ps.setInt(4, s.getUniversity().getId());

        ps.executeUpdate();
    }
    // sửa

    public void updateS(Student s) throws SQLException {
        String sql = "UPDATE student SET name = ? WHERE id = ?";
        Connection connection = JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, s.getName());
        ps.setInt(2, s.getId());
        ps.executeUpdate();
    }

    // xoá
    public void deleteS(int id) throws SQLException {
        String sql = "DELETE FROM student WHERE id = ?";
        Connection connection = JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    // tìm theo tên học sinh
    public List<Student> seachNameS(String name) throws SQLException {
        String sql = "SELECT * FROM student WHERE name LIKE ?";
        Connection connection = JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, "%" + name + "%");
        // xuất thông tin bảng ra ngoài
        ResultSet rs = ps.executeQuery();
        // cponverd bảng thành danh sách
        List<Student> studentList = new ArrayList<>();
        while (rs.next()) {
            Student s = new Student();
            s.setId(rs.getInt("id"));
            s.setName(rs.getString("name"));
            s.setAge(rs.getInt("age"));
            studentList.add(s);
        }
        return studentList;
    }

    // tìm theo tuổi học sinh
    public List<Student> seachAgeS(int age) throws SQLException {
        String sql = "SELECT * FROM student WHERE age = ?";
        Connection connection = JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, age);
        // xuất thông tin bảng ra ngoài
        ResultSet rs = ps.executeQuery();
        // cponverd bảng thành danh sách
        List<Student> studentList = new ArrayList<>();
        while (rs.next()) {
            Student s = new Student();
            s.setId(rs.getInt("id"));
            s.setName(rs.getString("name"));
            s.setAge(rs.getInt("age"));
            studentList.add(s);
        }
        return studentList;
    }

    // tìm theo id học sinh john 2 bảng trường với học sinh
    public List<Student> getidS(int idS) throws SQLException {
        String sql = "SELECT student.id,student.name AS name_student,student.age,university.name AS name_university,university.address " +
                "FROM student INNER JOIN university ON student.university_id = university.id WHERE student.id = ?";
        Connection connection = JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, idS);
        ResultSet rs = ps.executeQuery();
        List<Student> studentList = new ArrayList<>();
        while (rs.next()) {
            Student s = rowMapper(rs);
            studentList.add(s);
        }
        return studentList;

    }

    // tìm theo name trường john 2 bảng trường với học sinh
    public List<Student> getNameU(String nameU) throws SQLException {
        String sql = "SELECT student.id,student.name AS name_student,student.age,university.name AS name_university,university.address " +
                "FROM student INNER JOIN university ON student.university_id = university.id WHERE university.name LIKE ?";
        Connection connection = JDBC.getConnect();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, "%" + nameU + "%");
        ResultSet rs = ps.executeQuery();
        List<Student> studentList = new ArrayList<>();
        while (rs.next()) {
            Student s = rowMapper(rs);
            studentList.add(s);
        }
        return studentList;
    }

    private Student rowMapper(ResultSet rs) throws SQLException {


        University u = new University();
        u.setId(rs.getInt("id"));
        u.setName(rs.getString("name_university"));
        u.setAddress(rs.getString("address"));


        Student s = new Student();
        s.setId(rs.getInt("id"));
        s.setName(rs.getString("name_student"));
        s.setAge(rs.getInt("age"));
        s.setUniversity(u);
        return s;
    }
}
