package nsotien_dog.main;/*
java by nsotien tv .......
Name : nsotien
Time : 09:04
Date : 08/11/2022
*/

import nsotien_dog.sevice.DogIml;

import java.sql.SQLException;
import java.util.Scanner;

public class MainDog {
    public static void main(String[] args) {
        while (true) {
            DogIml di = new DogIml();
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
                    di.createDog();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else if (luachon == 2) {
                try {
                    di.updateDog();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else if (luachon == 3) {
                try {
                    di.deleteDog();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else if (luachon == 4) {
                try {
                    di.searchDog();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else if (luachon == 5) {
                try {
                    di.readDog();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else if (luachon == 6) {
                break;
            }
        }
    }
}
