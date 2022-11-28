package nsotien_dog.sevice;/*
java by nsotien tv .......
Name : nsotien
Time : 09:05
Date : 08/11/2022
*/

import nsotien_dog.entity.Dog;

import java.sql.SQLException;

public interface DogInterface {
    void input(Dog d);
    void output(Dog d);
    void createDog() throws SQLException ;
    void updateDog() throws SQLException ;
    void deleteDog() throws SQLException ;
    void searchDog() throws SQLException ;
    void readDog() throws SQLException ;

}
