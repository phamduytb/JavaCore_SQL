package nsotien_house.sevice;/*
java by nsotien tv .......
Name : nsotien
Time : 09:05
Date : 08/11/2022
*/

import nsotien_house.entity.House;

import java.sql.SQLException;

public interface HouseInterface {
    void input(House h);

    void output(House h);

    void createHouse() throws SQLException;

    void updateHouse() throws SQLException;

    void deleteHouse() throws SQLException;

    void searchHouse() throws SQLException;

    void readHouse() throws SQLException;

}
