package nsotien_dog.sevice;/*
java by nsotien tv .......
Name : nsotien
Time : 09:07
Date : 08/11/2022
*/

import nsotien_car.entity.Car;
import nsotien_car.repository.CarRepository;
import nsotien_dog.entity.Dog;
import nsotien_dog.repository.DogRepository;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class DogIml implements DogInterface {
    @Override
    public void input(Dog d) {
        System.out.println("id = ");
        d.setId(new Scanner(System.in).nextInt());
        System.out.println("name = ");
        d.setName(new Scanner(System.in).nextLine());
        System.out.println("weight = ");
        d.setWeight(new Scanner(System.in).nextFloat());
        System.out.println("age = ");
        d.setAge(new Scanner(System.in).nextInt());
    }

    @Override
    public void output(Dog d) {
        System.out.println("id :" + d.getId());
        System.out.println("name :" + d.getName());
        System.out.println("weight :" + d.getWeight());
        System.out.println("age :" + d.getAge());
    }

    @Override
    public void createDog() throws SQLException {
        DogRepository dr = new DogRepository();
        Dog d = new Dog();
        System.out.println("create info :");
        input(d);
        dr.create(d);
        System.err.println("create succeed");
    }

    @Override
    public void updateDog() throws SQLException {
        DogRepository dr = new DogRepository();
        Dog d = new Dog();
        System.out.println("update name,weight,age by id :");
        input(d);
        dr.update(d);
        System.err.println("update succeed");
    }

    @Override
    public void deleteDog() throws SQLException {
        DogRepository dr = new DogRepository();
        System.out.println("id delete :");
        int id = new Scanner(System.in).nextInt();
        dr.delete(id);
        System.err.println("delete succeed");
    }

    @Override
    public void searchDog() throws SQLException {
        DogRepository dr = new DogRepository();
        System.out.println("search id = ");
        int id = new Scanner(System.in).nextInt();
        System.out.println("infor have id " + id + " : ");
        List<Dog> dogList = dr.search(id);
        for (Dog x : dogList)
            output(x);
        System.err.println("search succeed");
    }

    @Override
    public void readDog() throws SQLException {
        DogRepository dr = new DogRepository();
        System.out.println("info dog = ");
        List<Dog> dogList = dr.read();
        for (Dog x : dogList)
            output(x);
    }
}
