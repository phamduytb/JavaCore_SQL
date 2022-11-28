package nsotien_school.sevice;/*
java by nsotien tv .......
Name : nsotien
Time : 10:19
Date : 08/11/2022
*/

import nsotien_school.entity.School;

import java.sql.SQLException;

public interface SchoolInterface {
    void input(School s);

    void output(School s);

    void createSchool() throws SQLException;

    void updateSchool() throws SQLException;

    void deleteSchool() throws SQLException;

    void searchSchool() throws SQLException;

    void readSchool() throws SQLException;
}
