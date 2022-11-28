package baitap.sevice;/*
java by nsotien tv .......
Name : nsotien
Time : 08:38
Date : 07/11/2022
*/

import baitap.entity.Student;
import baitap.entity.University;

import java.sql.SQLException;
import java.util.List;

public interface StudentDao {
    void input(Student s) throws SQLException;

    void output(Student s);

    void createStudent(Student s) throws SQLException; // thêm

    void updateStudent(Student s) throws SQLException; // sửa

    void deleteStudent() throws SQLException; // xoá

    void searchNameStudent() throws SQLException; // tìm kiếm theo name show student

    void searchAgeStudent() throws SQLException; // tìm kiếm theo age show student

    void searchNameUniversity() throws SQLException; // tìm kiếm name trường join 2 bảng

    void searchIDStudent() throws SQLException;  // tìm kiếm id student join 2 bảng


}
