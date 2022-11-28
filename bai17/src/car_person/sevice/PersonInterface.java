package nsotien.car_person.sevice;/*
java by nsotien tv .......
Name : nsotien
Time : 16:07
Date : 05/11/2022
*/

import nsotien.car_person.entity.Person;

import java.sql.SQLException;

public interface PersonInterface {
    void input(Person p);

    void output(Person p);

    void createPerson() throws SQLException ;

    void deletePerson() throws SQLException;

    void updatePerson() throws SQLException;
    void readPerson() throws SQLException;

    void seachPerson() throws SQLException;
}
