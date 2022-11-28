package nsotien.car_person.sevice;/*
java by nsotien tv .......
Name : nsotien
Time : 19:44
Date : 10/11/2022
*/

import nsotien.car_person.entity.Car;
import nsotien.car_person.repository.PersonRepository;
import nsotien.car_person.entity.Person;
import nsotien.car_person.repository.CarRepository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarImpl implements CarInterface {
    @Override
    public void input(Car c) throws SQLException {
        System.out.println("id : ");
        c.setId(new Scanner(System.in).nextInt());
        System.out.println("name : ");
        c.setName(new Scanner(System.in).nextLine());
        System.out.println("color : ");
        c.setColor(new Scanner(System.in).nextLine());
        System.out.println("price : ");
        c.setPrice(new Scanner(System.in).nextDouble());
        while (true) {
            System.out.println("person_id : ");
            int personID = new Scanner(System.in).nextInt();
            PersonRepository pr = new PersonRepository();
            Person owner = pr.getid(personID);
            if (owner != null) {
                c.setPersonOwner(owner);
            } else System.out.println("peron_id not found");
        }
    }


    @Override
    public void output(Car c) {
        System.out.println("id = " + c.getId());
        System.out.println("name = " + c.getName());
        System.out.println("color = " + c.getColor());
        System.out.println("price = " + c.getPrice());

        if (c.getPersonOwner() != null) {
            PersonIml pi = new PersonIml();
            pi.output(c.getPersonOwner());
        }
    }

    @Override
    public void createCar() throws SQLException {
        CarRepository cr = new CarRepository();
        Car c = new Car();
        input(c);
        cr.create(c);
    }

    @Override
    public void updateCar() throws SQLException {
        CarRepository cr = new CarRepository();
        Car c = new Car();
        input(c);
        cr.update(c);
    }

    @Override
    public void deleteCar() throws SQLException {
        CarRepository cr = new CarRepository();
        int id = new Scanner(System.in).nextInt();
        cr.delete(id);
    }

    public void readAllCar() throws SQLException {
        CarRepository cr = new CarRepository();
        List<Car> carList = cr.readAll();
        for (Car x : carList)
            output(x);
    }

    public void searchPriceCar() throws SQLException {
        CarRepository carRepository = new CarRepository();
        System.out.println("search price start (double) : ");
        double start = new Scanner(System.in).nextDouble();
        System.out.println("search price end (double) : ");
        double end = new Scanner(System.in).nextDouble();
        List<Car> carList = carRepository.searchPrice(start, end);
        for (Car x : carList)
            output(x);
    }
}
