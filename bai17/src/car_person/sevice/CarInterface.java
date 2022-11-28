package nsotien.car_person.sevice;/*
java by nsotien tv .......
Name : nsotien
Time : 19:42
Date : 10/11/2022
*/

import nsotien.car_person.entity.Car;

import java.sql.SQLException;

public interface CarInterface {
    void input(Car c) throws SQLException ;
    void output(Car c) ;

    void createCar() throws SQLException;
    void updateCar() throws SQLException;
    void deleteCar() throws SQLException;

}
