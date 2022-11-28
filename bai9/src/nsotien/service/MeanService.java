package nsotien.service;

import nsotien.model.Car;
import nsotien.model.Means;
import nsotien.model.Train;

import java.util.Scanner;

public class MeanService {
    public void input(Means m) {
        System.out.println("price :");
        m.setPrice(new Scanner(System.in).nextDouble());
        System.out.println("seats :");
        m.setSeats(new Scanner(System.in).nextInt());

        if (m instanceof Train) {
            Train t = (Train) m;
            System.out.println("cars :");
            t.setCars(new Scanner(System.in).nextInt());
        }
        if (m instanceof Car) {
            Car c = (Car) m;
            System.out.println("nameCar :");
            c.setNameCar(new Scanner(System.in).nextLine());
        }
    }

    public void output(Means m) {
        System.out.println("information");
        System.out.println("price = " + m.getPrice());
        System.out.println("seats = " + m.getSeats());

        if (m instanceof Train) {
            Train t = (Train) m;
            System.out.println("cars = " + t.getCars());
        }
        if (m instanceof Car) {
            Car c = (Car) m;
            System.out.println("namecar = " + c.getNameCar());
        }
    }

}
