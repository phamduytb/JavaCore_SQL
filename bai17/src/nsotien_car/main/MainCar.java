package nsotien_car.main;/*
java by nsotien tv .......
Name : nsotien
Time : 07:53
Date : 08/11/2022
*/

import nsotien_car.sevice.CarIml;

import java.sql.SQLException;
import java.util.Scanner;

public class MainCar {
    public static void main(String[] args) {
        while (true) {
            CarIml ci = new CarIml();
            System.err.println("menu ....");
            System.out.println("1.create ....");
            System.out.println("2.update ....");
            System.out.println("3.delete ....");
            System.out.println("4.search ....");
            System.out.println("5.read ....");
            System.out.println("6.out ....");
            int luachon = new Scanner(System.in).nextInt();
            if (luachon == 1) {
                try {
                    ci.createCar();
                } catch (SQLException e) {
                    e.printStackTrace();
                    System.out.println("nhap du lieu sai");
                }
            } else if (luachon == 2) {
                try {
                    ci.updateCar();
                } catch (SQLException e) {
                    e.printStackTrace();
                    System.out.println("nhap du lieu sai");
                }
            } else if (luachon == 3) {
                try {
                    ci.deleteCar();
                } catch (SQLException e) {
                    e.printStackTrace();
                    System.out.println("nhap du lieu sai");
                }
            } else if (luachon == 4) {
                try {
                    ci.searchCar();
                } catch (SQLException e) {
                    e.printStackTrace();
                    System.out.println("nhap du lieu sai");
                }
            } else if (luachon == 5) {
                try {
                    ci.readCar();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else if (luachon == 6) {
                break;
            }
        }
    }
}
