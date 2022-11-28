package nsotien_car.sevice;/*
java by nsotien tv .......
Name : nsotien
Time : 07:54
Date : 08/11/2022
*/

import nsotien_car.entity.Car;
import nsotien_car.repository.CarRepository;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class CarIml implements CarInterface {
    @Override
    public void input(Car c) {
        System.out.println("id = ");
        c.setId(new Scanner(System.in).nextInt());
        System.out.println("name = ");
        c.setName(new Scanner(System.in).nextLine());
        System.out.println("color = ");
        c.setColor(new Scanner(System.in).nextLine());
        System.out.println("prince = ");
        c.setPrince(new Scanner(System.in).nextDouble());
    }

    @Override
    public void output(Car c) {
        System.out.println("id :" + c.getId());
        System.out.println("name :" + c.getName());
        System.out.println("color :" + c.getColor());
        System.out.println("prince :" + c.getPrince());
    }

    @Override
    public void createCar() throws SQLException {
        CarRepository cr = new CarRepository();
        Car c = new Car();
        System.out.println("create info :");
        input(c);
        cr.create(c);
        System.err.println("create succeed");
    }

    @Override
    public void updateCar() throws SQLException {
        CarRepository cr = new CarRepository();
        Car c = new Car();
        System.out.println("update name,color,prine :");
        input(c);
        cr.update(c);
        System.err.println("update succeed");
    }

    @Override
    public void deleteCar() throws SQLException {
        CarRepository cr = new CarRepository();
        System.out.println("id delete :");
        int id = new Scanner(System.in).nextInt();
        cr.delete(id);
        System.err.println("delete succeed");
    }

    @Override
    public void searchCar() throws SQLException {
        CarRepository cr = new CarRepository();
        System.out.println("search color = ");
        String color = new Scanner(System.in).nextLine();
        System.out.println("infor have color " + color + " : ");
        List<Car> carList = cr.search(color);
        for (Car x : carList)
            output(x);
        System.err.println("search succeed");
    }

    @Override
    public void readCar() throws SQLException {
        CarRepository cr = new CarRepository();
        System.out.println("infor car :");
        List<Car> carList = cr.read();
        for (Car x : carList)
            output(x);
    }

}
