package nsotien_car.sevice;/*
java by nsotien tv .......
Name : nsotien
Time : 07:53
Date : 08/11/2022
*/

import nsotien_car.entity.Car;

import java.sql.SQLException;

public interface CarInterface {
    void input(Car c) ;
    void output(Car c) ;
    void createCar() throws SQLException ;
    void updateCar() throws SQLException ;
    void deleteCar() throws SQLException ;
    void searchCar() throws SQLException ;
    void readCar() throws SQLException;
}
