package nsotien.main;

import nsotien.model.Car;
import nsotien.model.House;
import nsotien.model.Person;

public class MainCau1 {
    public static void main(String[] args) {
        Person p = new Person();
        p.input();

        House[] houseArr = new House[2];
        Car[] carArr = new Car[2];

        for (int i = 0; i < houseArr.length; i++) {
            System.out.println("addressHouse " + i);
            houseArr[i] = new House();
            houseArr[i].input();
            houseArr[i].setPerson(p);
        }

        for (int i = 0; i < carArr.length; i++) {
            System.out.println("model " + i);
            carArr[i] = new Car();
            carArr[i].input();
            carArr[i].setPerson(p);
        }
        System.out.println("information : ....");
        for (House h : houseArr) {
            h.getPerson().output();
            h.output();
            System.out.println("....");
        }
        for (Car c : carArr) {
            c.getPerson().output();
            c.output();
            System.out.println("....");
        }
    }
}
