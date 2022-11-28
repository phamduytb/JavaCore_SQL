package baitap.sevice;/*
java by nsotien tv .......
Name : nsotien
Time : 08:08
Date : 07/11/2022
*/

import baitap.entity.University;

import java.sql.SQLException;

public interface UniversityDao {
    void input(University u);

    void output(University u);

    void createUniversity(University u) throws SQLException; // thêm

    void updateUniversity(University u) throws SQLException; // sửa
    void deleteUniversity() throws SQLException; // xoá theo id

    void seachUniversity() throws SQLException; // tìm kiếm theo name

}
