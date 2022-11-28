package nsotien.car_person.main;/*
java by nsotien tv .......
Name : nsotien
Time : 20:15
Date : 10/11/2022
*/

import nsotien.car_person.sevice.CarImpl;

import java.sql.SQLException;
import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        while (true) {
            System.err.println("menu...");
            System.out.println("1.create car");
            System.out.println("2.update car");
            System.out.println("3.delete car");
            System.out.println("4.read car + person");
            System.out.println("5.search price");
            System.out.println("6.out");
            CarImpl ci = new CarImpl();
            int luaChon = new Scanner(System.in).nextInt();
            try {
                if (luaChon == 1) {
                    System.out.println("create info :");
                    ci.createCar();
                    System.err.println("create succeed");
                } else if (luaChon == 2) {
                    System.out.println("update name,color,prine :");
                    ci.updateCar();
                    System.err.println("update succeed");
                } else if (luaChon == 3) {
                    System.out.println("id car delete :");
                    ci.deleteCar();
                    System.err.println("delete succeed");
                } else if (luaChon == 4) {
                    System.out.println("infor car + person = ");
                    ci.readAllCar();
                    System.err.println("read succeed");
                } else if (luaChon == 5) {
                    ci.searchPriceCar();
                    System.err.println("search succeed");
                } else if (luaChon == 6) {
                    break;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
